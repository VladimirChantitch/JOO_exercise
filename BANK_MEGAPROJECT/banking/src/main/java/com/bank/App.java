package com.bank;

import java.util.Scanner;

import com.bank.Servives.BankService;
import com.bank.Servives.DbHelper;

public class App 
{
    static Integer minOption;
    static Integer maxOption;
    static boolean isQuitting = false;

    public static void main( String[] args )
    {
        ControlPanelHandler();
    }

    private static void ControlPanelHandler(){
        Integer controlInteger = 0;
        do{
            PrintControlPanel();
            Scanner sc = new Scanner(System.in); 
            try{
                controlInteger = (Integer)sc.nextInt();
                switch (controlInteger) {
                    case 1:
                        BankService.getInstance().CreateNewAccount();
                        break;
                    case 2:
                        BankService.getInstance().CreateNewUser();
                        break;
                    case 3:
                        BankService.getInstance().TransfertMoney();
                        break;
                    case 4:
                        BankService.getInstance().DeleteUser();
                        break;
                    case 5:
                        BankService.getInstance().DeleteAccount();
                        break;
                    case 6:
                        isQuitting = true;
                        break;
                }
            }
            catch(Exception e){

            }      
        }while(!isQuitting);
    }

    private static void PrintControlPanel(){
        System.out.println("Hello there this is the control panel of bank.io ");
        System.out.println("1 - to create a new account ");
        System.out.println("2 - to create a new user ");
        System.out.println("3 - to send money from an user account to another ");
        System.out.println("4 - to delete a user");
        System.out.println("5 - to delete an account ");
        System.out.println("6 - to close app ");
    }
}
