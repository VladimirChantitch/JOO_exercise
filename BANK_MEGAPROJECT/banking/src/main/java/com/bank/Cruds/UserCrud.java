package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Cruds;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.User;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives.DbHelper;

public class UserCrud {
    public UserCrud(){

    }

    public void InsertUser(User user){
        String insertUser = "INSERT INTO users (first_name, last_name) VALUES (?, ?)";
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return;
        }
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertUser)) {
            preparedStatement.setString(1, user.firstName); 
            preparedStatement.setString(2, user.lastName);
            
            int result = preparedStatement.executeUpdate();
            
            if (result > 0) {
                System.out.println("Success.");
            } else {
                System.out.println("Error.");
            }
        } catch (Exception e) {
            
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

    public void UpdateUser(User user){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return;
        }
    }

    public void DeleteUser(Integer id){
        Connection connection = DbHelper.Instance.GetConnectToDb();
        if (connection == null){
            return;
        }
    }
}
