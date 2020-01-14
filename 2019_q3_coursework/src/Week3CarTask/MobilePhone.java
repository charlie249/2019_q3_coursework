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
public class MobilePhone {
    String colour;
    String make;
    int batteryLevel;
    int signalLevel;
    boolean screenProtector;
    
    public String getColour()
    {
        return colour;
    }
    
    public String getMake()
    {
        return make;
    }
    
    public int getBatteryLevel()
    {
        return batteryLevel;
    }
    
    public int getSignalLevel()
    {
        return signalLevel;
    }
    
    public void setColour(String colourIn)
    {
        colour = colourIn;
    }
    
    public void setMake(String makeIn)
    {
        make = makeIn;
    }
    
    public void setBatteryLevel(int batteryLevelIn)
    {
        batteryLevel = batteryLevelIn;
    }
    
    public void setSignalLevel(int signalLevelIn)
    {
      signalLevel = signalLevelIn;   
    }
    
    public void recieveACall()
    {
        if(signalLevel != 0)
        {
            if(batteryLevel != 0)
            {
        batteryLevel--;
            }
            else
            {
                System.out.println("Your mobile phone battery is dead, please charge it.");
            }
        }
        else
        {
            System.out.println("Thereis no mobile signal!");
        }
        
    }
    
    public void chargePhone()
    {
        if (batteryLevel != 100)
        {
        batteryLevel = 100;
        }
    }
}
