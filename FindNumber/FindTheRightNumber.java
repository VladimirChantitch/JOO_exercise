package Java_Projects.FindNumber;

import java.security.SecureRandom;
import java.util.Scanner;

public class FindTheRightNumber {
    public static void main(String[] args) {
        GuessTheNumber();
    }

    public static void GuessTheNumber(){
        Integer magicNumber = GetAMagicNumber();

        System.out.println("Ok lets see how fast you are going to find this number");

        Integer guessInteger = 0;
        do{
            Scanner sc = new Scanner(System.in); 
            try{
                guessInteger = (Integer)sc.nextInt();
                if (guessInteger > magicNumber){
                    System.out.println("A bit lower chill out please !!");
                }
                else if (guessInteger < magicNumber) {
                    System.out.println("A bit higher chill up please !!");
                }
            }
            catch(Exception e){

            }         
        }while(guessInteger != magicNumber);

        System.out.println("GG WP !!");
    }

    public static Integer GetAMagicNumber(){
        SecureRandom rand = new SecureRandom();
        return rand.nextInt(100);
    }
}
