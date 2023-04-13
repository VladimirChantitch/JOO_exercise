package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Cruds;

import java.sql.Connection;
import java.util.List;

import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.BankAccount;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives.DbHelper;

public class AccountCrud {
    public void InsertAccount(BankAccount bankAccount){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return;
        }
        
    }

    public BankAccount GetBankAccount(){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return null;
        }
        return null;
    }

    public List<BankAccount> GetAllBankAccounts(){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return null;
        }
        return null;
    }

    public void UpdateAccount(AccountCrud user){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return;
        }
    }

    public void DeleteBankAccount(Integer id){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return;
        }
    }
}
