/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Little Giants
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Visitor.getValue())){
            organization = new VisitorOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Screening.getValue())){
            organization = new ScreeningOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Radiology.getValue())){
            organization = new RadiologyOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ResearchScientist.getValue())){
            organization = new ResearchScientistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.ResearchAssistant.getValue())){
            organization = new ResearchAssistantOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}