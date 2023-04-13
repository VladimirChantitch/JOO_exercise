package com.bank.Servives;

import java.util.List;
import java.util.Scanner;

import com.bank.User;
import com.bank.Cruds.UserCrud;

import com.bank.Servives.DbHelper;

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
        List<User> users = DbHelper.getInstance().userCrud.findAllUsers();
        if (users.size() <= 0){
            System.out.println("you've got no users lets create one shall we");
            CreateNewUser();
        }

        User user = null;
        do{
            System.out.println("Whats the id of your user ? [secureBank.com]");
            try {
                Scanner sc = new Scanner(System.in); 
                Integer id = sc.nextInt();
        
                user = DbHelper.getInstance().userCrud.findUserById(id);
            }catch(Exception e){
                e.printStackTrace();
            }
        }while(user == null);

        do{
            System.out.println("Whats the current balance of this individual's account ?");
            try {
                Scanner sc = new Scanner(System.in); 
                Integer balance = sc.nextInt();
        
                user = DbHelper.getInstance().userCrud.findUserById(id);
            }catch(Exception e){
                e.printStackTrace();
            }
        }while(user == null);
    }

    public void CreateNewUser(){
        System.out.println("What s the firstname of your user ?");
        Scanner sc = new Scanner(System.in); 
        String firstName = sc.nextLine();
        System.out.println("What s the lastName of your user ?");
        String lastName = sc.nextLine();

        User user = new User(firstName, lastName);

        DbHelper.getInstance().userCrud.insertUser(user);
    }

    public void TransfertMoney(){

    }

    public void DeleteUser(){

    }

    public void DeleteAccount(){

    }
}
