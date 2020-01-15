/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4AggregationTaskWarmUp;

/**
 *
 * @author charlie
 */
public class Heart {
    
    int BPM;
    int restingRate;
    
    public Heart(int restingRateIn)
    {
        restingRate = restingRateIn;
        BPM = restingRate;
    }
    
    public boolean increaseBPM(int increaseRate)
    {
        if(BPM < restingRate+100)
        {
            BPM = BPM + increaseRate;
            return true;
        }
        return false;
    }
    
    public void rest()
    {
        BPM = restingRate;
    }
    
    public int getBPM()
    {
        return BPM;
    } 
    
}
