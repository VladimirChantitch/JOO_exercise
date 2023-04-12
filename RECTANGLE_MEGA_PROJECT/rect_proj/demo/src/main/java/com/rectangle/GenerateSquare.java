package com.rectangle;

import java.util.Scanner;

public class GenerateSquare extends GenerateRectangle {
    
    public GenerateSquare(boolean useSuperLogic){
        Scanner sc = new Scanner(System.in); 

        do{
            System.out.println("Please enter the border length > 0 of your square");
            try{
                h_size = w_size = sc.nextInt();
            }catch(Exception e){
    
            }
        }while(h_size == -1);
    }

    public void CalculateSurface(){
        System.out.println(new StringBuilder("The surface of this square is ")
                                .append(h_size * w_size)
        );
    }
}
