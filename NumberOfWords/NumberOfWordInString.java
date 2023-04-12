
package Java_Projects.NumberOfWords;

import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class NumberOfWordInString {
    public static void main(String[] args) {
        CountNumberInASentence();
    }

    public static void CountNumberInASentence(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter a string");
        String stringInput = sc.nextLine();

        PrintNumberOfWords(stringInput);
        WriteStringInFile(stringInput);


    }

    public static void PrintNumberOfWords(String txt){
        Integer numberOfWords = txt.split(" ").length;
        System.out.println(new StringBuilder("The number of words in your sentence is :: ").append(numberOfWords));
    }

    public static void WriteStringInFile(String txt){
        try{
            File newFile = new File("aFile.txt");
            if (newFile.createNewFile()){
                System.out.println("Well well well you created a new file : " + newFile.getName());
                FileWriter fw = new FileWriter(newFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(txt);


                bw.close();
                fw.close();
            }
        }catch(Exception e){
            
        }
    }
}
