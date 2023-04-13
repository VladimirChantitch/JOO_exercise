package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Cruds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.User;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives.DbHelper;

public class UserCrud {
    public UserCrud(){

    }

    public void InsertUser(User user){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
            
            try  {
                String insertUser = "INSERT INTO users (first_name, last_name) VALUES (?, ?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insertUser);
                preparedStatement.setString(1, user.firstName); 
                preparedStatement.setString(2, user.lastName);
                
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

    public User GetUser(Integer id){
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

    public List<User> GetAllUsers(){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
        return null;
    }

    public void UpdateUser(User user){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
    }

    public void DeleteUser(Integer id){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
    }
}
