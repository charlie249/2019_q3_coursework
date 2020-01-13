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
            System.out.print(counter);
            counter--;
        }
        
        System.out.println("Please enter the letter that corresponds with your choice: ");
        System.out.println("A: Calculate the area of a rectangle");
        System.out.println("B: Display a multiplication table");
        System.out.println("C: Add two numbers together");
        Scanner scanIn = new Scanner(System.in);
        String choice = scanIn.nextLine();
        
        if(choice == "A")
        {
            System.out.println("Please enter the width: ");
            int width = Integer.parseInt(scanIn.nextLine());
        }
        
    }
}
