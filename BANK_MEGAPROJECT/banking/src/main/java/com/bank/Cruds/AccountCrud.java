package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Cruds;

import java.sql.Connection;
import java.util.List;

import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.BankAccount;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives.DbHelper;

public class AccountCrud {
    public void InsertAccount(BankAccount bankAccount){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }      
    }

    public BankAccount GetBankAccount(){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
        return null;
    }

    public List<BankAccount> GetAllBankAccounts(){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
        return null;
    }

    public void UpdateAccount(AccountCrud user){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
    }

    public void DeleteBankAccount(Integer id){
        try{
            Connection connection = DbHelper.Instance.GetConnectToDb();
        }catch(Exception e){

        }   
    }
}
