/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchScientistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Visitor.Phase;
import Business.Visitor.Visitor;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Frame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Little Giants
 */

public class ViewResultsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    
    public ViewResultsJPanel(JPanel userProcessContainer, UserAccount account,  Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.enterprise=enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        populateTable();
     
    }
public void populateTable(){
      DefaultTableModel model = (DefaultTableModel) ResultsJTable.getModel();
      Enterprise e1=this.enterprise;
      model.setRowCount(0); 
      Object[] row = new Object[7];
       Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;
       for (Network network: business.getNetworkList()) {
         for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
          if (enterprise.getEnterpriseType() == type) {
           enterprise.getOrganizationDirectory().getOrganizationList().stream().filter((organization) 
                   -> (organization.getName().equals("Visitor Organization"))).forEachOrdered((organization) -> {
               
             for (Visitor v: organization.getVisitorDirectory().getVisitorList()) {
                try{
                 if(v.getSelectedBy().equals(e1.getName()))
                 {
                 
                 Phase phase1 = v.searchPhase("Phase1");
                 Phase phase2 = v.searchPhase("Phase2");
                 Phase phase3 = v.searchPhase("Phase3");
                 Phase phase4 = v.searchPhase("Phase4");
                  try
          {
                 if ((phase1.getPhaseStatus().equals("success")||phase1.getPhaseStatus().equals("failure"))&&
                         (phase2.getPhaseStatus().equals("success")||phase2.getPhaseStatus().equals("failure"))&&
                         (phase3.getPhaseStatus().equals("success")||phase3.getPhaseStatus().equals("failure"))&&
                         (phase4.getPhaseStatus().equals("success") || phase4.getPhaseStatus().equals("failure"))) {

               row[0] = v;
               row[1]= v.getAge();
               row[2]= phase1.getPhaseStatus();
               row[3]= phase2.getPhaseStatus();
               row[4]= phase3.getPhaseStatus();
               row[5]= phase4.getPhaseStatus();
               if((phase1.getPhaseStatus().equals("success"))&&(phase2.getPhaseStatus().equals("success"))&&(phase3.getPhaseStatus().equals("success"))&&
                       (phase4.getPhaseStatus().equals("success"))){
                  row[6] = "success";  
               }
               else{
                   if((phase1.getPhaseStatus().equals("failure"))||(phase2.getPhaseStatus().equals("failure"))||(phase3.getPhaseStatus().equals("failure"))||
                           (phase4.getPhaseStatus().equals("failure"))){
                     row[6] = "failure";  
                   }
                  
               }
               
               model.addRow(row);
              }
                //model.addRow(row);
             }
             catch(Exception e){
                     
                     }}}
             catch(Exception e ){
                 
             }}
           });
          }}
          }
         }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultsJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        pieButton = new javax.swing.JButton();

        processJButton.setText("View LineChart");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        ResultsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Volunteer Name", "Age", "Phase1", "Phase2", "Phase3", "Phase4", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ResultsJTable);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pieButton.setText("View PieChart");
        pieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(processJButton)))
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(1212, Short.MAX_VALUE)
                    .addComponent(pieButton)
                    .addGap(335, 335, 335)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(processJButton)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(1422, Short.MAX_VALUE)
                    .addComponent(pieButton)
                    .addGap(81, 81, 81)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public int getFailedCount(){
 Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;
 Enterprise e1=this.enterprise;
  int failedCount=0;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equals("Visitor Organization")) {

                            for (Visitor v : organization.getVisitorDirectory().getVisitorList()) {
                                try {
                                    if (v.getResearchStatus().equals("failed") && v.isVolunteer() == true && v.getSelectedBy().equals(e1.getName())) {
                                        failedCount = failedCount + 1;
                                    }
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
            
        }
        return failedCount;}
    
        public int getVolunteerCount(){
 Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;
 Enterprise e1=this.enterprise;
  int volunteerCount=0;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == type) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization.getName().equals("Visitor Organization")) {

                            for (Visitor v : organization.getVisitorDirectory().getVisitorList()) {
                                try {
                                    if ( v.isVolunteer() == true && v.getSelectedBy().equals(e1.getName())) {
                                        volunteerCount = volunteerCount + 1;
                                    }
                                } catch (Exception e) {
                                }
                            }
                        }
                    }
                }
            }
            
        }
        return volunteerCount;}

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

   int selectedRow = ResultsJTable.getSelectedRow();

        if (selectedRow < 0){
                  JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        Visitor visitor = (Visitor)ResultsJTable.getValueAt(selectedRow, 0);
        if(!(findRequest1() && findRequest2() && findRequest3() && findRequest4()) ){
             JOptionPane.showMessageDialog(null, "All the requested antibodies reports have not been recieved yet.");
            return;
        }
        
        
    
/*
        ViewGraphsJPanel viewGraphsJPanel = new ViewGraphsJPanel(userProcessContainer,  visitor);
        userProcessContainer.add("viewGraphsJPanel", viewGraphsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);*/

        LineChart_AWT chart = new LineChart_AWT(visitor,
         "Antibodies vs Phases" ,
         "Antibodies development in different phases");
      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
    }//GEN-LAST:event_processJButtonActionPerformed
   public boolean findRequest1(){
       
   int selectedRow = ResultsJTable.getSelectedRow();
        Visitor visitor = (Visitor)ResultsJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.ResearchDepartment;
   
       for (Network network : business.getNetworkList()) {
           for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
               if (enterprise.getEnterpriseType() == type) {
                  for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                  {
                           if(organization.getName().equals("Screening Organization")) {
                       for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                           LabTestWorkRequest labTestWorkRequest = (LabTestWorkRequest) request;
                           String testName1 = ((LabTestWorkRequest) request).getTestName();
                           if (visitor.getName().equals(labTestWorkRequest.getPatientName())) {
                               if (testName1.equals("Antibodies Test1")) {
                                 try{
                                     if(request.getStatus().equals("Completed"))
                                   return true;
                                 }
                                 catch(Exception e){
                                     
                                 }
                               }
                           }
                       }}}}}}
  return false;
   }
   
      public boolean findRequest2(){
       
   int selectedRow = ResultsJTable.getSelectedRow();
        Visitor visitor = (Visitor)ResultsJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.ResearchDepartment;
   
       for (Network network : business.getNetworkList()) {
           for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
               if (enterprise.getEnterpriseType() == type) {
                  for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                  {
                           if(organization.getName().equals("Screening Organization")) {
                       for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                           LabTestWorkRequest labTestWorkRequest = (LabTestWorkRequest) request;
                           String testName1 = ((LabTestWorkRequest) request).getTestName();
                           if (visitor.getName().equals(labTestWorkRequest.getPatientName())) {
                               if (testName1.equals("Antibodies Test2")) {
                                 try{
                                     if(request.getStatus().equals("Completed"))
                                   return true;
                                 }
                                 catch(Exception e){
                                     
                                 }
                               }
                           }
                       }}}}}}
  return false;
   }
      
         public boolean findRequest3(){
       
   int selectedRow = ResultsJTable.getSelectedRow();
        Visitor visitor = (Visitor)ResultsJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.ResearchDepartment;
   
       for (Network network : business.getNetworkList()) {
           for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
               if (enterprise.getEnterpriseType() == type) {
                  for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                  {
                           if(organization.getName().equals("Screening Organization")) {
                       for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                           LabTestWorkRequest labTestWorkRequest = (LabTestWorkRequest) request;
                           String testName1 = ((LabTestWorkRequest) request).getTestName();
                           if (visitor.getName().equals(labTestWorkRequest.getPatientName())) {
                               if (testName1.equals("Antibodies Test3")) {
                                 try{
                                     if(request.getStatus().equals("Completed"))
                                   return true;
                                 }
                                 catch(Exception e){
                                     
                                 }
                               }
                           }
                       }}}}}}
  return false;
   }
         
            public boolean findRequest4(){
       
   int selectedRow = ResultsJTable.getSelectedRow();
        Visitor visitor = (Visitor)ResultsJTable.getValueAt(selectedRow, 0);
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.ResearchDepartment;
   
       for (Network network : business.getNetworkList()) {
           for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
               if (enterprise.getEnterpriseType() == type) {
                  for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
                  {
                           if(organization.getName().equals("Screening Organization")) {
                       for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
                           LabTestWorkRequest labTestWorkRequest = (LabTestWorkRequest) request;
                           String testName1 = ((LabTestWorkRequest) request).getTestName();
                           if (visitor.getName().equals(labTestWorkRequest.getPatientName())) {
                               if (testName1.equals("Antibodies Test4")) {
                                 try{
                                     if(request.getStatus().equals("Completed"))
                                   return true;
                                 }
                                 catch(Exception e){
                                     
                                 }
                               }
                           }
                       }}}}}}
  return false;
   }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieButtonActionPerformed
        // TODO add your handling code here:
         Frame frame = new Frame();
        int successCount=getVolunteerCount()-getFailedCount();
        int failedCount=getFailedCount();
        if(successCount==0 && failedCount==0)
        {
            JOptionPane.showMessageDialog(null, "No volunteers yet");
            return;
        }
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        pieDataSet.setValue("Volunteers Success Count", successCount);
        pieDataSet.setValue("Volunteers Failure Count", failedCount);
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataSet, true, true, true);

        ChartPanel cpp = new ChartPanel(chart);
        frame.add(cpp);

        frame.pack();
        frame.setVisible(true);
        cpp.setSize(600, 600);
        cpp.setVisible(true);
        pieButton.setEnabled(false);
    }//GEN-LAST:event_pieButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ResultsJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pieButton;
    private javax.swing.JButton processJButton;
    // End of variables declaration//GEN-END:variables
}
