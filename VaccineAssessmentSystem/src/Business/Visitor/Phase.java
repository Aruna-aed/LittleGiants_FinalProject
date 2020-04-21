/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Visitor;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Little Giants
 */
public class Phase {
    private String phaseName;
    private ArrayList<Week> weekslist;
    private String phaseStatus;
    private String dose;
    
    private int antibodiesCount;
    
    public Phase() {
        this.weekslist = new ArrayList<Week>();
    }

    public int getAntibodiesCount() {
        return antibodiesCount;
    }

    public void setAntibodiesCount(int antibodiesCount) {
        this.antibodiesCount = antibodiesCount;
    }
    
    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }
    

    public Week searchWeek(String weekName){
      for (Week week: weekslist) {
           if (week.getWeekName().equals(weekName) ) {
         return week;
       }
      }
           return null;
}
    
    
       public Week createWeek(){
      Week week=new Week();
        weekslist.add(week);
        return week;
    }

    public ArrayList<Week> getWeekslist() {
        return weekslist;
    }

    public void setWeekslist(ArrayList<Week> weekslist) {
        this.weekslist = weekslist;
    }
    
   

    public String getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }
      @Override
    public String toString() {
        return this.getPhaseName();
    }
}
