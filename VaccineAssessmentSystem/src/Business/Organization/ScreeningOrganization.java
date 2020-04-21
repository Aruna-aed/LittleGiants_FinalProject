/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ResearchAssistantRole;
import Business.Role.Role;
import Business.Role.ScreeningAssistantRole;
import java.util.ArrayList;

/**
 *
 * @author Little Giants
 */
public class ScreeningOrganization extends Organization{

    public ScreeningOrganization() {
        super(Organization.Type.Screening.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ScreeningAssistantRole());
        return roles;
    }
     
   
    
    
}
