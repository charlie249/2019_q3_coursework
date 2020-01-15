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
public class Bus {
    int numbPassengers;
    int capacity = 15;
    String driverName;
    
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

    
}
