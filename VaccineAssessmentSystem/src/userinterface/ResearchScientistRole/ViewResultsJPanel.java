/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchScientistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.Visitor.Phase;
import Business.Visitor.Visitor;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
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
      DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
      model.setRowCount(0); 
      Object[] row = new Object[7];
       Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Hospital;
       for (Network network: business.getNetworkList()) {
         for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()) {
          if (enterprise.getEnterpriseType() == type) {
           enterprise.getOrganizationDirectory().getOrganizationList().stream().filter((organization) 
                   -> (organization.getName().equals("Visitor Organization"))).forEachOrdered((organization) -> {
               
             for (Visitor v: organization.getVisitorDirectory().getVisitorList()) {
                 
                 
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
        workRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        processJButton.setText("View graphs");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(workRequestJTable);

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(375, 375, 375)
                        .addComponent(processJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(processJButton)
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

   int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
                  JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        Visitor visitor = (Visitor)workRequestJTable.getValueAt(selectedRow, 0);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
