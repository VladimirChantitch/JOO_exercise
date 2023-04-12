package Java_Projects.Pyramide;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        SetPyramid();
    }

    public static void SetPyramid(){
        Integer integerInput = -1; 
        do{
            System.out.println("Please enter a int between 0 and 10 to set the size of the pyramid");
            Scanner sc = new Scanner(System.in); 
            try{
                integerInput = (Integer)sc.nextInt();
            }
            catch(Exception e){

            }
        }
        while(integerInput > 10 || integerInput < 0);

        System.out.println(new StringBuilder("Ok lets make a pyramid of size ").append(integerInput).append("  !!!!!"));

        for (int i = 0; i < integerInput; i++){
            String buffer = "";
            for (int j = 0; j < i + 1; j++){
                buffer += "o";
            }
            System.out.println(buffer);
        }

        System.out.println("Finish");
    }
}
