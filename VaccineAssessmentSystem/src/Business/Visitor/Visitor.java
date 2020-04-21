/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Visitor;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Little Giants
 */

public class Visitor {
    
    private String pocName;
    private String pocContact;
     private String name;
    private int age;
    private String gender;
    private String bloodGroup;
    private String contactNum;
    private String address;
    private String sign;
    private String emailAdd;
    private String date;
    private String network; 
    private ArrayList<VitalSigns> vitalSignsHistory;
  private VitalSigns currVital; 
  private ArrayList<Phase> phaseList;
  private boolean volunteer;
  private String selectedBy;
  private String researchStatus;
  private UserAccount assignedDoctor;
 private String status;

    public UserAccount getAssignedDoctor() {
        return assignedDoctor;
    }

    public void setAssignedDoctor(UserAccount assignedDoctor) {
        this.assignedDoctor = assignedDoctor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
  
  
    public String getResearchStatus() {
        return researchStatus;
    }

    public void setResearchStatus(String researchStatus) {
        this.researchStatus = researchStatus;
    }
 
  public Phase createPhase(){
      Phase phase=new Phase();
        phaseList.add(phase);
        return phase;
    }

    public ArrayList<Phase> getPhaseList() {
        return phaseList;
    }

    public void setPhaseList(ArrayList<Phase> phaseList) {
        this.phaseList = phaseList;
    }

    public String getSelectedBy() {
        return selectedBy;
    }

    public void setSelectedBy(String selectedBy) {
        this.selectedBy = selectedBy;
    }
  
  
    public boolean isVolunteer() {
        return volunteer;
    }

    public void setVolunteer(boolean volunteer) {
        this.volunteer = volunteer;
    }

    public Visitor() {
     this.vitalSignsHistory = new ArrayList<VitalSigns>();
     this.phaseList=new ArrayList<Phase>();
    }

    
    
public Phase searchPhase(String phaseName){
      for (Phase phase: phaseList) {
           if (phase.getPhaseName().equals(phaseName) ) {
         return phase;
       }
      }
           return null;
}

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }

    public VitalSigns getCurrVital() {
        return currVital;
    }

    public void setCurrVital(VitalSigns currVital) {
        this.currVital = currVital;
    }
  
      public VitalSigns newVitalSign(VitalSigns vs){
       
        vitalSignsHistory.add(vs);
        VitalSigns vs1=new VitalSigns();
        this.currVital=vs1;
        return vs1;
        
    }
    public String getPocName() {
        return pocName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

  
    public void setPocName(String pocName) {
        this.pocName = pocName;
    }

  
    public String getPocContact() {
        return pocContact;
    }

    
    public void setPocContact(String pocContact) {
        this.pocContact = pocContact;
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
        return this.getName();
    }
}
