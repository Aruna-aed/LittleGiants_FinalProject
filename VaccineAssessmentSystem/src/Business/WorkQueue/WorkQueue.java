/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
/**
 *
 * @author Little Giants
 */

public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    
        public boolean searchRequest(String patientName,String testName){
      for (WorkRequest request: workRequestList) {
          LabTestWorkRequest result= (LabTestWorkRequest)request;
           if (result.getPatientName().equals(patientName) && result.getTestName().equals(testName)) {
         return true;
       }
      }
           return false;
}
}