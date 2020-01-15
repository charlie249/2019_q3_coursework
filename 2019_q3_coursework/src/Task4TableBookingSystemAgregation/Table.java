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
    
    public Table(int tableNumbIn, int numbSeatsIn)
    {
        tableNumb = tableNumbIn;
        numbSeats = numbSeatsIn;
    }
    
    public int getTableNumb()
    {
        return tableNumb;
    }
    
    public int getNumbSeats()
    {
        return numbSeats;
    }
    
}
