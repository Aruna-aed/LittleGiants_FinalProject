/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Little Giants
 */
public class ResearchDepartmentEnterprise  extends Enterprise{
 private String vaccineName;
 private int volunteerNumber;
 private String vaccineType;
 private int minimumAge;
 private int maximumAge;
 private ArrayList<String> dosesList;
 
  
     public ResearchDepartmentEnterprise(String name){
        super(name,Enterprise.EnterpriseType.ResearchDepartment);
        this.dosesList=new ArrayList<String>();
    }
     
      public void createDose( String dose){
  
    this.dosesList.add(dose);
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public int getVolunteerNumber() {
        return volunteerNumber;
    }

    public void setVolunteerNumber(int volunteerNumber) {
        this.volunteerNumber = volunteerNumber;
    }

    public String getVaccineType() {
        return vaccineType;
    }

    public void setVaccineType(String vaccineType) {
        this.vaccineType = vaccineType;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public int getMaximumAge() {
        return maximumAge;
    }

    public void setMaximumAge(int maximumAge) {
        this.maximumAge = maximumAge;
    }

    public ArrayList<String> getDosesList() {
        return dosesList;
    }

    public void setDosesList(ArrayList<String> dosesList) {
        this.dosesList = dosesList;
    }
 
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
