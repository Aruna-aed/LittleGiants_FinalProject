/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ResearchAssistantRole;

import Business.Visitor.Phase;
import Business.Visitor.Visitor;
import Business.Visitor.Week;
import Business.WorkQueue.ResearchAssistantWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Little Giants
 */

public class ProcessPhaseJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private ResearchAssistantWorkRequest request;
   private Visitor visitor;
   private Phase phase;
    
   /**
     * Creates new form ProcessPhaseJPanel
     * @param userProcessContainer
     * @param visitor
     * @param phase
     * @param request
     */
    public ProcessPhaseJPanel(JPanel userProcessContainer, ResearchAssistantWorkRequest request,Visitor visitor,Phase phase) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.visitor=visitor;
        this.phase=phase;
        this.request=request;
        phaseTextField.setText(phase.getPhaseName());
        patientName.setText(visitor.getName());
        patientAge.setText(String.valueOf(visitor.getAge()));
        
        populateWeekCombobox();
     
    }
public void removeAll(){
    int itemCount = weekName.getItemCount();

    for(int i=0;i<itemCount;i++){
        weekName.removeItemAt(0);
     }
}
    private void populateWeekCombobox(){
        for(Week week :phase.getWeekslist()){
            if(week.getWeekStatus().equals("initialized")){
                weekName.addItem(week);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bpTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rrTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tempTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pulseTextField = new javax.swing.JTextField();
        saveJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bpTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rrTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tempTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        weightTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        prTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        patientAge = new javax.swing.JTextField();
        phaseTextField = new javax.swing.JTextField();
        weekName = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        jLabel5.setText("Blood pressure :");

        jLabel6.setText("Respiratory rate:");

        jLabel7.setText("Body temperature");

        jLabel8.setText("Weight");

        jLabel9.setText("Pulse rate:");

        setBackground(new java.awt.Color(255, 255, 255));

        saveJButton.setBackground(new java.awt.Color(88, 177, 159));
        saveJButton.setText("Save");
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Phase");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Week");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Blood pressure ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Respiratory rate");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Body temperature in ℉");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Weight");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Pulse rate:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Volunteer Name");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Age");

        patientName.setEnabled(false);

        patientAge.setEnabled(false);

        phaseTextField.setEnabled(false);

        weekName.setBackground(new java.awt.Color(88, 177, 159));
        weekName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weekNameActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(88, 177, 159));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Images/vitalSigns.JPG"))); // NOI18N
        jLabel17.setText("jLabel17");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel13))
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(saveJButton)
                                    .addComponent(tempTextField1)
                                    .addComponent(weightTextField1)
                                    .addComponent(prTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rrTextField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bpTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(patientAge, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patientName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)))))
                        .addGap(18, 18, 18)
                        .addComponent(phaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weekName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1014, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(phaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(weekName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(patientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bpTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rrTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(prTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(saveJButton)
                .addContainerGap(975, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
  
        try{
        Week week=(Week)weekName.getSelectedItem();
        
        if(week==null || week.equals("")){
              JOptionPane.showMessageDialog(null, "This phase is completed for this volunteer");
            return;
        }
     if(bpTextField.equals("") || rrTextField.equals("") || tempTextField.equals("") || weightTextField.equals("") || pulseTextField.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill all the details.");
            return;
        }
          if(week.getWeekName().equals("week2")){
        Week week1=phase.searchWeek("week1");
        if(!(week1.getWeekStatus().equals("success") ||week1.getWeekStatus().equals("failure"))){
            JOptionPane.showMessageDialog(null,"Week1 is not yet completed");
            return;
        }
    }
    
     if(week.getWeekName().equals("week3")){
        //Week week1=phase.searchWeek("week1");
        Week week2=phase.searchWeek("week2");
        if((!(week2.getWeekStatus().equals("success") ||week2.getWeekStatus().equals("failure")))){
               //if( (!(week1.getWeekStatus().equals("success") ||week1.getWeekStatus().equals("failure")))){
            JOptionPane.showMessageDialog(null,"Week2 is not yet completed");
            return;
       // }
        
        }
        
    }
     
      if(week.getWeekName().equals("week4")){
        //Week week1=phase.searchWeek("week1");
       // Week week2=phase.searchWeek("week2");
        Week week3=phase.searchWeek("week3");
        if((!(week3.getWeekStatus().equals("success") ||week3.getWeekStatus().equals("failure"))))
        {
           // if( (!(week2.getWeekStatus().equals("success") ||week2.getWeekStatus().equals("failure")))){
             //   if( (!week1.getWeekStatus().equals("success") ||!week1.getWeekStatus().equals("failure")))
            JOptionPane.showMessageDialog(null,"Week1 & Week2 & week3 are not yet completed");
            return;
      //  }
        }
        
    }
    
        int bp;
        int rr;
        int temp;
        int pulse;
        float weight;
        
        //----------------------------------------------------------------------------------------------------------------
        try
           {
        
        bp = Integer.parseInt(bpTextField1.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid blood pressure"); 
            bpTextField1.setText("");
               return;
           } 
        //----------------------------------------------------------------------------------------------------------------
         try
           {
        
         rr = Integer.parseInt(rrTextField1.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid respiratory rate"); 
            rrTextField1.setText("");
               return;
           } 
         //----------------------------------------------------------------------------------------------------------------------
          try
           {
        
         temp = Integer.parseInt(tempTextField1.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid temparature"); 
            
            tempTextField1.setText("");
               return;
           } 
          
          //------------------------------------------------------------------------------------------------------------------------
            try
           {
        
         weight = Float.parseFloat(weightTextField1.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid weight"); 
            
            weightTextField1.setText("");
               return;
           } 
            
            
        //------------------------------------------------------------------------------------------------------------------------------
              try
           {
         
         pulse = Integer.parseInt(prTextField1.getText());
        
           }
           catch(NumberFormatException e)
           {
            JOptionPane.showMessageDialog(null , "Invalid pulse rate"); 
            
            prTextField1.setText("");
               return;
           } 
         //--------------------------------------------------------------------------------------------------------------------------------
       
    int patientAge=visitor.getAge();
    week.setWeekStatus("processed");
   // week.setAntibodiesCount(antibodiesCountValue);
    week.getVitalSigns().setBp(bp);
    week.getVitalSigns().setHeartRate(pulse);
    week.getVitalSigns().setRespiratoryRate(rr);
    week.getVitalSigns().setTemp(temp);
    week.getVitalSigns().setWeightKls(weight);
    JOptionPane.showMessageDialog(null,"saved successfully");
            removeAll();
            populateWeekCombobox();
            if(week.isPatientNormal(patientAge, rr, pulse, bp, weight, temp)){
             //   patientNormal.setText("patient is normal");
                week.setWeekStatus("success");
                
            }
            else{
              // patientNormal.setText("patient is abnormal/developing side effects");
                week.setWeekStatus("failure");
                visitor.setResearchStatus("failed");
                
            }
            
          /*
            
            Week week1 = phase.searchWeek("week1");
               Week week2 = phase.searchWeek("week2");
               Week week3 = phase.searchWeek("week3");
               Week week4 = phase.searchWeek("week4");
            if((week1.getWeekStatus().equals("success")||(week1.getWeekStatus().equals("failure"))) 
                    && (week2.getWeekStatus().equals("success")||(week2.getWeekStatus().equals("failure")))
                    && (week3.getWeekStatus().equals("success")||(week3.getWeekStatus().equals("failure")))
                    && (week4.getWeekStatus().equals("success")||(week4.getWeekStatus().equals("failure")))
                    ){
                if((week1.getWeekStatus().equals("success"))&&(week2.getWeekStatus().equals("success"))&&(week3.getWeekStatus().equals("success"))&&(week3.getWeekStatus().equals("success"))
                        ){
                    phase.setPhaseStatus("success");
                }
                else if ((week1.getWeekStatus().equals("failure"))||(week2.getWeekStatus().equals("failure"))||(week3.getWeekStatus().equals("failure"))||(week3.getWeekStatus().equals("failure"))){
                    phase.setPhaseStatus("failure");
                }
                        
            }
            */
           /* bpTextField1.setText("");
            rrTextField1.setText("");
            tempTextField1.setText("");
            weightTextField1.setText("");
            prTextField1.setText("");
            antibodiesCount.setText("");
            */
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
            }
        
        catch(Exception e){
         JOptionPane.showMessageDialog(null, "This phase is completed for this volunteer");
            return;
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void weekNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weekNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weekNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bpTextField;
    private javax.swing.JTextField bpTextField1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField patientAge;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField phaseTextField;
    private javax.swing.JTextField prTextField1;
    private javax.swing.JTextField pulseTextField;
    private javax.swing.JTextField rrTextField;
    private javax.swing.JTextField rrTextField1;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField tempTextField;
    private javax.swing.JTextField tempTextField1;
    private javax.swing.JComboBox weekName;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField weightTextField1;
    // End of variables declaration//GEN-END:variables
}
