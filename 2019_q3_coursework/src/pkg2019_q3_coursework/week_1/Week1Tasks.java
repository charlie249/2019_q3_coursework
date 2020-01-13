/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2019_q3_coursework.week_1;

/**
 *
 * @author charlie
 */
public class Week1Tasks {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Charlie";
        int age = 18;
        boolean isBirthday =  false;
        int speed = 60;
        int speedLimit = 40;
        boolean isStudent = true;
        int cost = 30;
        int mileage = 9;
        
        System.out.println("Hello world");
        System.out.println("My name is " + name + ". And i am " + age + " years old.");
        System.out.println("_______");
        System.out.println("| o o | HELLO " + name +".");
        System.out.println("| --- | HOW ARE YOU?");
        System.out.println("-------");
        
        System.out.println("You are " + age + " years old.");
        if(isBirthday = true)
        {
            age = age + 1;
            System.out.println("YAY!! Its your birthday! Now you are " + age + " years old.");
        }
        
        if(age >= 18)
        {
            System.out.println("You can now legally buy alchol.");
        }
        
        if(age > 19 && age < 40 )
        {
            System.out.println("You are in the 20's and 30's club.");
        }
        
        if( speed >= speedLimit + 10)
        {
            System.out.println("Your speed is " + speed + " the speed limit is " + speedLimit + " Your speeding, ticket for you. You may also face a possible court summons.");
        }
        else if(speed <= speedLimit +10)
        {
            System.out.println("Your speed is " + speed + " the speed limit is " + speedLimit + " Your speeding, ticket for you.");
        }
        else
        {
            System.out.println("Please continue to drive safely");
        }
        
        if(age <= 3 && age >= 65)
        {
            System.out.println("You can travel for free!");
        }
        else if( isStudent = true && age > 17 && age <= 19)
        {
            System.out.println("You pay half price as your a student, your ticket will cost you £2.00");
        }
        else
        {
            System.out.println("You will have to pay full price, your ticket costs £4.00");
        }
    }
}
