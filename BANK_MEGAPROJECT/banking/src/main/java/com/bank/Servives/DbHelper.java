package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.BankAccount;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.User;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Cruds.AccountCrud;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Cruds.UserCrud;

public class DbHelper {
    public static DbHelper Instance;
    public UserCrud userCrud;
    public AccountCrud accountCrud;

    private DbHelper(){
        Instance = this;

        CreateDB();
    }

    public static DbHelper getInstance(){
        if (Instance == null){
            new DbHelper();
        }
        return Instance;
    }

    private void CreateDB(){
        Connection connection = GetConnectToDb();
        try{
            Statement stmt_1 = connection.createStatement();
            String createUserTable = new StringBuilder("CREATE TABLE IF NOT EXISTS users (")
                                        .append("id INTEGER PRIMARY KEY,")
                                        .append("first_name TEXT,")
                                        .append("last_name TEXT,")
                                        .append("account_id INTEGER,")
                                        .append("FOREIGN KEY (account_id) REFERENCES countries(id)")
                                        .append(")")
                                        .toString();
            stmt_1.executeUpdate(createUserTable);

            Statement stmt_2 = connection.createStatement();
            String createAccountTable = new StringBuilder("CREATE TABLE IF NOT EXISTS accounts (")
                                            .append("id INTEGER PRIMARY KEY,")
                                            .append("balance INTEGER")
                                            .append(")")
                                            .toString();

            stmt_2.executeUpdate(createAccountTable);
        }catch(Exception e){

        }
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Connection GetConnectToDb(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:sqlite:test.db");
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
