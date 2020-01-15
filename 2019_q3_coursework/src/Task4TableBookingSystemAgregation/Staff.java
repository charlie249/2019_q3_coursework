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
public class Staff {
    
    String staffName;
    String gender;
    boolean experienced;
    
    public String getStaffName()
    {
        return staffName;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public boolean isExperienced()
    {
        return experienced;
    }
    
    public Staff(String staffNameIn, String genderIn)
    {
        staffName = staffNameIn;
        gender = genderIn;
    }
    
}
