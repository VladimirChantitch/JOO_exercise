package com.rectangle;

public class App 
{
    public static void main( String[] args )
    {
        new GenerateRectangle(true).Display();
        GenerateSquare square = new GenerateSquare(false);
        square.Display();
        square.CalculateSurface();
    }
}
