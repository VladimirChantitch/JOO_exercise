package Java_Projects.SumToANumber;

import java.util.Scanner;

public class SumToANumber {
    public static void main(String[] args) {
        getSumToANumber();
    }

    public static void getSumToANumber(){
        Integer integerInput = -1; 
        do{
            System.out.println("Please enter a int between 0 and 10 000 to set the number to sum");
            Scanner sc = new Scanner(System.in); 
            try{
                integerInput = (Integer)sc.nextInt();
            }
            catch(Exception e){

            }
        } while(integerInput > 10000 || integerInput < 0);

        Integer buffer = 0;
        for (int i = 1; i < integerInput + 1; i++){
            buffer += i;
        }

        System.out.println(new StringBuilder("The total sum is :: ").append(buffer));
    }
}
