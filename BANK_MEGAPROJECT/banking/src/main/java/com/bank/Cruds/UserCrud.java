package com.bank.Cruds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.bank.User;
import com.bank.Cruds.CrudsInterfaces.ICrud;
import com.bank.Servives.DbHelper;

public class UserCrud implements ICrud<User>{
    public UserCrud(){

    }

    public void insert(User user) {
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
            try  {
                String insertUser = "INSERT INTO users (first_name, last_name) VALUES (?, ?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insertUser);
                preparedStatement.setString(1, user.firstName); 
                preparedStatement.setString(2, user.lastName);

                ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int accountId = generatedKeys.getInt(1);
                    System.out.println("UserID: " + accountId);
                }
                
                int result = preparedStatement.executeUpdate();
                
                if (result > 0) {
                    System.out.println("Success.");
                } else {
                    System.out.println("Error.");
                }
            } catch (Exception e){
                e.printStackTrace();
            } finally{
                DbHelper.Instance.closeConnection(null);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public User findById(Integer id){
        try{
            String getUser = "SELECT * FROM users WHERE id = ?";
            Connection connection = DbHelper.Instance.GetConnectToDb();
            try  {
                PreparedStatement preparedStatement = connection.prepareStatement(getUser);
                preparedStatement.setString(1, id.toString());                      
                ResultSet result = preparedStatement.executeQuery();
                result.next();

                return new User(result.getInt("id"),
                                result.getString("first_name"),
                                (result.getString("last_name"))
                );         
            } catch (Exception e) {
                e.printStackTrace();
            } finally{
                DbHelper.Instance.closeConnection(null);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
            return null;
        }

    public List<User> findAll(){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
        return null;
    }

    public void update(User user){
        try{
            String getUser = "UPDATE users SET first_name = ?, last_name = ? WHERE id = ?";
            Connection connection = DbHelper.Instance.GetConnectToDb();
            try  {
                PreparedStatement preparedStatement = connection.prepareStatement(getUser);
                preparedStatement.setString(1, user.firstName.toString());
                preparedStatement.setString(1, user.lastName.toString());       
                preparedStatement.setString(1, user.id.toString());       

                ResultSet result = preparedStatement.executeQuery();
                result.next();
      
            } catch (Exception e) {
                e.printStackTrace();
            } finally{
                DbHelper.Instance.closeConnection(null);
            }
        } catch(Exception e){
            e.printStackTrace();
        }       
    }

    public void deleteById(Integer id){
        try{
            String getUser = "DELETE FROM users WHERE id = ?";
            Connection connection = DbHelper.Instance.GetConnectToDb();
            try  {
                PreparedStatement preparedStatement = connection.prepareStatement(getUser);
                preparedStatement.setString(1, id.toString());

                preparedStatement.executeQuery();    
            } catch (Exception e) {
                e.printStackTrace();
            } finally{
                DbHelper.Instance.closeConnection(null);
            }
        } catch(Exception e){
            e.printStackTrace();
        }   
    }
}
