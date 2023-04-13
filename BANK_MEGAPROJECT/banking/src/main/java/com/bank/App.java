package Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank;

import java.util.Scanner;

import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives.BankService;
import Java_Projects.BANK_MEGAPROJECT.banking.src.main.java.com.bank.Servives.DbHelper;

public class App 
{
    static BankService bankService = null;
    static Integer minOption;
    static Integer maxOption;
    static boolean isQuitting = false;
    public static void main( String[] args )
    {
        new DbHelper();
        bankService = new BankService();
        ControlPanelHandler();
    }

    private static void ControlPanelHandler(){
        Integer controlInteger = 0;
        do{
            PrintControlPanel();
            Scanner sc = new Scanner(System.in); 
            try{
                controlInteger = (Integer)sc.nextInt();
                if(controlInteger == 6){
                    return;
                }
                if (controlInteger >= minOption && controlInteger <= maxOption ){
                    HandleInput(controlInteger);
                }
            }
            catch(Exception e){

            }     
            System.out.println(controlInteger);    
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

    private static void HandleInput(Integer controlInput){
        switch (controlInput) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
        }
    }
}
