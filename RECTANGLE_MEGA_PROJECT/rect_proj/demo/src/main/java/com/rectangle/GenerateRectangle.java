package com.rectangle;

import java.util.Scanner;

public class GenerateRectangle {
    public Integer h_size = -1;
    public Integer w_size = -1;
    public GenerateRectangle(){
        Scanner sc = new Scanner(System.in); 

        do{
            System.out.println("Please enter the hight > 0 of your rectangle");
            try{
                h_size = sc.nextInt();
            }catch(Exception e){
    
            }

            System.out.println("Please enter the weidth > 0 of your rectangle");
            try{
                w_size = sc.nextInt();
            }catch(Exception e){
    
            }
        }while(h_size == -1 || w_size == -1);
    }

    public void Display(){
        for(int i = 0; i < h_size; i++){
            for (int j = 0; j < w_size; j ++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
