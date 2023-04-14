package com.bank.Servives;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.bank.BankAccount;
import com.bank.User;
import com.bank.Cruds.AccountCrud;
import com.bank.Cruds.UserCrud;

public class DbHelper {
    public static DbHelper Instance;
    public UserCrud userCrud;
    public AccountCrud accountCrud;

    private DbHelper(){
        Instance = this;
        userCrud = new UserCrud();
        accountCrud = new AccountCrud();
        CreateDB();
    }

    public static DbHelper getInstance(){
        if (Instance == null){
            new DbHelper();
        }
        
        return Instance;
    }

    private void CreateDB(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection connection = GetConnectToDb();

            Statement stmt_2 = connection.createStatement();
            String createAccountTable = new StringBuilder("CREATE TABLE IF NOT EXISTS accounts (")
                                            .append("id INTEGER AUTO_INCREMENT PRIMARY KEY,")
                                            .append("balance INTEGER")
                                            .append(")")
                                            .toString();

            Statement stmt_1 = connection.createStatement();
            String createUserTable = new StringBuilder("CREATE TABLE IF NOT EXISTS users (")
                                        .append("id INTEGER AUTO_INCREMENT PRIMARY KEY,")
                                        .append("first_name VARCHAR(50),")
                                        .append("last_name VARCHAR(50),")
                                        .append("account_id INTEGER,")
                                        .append("FOREIGN KEY (account_id) REFERENCES accounts(id)")
                                        .append(")")
                                        .toString();

            stmt_2.executeUpdate(createAccountTable);
            stmt_1.executeUpdate(createUserTable);

            stmt_1.close();
            stmt_2.close();
            connection.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static final String DB_URL = "bankio.db"; 
    static final String JDBC_DRIVER = "org.sqlite.JDBC";  

    public Connection GetConnectToDb() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:" + DB_URL);
    }

    public void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
