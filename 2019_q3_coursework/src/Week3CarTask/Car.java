/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3CarTask;

/**
 *
 * @author charlie
 */
public class Car {

    String make;
    String colour;
    int currentSpeed;
    int maxSpeed;
    int fuelLevel = 76;
    
    public String getMake()
    {
        return make;
    }
    
    public String getColour()
    {
        return colour;
    }
    
    public int getCurrentSpeed()
    {
        return currentSpeed;
    }
    
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    
    public int getFuelLevel()
    {
        return fuelLevel;
    }
    
    public void setMake(String makeIn)
    {
        make = makeIn;
    }
    
    public void setColour(String colourIn)
    {
        colour = colourIn;
    }
    
    public void setCurrentSpeed(int currentSpeedIn)
    {
        currentSpeed = currentSpeedIn;
    }
    
    public void setMaxSpeed(int maxSpeedIn)
    {
        maxSpeed = maxSpeedIn;
    }
    
    public void setFuelLevel(int fuelLevelIn)
    {
        fuelLevel = fuelLevelIn;
    }
    
    public void accelerate()
    {
        currentSpeed++;
        fuelLevel--;
    }
    
    public void brake()
    {
        currentSpeed--;
    }
    
    public void refuel()
    {
        fuelLevel = 100;
    }
    public static void main(String[] args)
{
    Car c1 = new Car();
    Car c2 = new Car();
    
    c1.setMake("BMW");
    c1.setColour("Black");
    c1.setCurrentSpeed(56);
    c1.setMaxSpeed(180);
    
    c2.setMake("Mazda");
    c2.setColour("red");
    c2.setCurrentSpeed(90);
    c2.setMaxSpeed(250);
    
    System.out.println("---- Car1 ----");
    System.out.println("Make: " + c1.getMake());
    System.out.println("Colour: " + c1.getColour());
    System.out.println("Current Speed: " + c1.getCurrentSpeed());
    System.out.println("Maximum Speed: " + c1.getMaxSpeed());
    System.out.println("Fuel level: " + c1.getFuelLevel());
    
    System.out.println("---- Car2 ----");
    System.out.println("Make: " + c2.getMake());
    System.out.println("Colour: " + c2.getColour());
    System.out.println("Current Speed: " + c2.getCurrentSpeed());
    System.out.println("Maximum Speed: " + c2.getMaxSpeed());
    System.out.println("Fuel level: " + c2.getFuelLevel());
    
    
}
    
    
}

