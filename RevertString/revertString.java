package Java_Projects.RevertString;

import java.util.Scanner;

public class revertString {
    public static void main(String[] args) {
        revertString();
    }

    public static void revertString(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter a string");
        String stringInput = sc.nextLine();
        System.out.println("Ok now lets revert this string !!");

        String revertedBuffer = "";
        for (int i = stringInput.length() - 1; i >= 0; i--){
            revertedBuffer += stringInput.charAt(i);
        }

        System.out.println(revertedBuffer);
    }
}
