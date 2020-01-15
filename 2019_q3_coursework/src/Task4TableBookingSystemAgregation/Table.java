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
public class Table {
    
    private int tableNumb;
    private int numbSeats;
    private boolean inside;
    private Staff staff;
    private Booking booking;
    
    public Table(int tableNumbIn, int numbSeatsIn, boolean insideIn)
    {
        tableNumb = tableNumbIn;
        numbSeats = numbSeatsIn;
        inside = insideIn;
        
        staff = null;
        booking = null;
    }

    public int getTableNumb()
    {
        return tableNumb;
    }
    
    public int getNumbSeats()
    {
        return numbSeats;
    }
    
    public void assignStaffMember(Staff staffIn)
    {
        staff = staffIn;
    }
    
    public boolean bookTable(Booking bookingIn)
    {
        if(booking.dineOut = true)
        {
            if( numbSeats < booking.getNumbGuests())
            {
                System.out.println("There are no tables available at the moment in your chosen location, sorry.");
            }
            else
            {
                System.out.println("There is a table big enough to fit all of you on and outside like you requested.");
            }
        }
        else
        {
            if(numbSeats < booking.getNumbGuests())
            {
                System.out.println("There are no tables available in your chosen location at the moment, sorry.");
            }
            else
            {
                System.out.println("There is a table big enough to fit all of you on and inside like you requested.");
            }
        }
        return false;
    }
    
    public void clearBooking()
    {
        booking = null;
    }
    
    public static void main(String[] args)
{
   Table t1 = new Table();
   Table t2 = new Table();
   
   Booking b1 = new Booking(); 
   Booking b2 = new Booking();
   Booking b3 = new Booking();
   Booking b4 = new Booking();
   
   Staff s1 = new Staff();
   Staff s2 = new Staff();
   

}

}
