
package Java_Projects.NumberOfWords;

import java.util.Scanner;
import java.io.File;  
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class NumberOfWordInString {
    public static void main(String[] args) {
        CountNumberInASentence();
    }

    public static void CountNumberInASentence(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter a string");
        String stringInput = sc.nextLine();

        WriteStringInFile(stringInput);
        String fileContent = ReadFile();
        PrintNumberOfWords(fileContent);


    }

    public static void PrintNumberOfWords(String txt){
        Integer numberOfWords = txt.trim().split("\\b\\w+\\b").length;
        System.out.println(new StringBuilder("The number of words in your sentence is :: ").append(numberOfWords));
    }

    public static void WriteStringInFile(String txt){
        try{
            File newFile = new File("aFile.txt");
            newFile.delete();
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

    public static String ReadFile(){
        System.out.println("Ok know lets read the file");
        String buffer = "";
        do{
            Scanner sc = new Scanner(System.in); 
            System.out.println("Please enter a Path");
            try{
                String stringInput = sc.nextLine();
                Scanner scan = new Scanner(Paths.get(stringInput.trim()), StandardCharsets.UTF_8.name());
                buffer = scan.useDelimiter("\\A").next();
                scan.close();
            }catch(Exception e){

            }

        }while(buffer.equals(""));

        return buffer;
    }
}
