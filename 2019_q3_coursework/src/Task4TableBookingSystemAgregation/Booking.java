/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4TableBookingSystemAgregation;

/**
 *
 * @author charlie
 */
public class Booking {
    
    String name;
    int numbGuests;
    boolean dineOut;
    
    public String getName()
    {
        return name;
    }
    
    public int getNumbGuests()
    {
        return numbGuests;
    }
    
    public boolean wantDineOut()
    {
        return dineOut;
    }
    
    public Booking(String nameIn, int numbGuestsIn)
    {
        name = nameIn;
        numbGuests = numbGuestsIn;
    }
    
}
