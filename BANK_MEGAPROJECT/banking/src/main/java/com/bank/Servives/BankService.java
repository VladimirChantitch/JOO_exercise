package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives;

import java.util.Scanner;

import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.User;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Cruds.UserCrud;

public class BankService {
    public static BankService Instance = null;

    private BankService(){
        Instance = this;
    }

    public static BankService getInstance(){
        if (Instance == null){
            new BankService();
        }

        return Instance;
    }

    public void CreateNewAccount(){

    }

    public void CreateNewUser(){
        System.out.println("What s the firstname of your user ?");
        Scanner sc = new Scanner(System.in); 
        String firstName = sc.nextLine();
        System.out.println("What s the lastName of your user ?");
        String lastName = sc.nextLine();

        User user = new User(firstName, lastName);

        DbHelper.getInstance().userCrud.InsertUser(user);

        User user_test =  DbHelper.getInstance().userCrud.GetUser(user.id);
        System.out.println(user.firstName);
    }

    public void TransfertMoney(){

    }

    public void DeleteUser(){

    }

    public void DeleteAccount(){

    }
}
