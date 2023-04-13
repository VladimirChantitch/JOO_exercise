package com.bank.Cruds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.bank.BankAccount;
import com.bank.Servives.DbHelper;

public class AccountCrud {
    public void insertAccount(BankAccount bankAccount){
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

    public BankAccount findBankAccount(){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
        return null;
    }

    public List<BankAccount> findAllBankAccounts(){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
        return null;
    }

    public void updateAccount(AccountCrud user){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
    }

    public void deleteBankAccount(Integer id){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
    }
}
