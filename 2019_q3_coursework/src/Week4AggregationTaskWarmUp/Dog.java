/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4AggregationTaskWarmUp;

/**
 *
 * @author charlie
 */
public class Dog {
    
         private String name;
         private int weight;
         private int energy;
         private int hunger;
         private boolean isGood;
         
         public Dog(String nameIn, int weightIn)
         {
             name = nameIn;
             weight = weightIn;
             energy = 100;
             hunger = 50;
             isGood = true;
         }
         
         public void chasePostman()
         {
             System.out.println("BARK! BARK! BARK! GRRRRRRRR!");
             energy--;
             hunger--;
             weight--;
             isGood = false;
         }
         
         public void walk()
         {
             weight--;
             energy--;
         }
         
         public void sleep()
         {
             energy = 100;
             hunger--;
         }
         
         public void eat()
         {
             hunger = 100;
             weight++;
         }
         
         public String getName()
         {
             return name;
         }
         
         public int getWeight()
         {
             return weight;
         }
         
         public int getEnergy()
         {
             return energy;
         }
         
         public int getHunger()
         {
             return hunger;
         }
         public boolean hasBeenGood()
         {
             return isGood;
         }
         
         public static void main(String[] args)
         {
             
             Dog d1 = new Dog("Fido", 16);
             Dog d2 = new Dog("Puddles", 30);
             
             d1.walk();
             d1.sleep();
             d1.chasePostman();
             
             d2.walk();
             d2.eat();
             
             System.out.println("---------- Displaying Dog 1 -----------" );
             System.out.println("Name: " + d1.getName() );
             System.out.println("Weight: " + d1.getWeight() );
             System.out.println("Energy: " + d1.getEnergy() );
             System.out.println("Hunger: " + d1.getHunger() );
             System.out.println("Been a good dog? " + d1.hasBeenGood() );
             
             System.out.println("---------- Displaying Dog 2 -----------" );
             System.out.println("Name: " + d2.getName() );
             System.out.println("Weight: " + d2.getWeight() );
             System.out.println("Energy: " + d2.getEnergy() );
             System.out.println("Hunger: " + d2.getHunger() );
             System.out.println("Been a good dog? " + d2.hasBeenGood() );
             
         }
    
}
