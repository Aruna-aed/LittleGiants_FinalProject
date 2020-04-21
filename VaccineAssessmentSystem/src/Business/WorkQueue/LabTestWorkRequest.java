/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Little Giants
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private String patientName;
    private String testName;
    private String fileupload;

    public String getTestName() {
        return testName;
    }

    public String getFileupload() {
        return fileupload;
    }

    public void setFileupload(String fileupload) {
        this.fileupload = fileupload;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
   
    
}
