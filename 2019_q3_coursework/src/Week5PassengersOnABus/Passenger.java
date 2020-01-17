/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5PassengersOnABus;

/**
 *
 * @author charlie
 */
public class Passenger {
    String name;
    int age;
    boolean student;
    double farePaid;
    
    public Passenger[] passengers = new Passenger[15];

    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    public double getFarePaid()
    {
        return farePaid;
    }
    
    public boolean isStudent()
    {
        return student;
    }
    
    public void setName(String nameIn)
    {
        name = nameIn;
    }
    
    public void setAge(int ageIn)
    {
        age = ageIn;
    }
    
    public void setFarePaid(double farePaidIn)
    {
        farePaid = farePaidIn;
    }
    
    public void setStudent(boolean studentIn)
    {
        student = studentIn;
    }
    
    public class newPassenger
    {
        newPassenger(String name, int age, boolean student, double farePaid)
        {
          
        }
    }
    public Passenger addPassenger()
    {
        return addPassenger();
    }
    public void print()
    {
        System.out.println("Name " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Fare paid: £" + getFarePaid());
        System.out.println("Is a student? " + isStudent());
    }
}
