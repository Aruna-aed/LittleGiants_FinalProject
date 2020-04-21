/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Visitor;

import java.util.Date;

/**
 *
 * @author Little Giants
 */
public class VitalSigns {
    private int respiratoryRate;
    private int heartRate;
    private int     bp;
    private float weightKls;
    private int temp;
    private Date time;

  
    public VitalSigns() {
        
    }

    
    
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public float getWeightKls() {
        return weightKls;
    }

    public void setWeightKls(float weightKls) {
        this.weightKls = weightKls;
    }

 

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    
   

}
