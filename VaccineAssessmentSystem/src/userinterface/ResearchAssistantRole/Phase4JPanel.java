/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchAssistantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LaboratoryEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ResearchAssistantOrganization;
import Business.Organization.ScreeningOrganization;
import Business.UserAccount.UserAccount;
import Business.Visitor.Phase;
import Business.Visitor.Visitor;
import Business.Visitor.Week;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.ResearchAssistantWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Little Giants
 */

public class Phase4JPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private ResearchAssistantOrganization researchAssistantOrganization;
    private Enterprise enterprise;
    
    public Phase4JPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.enterprise=enterprise;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.researchAssistantOrganization = (ResearchAssistantOrganization)organization;
        populateTable();
     
    }
public void populateTable(){
      DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
      model.setRowCount(0);
      for (WorkRequest request: researchAssistantOrganization.getWorkQueue().getWorkRequestList()) {
          ResearchAssistantWorkRequest researchAssistantWorkRequest=(ResearchAssistantWorkRequest)request;
       Object[] row = new Object[13];
       Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;
       if (request.getReceiver().equals(userAccount)) {

        for (Network network: business.getNetworkList()) {
         for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
          if (enterprise.getEnterpriseType() == type) {
           enterprise.getOrganizationDirectory().getOrganizationList().stream().filter((organization) 
                   -> (organization.getName().equals("Visitor Organization"))).forEachOrdered((organization) -> {
             for (Visitor v: organization.getVisitorDirectory().getVisitorList()) {
                  if(v.getName().equals(researchAssistantWorkRequest.getVolunteerName())){
                 Phase phase1 = v.searchPhase("Phase1");
                 Phase phase2 = v.searchPhase("Phase2");
                 Phase phase3 = v.searchPhase("Phase3");
              Phase phase = v.searchPhase("Phase4");
             try{ if ((phase1.getPhaseStatus().equals("success")||phase1.getPhaseStatus().equals("failure"))&&(phase2.getPhaseStatus().equals("success")||phase2.getPhaseStatus().equals("failure"))&&(phase3.getPhaseStatus().equals("success")||phase3.getPhaseStatus().equals("failure"))&&(phase.getPhaseStatus().equals("initialized") || phase.getPhaseStatus().equals("processing"))) {
               Week week1 = phase.searchWeek("week1");
               Week week2 = phase.searchWeek("week2");
               Week week3 = phase.searchWeek("week3");
               Week week4 = phase.searchWeek("week4");
               row[0] = v;
               row[1] = request;
               row[2]= request.getSender().getEmployee().getName();
               row[3]= request.getReceiver();
               row[4]= request.getStatus();
               row[5]= phase1.getPhaseStatus();
               row[6]= phase2.getPhaseStatus();
               row[7]= phase3.getPhaseStatus();
               row[8]= phase.getPhaseStatus();
               row[9] = week1.getWeekStatus();
               row[10] = week2.getWeekStatus();
               row[11] = week3.getWeekStatus();
               row[12]= week4.getWeekStatus();
               model.addRow(row);
              }}
             catch(Exception e){
                 
             }
             }}
           });
          }}
          }
         }
        }
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        processJButton.setBackground(new java.awt.Color(88, 177, 159));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/Actions-view-refresh-icon.png"))); // NOI18N
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Message", "Sender", "Receiver", "Status", "Phase1", "Phase2", "Phase3", "Phase4", "Week1", "Week2", "Week3", "Week4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jButton1.setBackground(new java.awt.Color(88, 177, 159));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/phase4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setBackground(new java.awt.Color(88, 177, 159));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Request Antibodies Count");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/Phase completion.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(processJButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshJButton))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(543, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton)
                    .addComponent(jButton2))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(935, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

   int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
                  JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        ResearchAssistantWorkRequest request = (ResearchAssistantWorkRequest)workRequestJTable.getValueAt(selectedRow, 1);
        Visitor visitor = (Visitor)workRequestJTable.getValueAt(selectedRow, 0);
        if (visitor.getResearchStatus().equals("failed")){
                  JOptionPane.showMessageDialog(null, "This patient has already developed side effects. So can't proceed with further doses.");
            return;
        }
        //request.setStatus("Processing");
       Phase phase = visitor.searchPhase("Phase4");
        phase.setPhaseStatus("processing");

        ProcessPhaseJPanel processPhaseJPanel = new ProcessPhaseJPanel(userProcessContainer, request, visitor,phase);
        userProcessContainer.add("processPhaseJPanel", processPhaseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                   int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
                  JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        Visitor visitor = (Visitor)workRequestJTable.getValueAt(selectedRow, 0);
        
          if (visitor.getResearchStatus().equals("failed")){
            JOptionPane.showMessageDialog(null, "This patient has already developed side effects. So can't proceed further to check antibodies.");
            return;
        }
    
        Phase phase = visitor.searchPhase("Phase4");
               Week week4 = phase.searchWeek("week4");
               try{
               if(!(week4.getWeekStatus().equals("success"))){
                   JOptionPane.showMessageDialog(null, "This patient has not reached 4th week yet. So you can't check antibodies count.");
             return; 
               }}
               catch(Exception e){
                
               }
        
         Organization o= null;
         String name = String.valueOf(visitor.getName());
       for(Network n: business.getNetworkList()){
           
            for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof LaboratoryEnterprise){
                   for(Organization org:  e.getOrganizationDirectory().getOrganizationList()){
                       if(org instanceof ScreeningOrganization){
                           o=org;
                           
                       }
                   }
                }
            }
        }
       if(o!=null){
           
          if(o.getWorkQueue().searchRequest(name, "Antibodies Test4")) {
                  JOptionPane.showMessageDialog(null,"Antibodies test report has already been requested for this patient for phase4");
            return;
          }
           LabTestWorkRequest request = new LabTestWorkRequest();
            request.setMessage("Screening Dept - please look into this issue");
            request.setSender(userAccount);
            request.setStatus("Sent");
            request.setPatientName(name);
            request.setTestName("Antibodies Test4");
            o.getWorkQueue().getWorkRequestList().add(request);
            userAccount.getWorkQueue().getWorkRequestList().add(request);
                   Week week1 = phase.searchWeek("week1");
               Week week2 = phase.searchWeek("week2");
               Week week3 = phase.searchWeek("week3");
              // Week week4 = phase.searchWeek("week4");
            if((week1.getWeekStatus().equals("success")||(week1.getWeekStatus().equals("failure"))) 
                    && (week2.getWeekStatus().equals("success")||(week2.getWeekStatus().equals("failure")))
                    && (week3.getWeekStatus().equals("success")||(week3.getWeekStatus().equals("failure")))
                    && (week4.getWeekStatus().equals("success")||(week4.getWeekStatus().equals("failure")))
                    ){
                if((week1.getWeekStatus().equals("success"))&&(week2.getWeekStatus().equals("success"))&&(week3.getWeekStatus().equals("success"))&&(week3.getWeekStatus().equals("success"))
                        ){
                    phase.setPhaseStatus("success");
                    
                JOptionPane.showMessageDialog(null,"Request sent to lab successfully"); 
                }
                else if ((week1.getWeekStatus().equals("failure"))||(week2.getWeekStatus().equals("failure"))||(week3.getWeekStatus().equals("failure"))||(week3.getWeekStatus().equals("failure"))){
                    phase.setPhaseStatus("failure");
                    
                JOptionPane.showMessageDialog(null,"Request sent to lab successfully"); 
                }
                
                //JOptionPane.showMessageDialog(null,"Request sent to lab successfully");         
            }
          
       }
       else{
            JOptionPane.showMessageDialog(null,"Screening Organization doesn't exist");
            return;
       }
          
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
