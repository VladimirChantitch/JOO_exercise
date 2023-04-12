package Java_Projects.PairImpair;

import java.util.Scanner;

public class PairOrImpair {
    public static void main(String[] args) {
        PairOrImpairOrPremier();
    }

    private static void PairOrImpairOrPremier(){
        Integer integerInput = 0; 
        boolean isGood = false;
        do{
            System.out.println("Please enter an int");
            Scanner sc = new Scanner(System.in); 
            try{
                integerInput = (Integer)sc.nextInt();
                isGood = true;
            }
            catch(Exception e){
                isGood = false;
            }
        }
        while(isGood != true);

        if (IsPremier(integerInput)){
            System.out.println(new StringBuilder("The number ").append(integerInput).append(" is Premier"));
        }else if (IsEven(integerInput)){
            System.out.println(new StringBuilder("The number ").append(integerInput).append(" is Even"));
        }else{
            System.out.println(new StringBuilder("The number ").append(integerInput).append(" is Odd"));
        }
    }

    private static boolean IsPremier(Integer integerInput){
        for (int i = 5; i <= Math.sqrt(integerInput); i = i + 6){
            if (integerInput % i == 0 || integerInput % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean IsEven(Integer integerInput){
        if (integerInput % 2 == 0){
            return true;
        }
        return false;
    }
}
