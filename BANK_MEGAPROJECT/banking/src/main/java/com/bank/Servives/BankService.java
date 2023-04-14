package com.bank.Servives;

import java.util.List;
import java.util.Scanner;

import com.bank.BankAccount;
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
        List<User> users = DbHelper.getInstance().userCrud.findAll();
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
        
                user = DbHelper.getInstance().userCrud.findById(id);
            }catch(Exception e){
                e.printStackTrace();
            }
        }while(user == null);

        do{
            System.out.println("Whats the current balance of this individual's account ?");
            try {
                Scanner sc = new Scanner(System.in); 
                Integer balance = sc.nextInt();
        
                BankAccount bankAccount = new BankAccount(balance);
                DbHelper.getInstance().userCrud.update(user);  
                
                user.account_id = bankAccount.id;
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

        DbHelper.getInstance().userCrud.insert(user);
    }

    public void TransfertMoney(){
        System.out.println("come back someday --NOT IMPLEMENTED--");
        //TODO: check if there is at least two bank account in the bank
        //TODO: ask amount
        //TODO: ask from account
        //TODO: ask To account
    }

    public void DeleteUser(){
        
    }

    public void DeleteAccount(){

    }
}
