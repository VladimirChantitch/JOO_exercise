package Java_Projects.NumberOfWords;

import java.util.Scanner;

public class NumberOfWordInString {
    public static void main(String[] args) {
        CountNumberInASentence();
    }

    public static void CountNumberInASentence(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter a string");
        String stringInput = sc.nextLine();
        System.out.println("Ok now lets revert this string !!");

        Integer numberOfWords = stringInput.split(" ").length;
        System.out.println(new StringBuilder("The number of words in your sentence is :: ").append(numberOfWords));
    }
}
