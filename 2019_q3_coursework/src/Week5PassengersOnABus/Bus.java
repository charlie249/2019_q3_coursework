/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5PassengersOnABus;
import java.util.Scanner; 
/**
 *
 * @author charlie
 */
public class Bus {
    int numbPassengers;
    int capacity = 15;
    String driverName;
    
    Passenger pas = new Passenger();
    
    public String getDriverName()
    {
        return driverName;
    }
    
    public int getNumbPassengers()
    {
        return numbPassengers;
    }
    
    public void setDriverName(String driverNameIn)
    {
        driverName = driverNameIn;
    }
    
    public void setNumbPassengers(int numbPassengersIn)
    {
        numbPassengers = numbPassengersIn;
    }
      public static void main(String[] args) {
          Passenger p1 = new Passenger();
          
          p1.setName("Garry");
          p1.setAge(23);
          p1.setFarePaid(4.50);
          
          p1.print();
      }
      public void addPassenger()
      {
          System.out.println("Please enter the name of the passenger you wish to add to the bus.");
          Scanner inScan = new Scanner(System.in);
          String nameIn = inScan.nextLine();
          
          for( int i = 0; i < pas.passengers.length; i++)
          {
          Passenger anotherPassenger = pas.passengers[i];
          
          if(anotherPassenger == null)
          {
              pas.passengers[i] = newPassenger;
          }
          
          }
          
      }
      
      public void removePassenger()
      {
        System.out.println("Please enter the name of the passenger you would like to remove.");
        Scanner scanIn = new Scanner(System.in);
        String name = scanIn.nextLine();
        
        System.out.println("You have chosen to remove: " + name );
      }

    
}
