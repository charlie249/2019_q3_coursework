/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2Tasks;
import java.util.Scanner;
/**
 *
 * @author charlie
 */
public class Week2Task {
    public static void main(String[] args) {
        int counter = 10;

        while(counter > 0)
        {
            System.out.println(counter);
            counter--;
        }
        
        System.out.println("Please enter the letter that corresponds with your choice: ");
        System.out.println("1: Calculate the area of a rectangle");
        System.out.println("2: Display a multiplication table");
        System.out.println("3: Add two numbers together");
        Scanner scanIn = new Scanner(System.in);
        int choice = Integer.parseInt(scanIn.nextLine());
        
        if(choice == 1)
        {
            System.out.println("You have selected 1: Calculate the area of a rectangle ");
            System.out.println("Please enter the width of the rectangle: ");
            int width = Integer.parseInt(scanIn.nextLine());
            
             System.out.println("Please enter the height of the rectangle: ");
            int height = Integer.parseInt(scanIn.nextLine());
            
            System.out.println("The area of the rectangle is: " + width * height);
            
        }
        
        else if(choice == 2)
        {
          System.out.println("You have selected 2 - Display a multiplication table");
          
          System.out.println("Please enter the multpiplication table you want, for examepl 12, or 2 etc.");
                
          int multiple = Integer.parseInt(scanIn.nextLine());
         
          System.out.println("Displaying the " + multiple + " times table");
          
          for( int count = 1; count <= 12; count++ )
            {
                System.out.println( count + " times " + multiple + " = " + (multiple * count));
         
            }
         
        } 
        else if(choice == 3) 
        {
            System.out.println("You have selected 3: Add two numbers together.");
            System.out.println("Please enter the first number: ");
            int numbOne = Integer.parseInt(scanIn.nextLine());
            
            System.out.println("Please enter the second number: ");
            int numbTwo = Integer.parseInt(scanIn.nextLine());
            
            System.out.println("Here is your total: " + (numbOne + numbTwo));
        }
        else
        {
            System.out.println("I'm sorry that was not one of the options");
        }
        
        scanIn.close();
    }
}
