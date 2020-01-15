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
   Table t1 = new Table(6, 5, false);
   Table t2 = new Table(14, 10, true);
   Table t3 = new Table(1, 20, true);
   Table t4 = new Table(3, 6, false);
   
   Booking b1 = new Booking("Halsey", 5, true); 
   Booking b2 = new Booking("Limington", 9, false);
   Booking b3 = new Booking("Stephans", 14, false);
   Booking b4 = new Booking("De Costas", 12, true);
   
   Staff s1 = new Staff("Barry", "Male");
   Staff s2 = new Staff("Jerry", "Female");
  
   t1.assignStaffMember(s1);
   t1.bookTable(b1);
   
   t2.assignStaffMember(s2);
   t2.bookTable(b2);
   
   t3.assignStaffMember(s2);
   t3.bookTable(b3);
   
   t4.assignStaffMember(s1);
   t4.bookTable(b4);
   

}

}
