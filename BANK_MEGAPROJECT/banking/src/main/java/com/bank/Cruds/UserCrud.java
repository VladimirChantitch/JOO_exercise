package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Cruds;

import java.sql.Connection;
import java.util.List;

import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.User;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives.DbHelper;

public class UserCrud {
    public UserCrud(){
        
    }

    public void InsertUser(User user){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return;
        }
    }

    public User GetUser(Integer id){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return null;
        }
        return null;
    }

    public List<User> GetAllUsers(){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return null;
        }
        return null;
    }

    public void DeleteUser(Integer id){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return;
        }
    }
}
