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
public class Week {
    private String weekName;
    private String weekStatus;
     private VitalSigns vitalSigns; 

    public Week( ) {
        this.vitalSigns=new VitalSigns();
        
    }

    public String getWeekName() {
        return weekName;
    }

    public void setWeekName(String weekName) {
        this.weekName = weekName;
    }

     
     
    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getWeekStatus() {
        return weekStatus;
    }

    public void setWeekStatus(String weekStatus) {
        this.weekStatus = weekStatus;
    }

     

    
       public boolean isPatientNormal(double age,int r,int h,int b, float wk,float temp){
        if((age>=0.08)&&(age<1)){
        return (r>=20)&&(r<30)&&(h>=80)&&(h<140)&&(b>=70)&&(b<100)&&(wk>=4)&&(wk<10)&&(temp>=97.5)&&(temp<100.4);
        
        }
        if((age>=1)&&(age<3)){
        return (r>=20)&&(r<30)&&(h>=80)&&(h<130)&&(b>=80)&&(b<110)&&(wk>=10)&&(wk<14)&&(temp>=97.5)&&(temp<100.4);
        }
       
        if((age>=3)&&(age<=5)){
        return (r>=20)&&(r<30)&&(h>=80)&&(h<120)&&(b>=80)&&(b<110)&&(wk>=14)&&(wk<18)&&(temp>=98.6)&&(temp<99.5);
        }
        
        if((age>=6)&&(age<=12)){
        return (r>=20)&&(r<30)&&(h>=70)&&(h<110)&&(b>=80)&&(b<120)&&(wk>=20)&&(wk<42)&&(temp>=98.6)&&(temp<99.5);
       
        }
        if(age>=13){
        return (r>=12)&&(r<20)&&(h>=55)&&(h<105)&&(b>=110)&&(b<120)&&(wk>50)&&(temp>=97.7)&&(temp<98.5);
       
        }
        else{
        return (r>=30)&&(r<50)&&(h>=120)&&(h<160)&&(b>=50)&&(b<70)&&(wk>=2)&&(wk<3)&&(temp>=97.7)&&(temp<98.5);
        }
   
        
   }
      @Override
    public String toString() {
        return this.getWeekName();
    }
}
