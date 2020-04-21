/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Visitor;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Little Giants
 */
public class VisitorDirectory {
    
    private ArrayList<Visitor> visitorList;

    public VisitorDirectory() {
        visitorList = new ArrayList();
    }

    public ArrayList<Visitor> getVisitorList() {
        return visitorList;
    }
    
    public Visitor createVisitor(String name, int age, String sex, String bloodGroup, String contactNum, String address, String sign,
                String emailAdd, String emergencyPOC, String emergencyPOC_Num){
        Visitor visitor = new Visitor();
        visitor.setName(name);
        visitor.setAge(age);
        visitor.setGender(sex);
        visitor.setBloodGroup(bloodGroup);
        visitor.setContactNum(contactNum);
        visitor.setAddress(address);
        visitor.setSign(sign);
        visitor.setEmailAdd(emailAdd);
        visitor.setPocName(emergencyPOC);
        visitor.setPocContact(emergencyPOC_Num);
        visitorList.add(visitor);
        return visitor;
    }
}
