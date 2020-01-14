/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2Tasks;

/**
 *
 * @author charlie
 */
public class NestedLoopsWeek2 {
     public static void main(String[] args) {
         int count = 1;
         
         while(count < 4)
         {
             System.out.print("*");
             count++;
             for(int i = 4; i<4; i++)
         {
             System.out.print("*");
         }
         }
     }
    
}
