package com.bank.Cruds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.bank.BankAccount;
import com.bank.Cruds.CrudsInterfaces.ICrud;
import com.bank.Servives.DbHelper;

public class AccountCrud implements ICrud<BankAccount> {


    public void insert(BankAccount bankAccount){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
            try  {
                String insertUser = "INSERT INTO accounts (balance) VALUES (?)";

                PreparedStatement preparedStatement = connection.prepareStatement(insertUser);
                preparedStatement.setString(1, bankAccount.balance.toString()); 
                
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

    public BankAccount findById(Integer id){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
        return null;
    }

    public List<BankAccount> findAll(){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
        return null;
    }

    public void update(BankAccount obj){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
    }

    public void deleteById(Integer id){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
    }
}
