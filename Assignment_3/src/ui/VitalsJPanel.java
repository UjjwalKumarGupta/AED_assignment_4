/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.EncounterHistory;
import model.VitalSigns;
import model.patient;
import model.patientDirectory;
import model.person;
import model.personDirectory;

/**
 *
 * @author DELL
 */
public class VitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalsJPanel
     */
    EncounterHistory history;
    personDirectory personD;
    patientDirectory patientD;
    public VitalsJPanel(EncounterHistory history,personDirectory personD,patientDirectory patientD) {
        initComponents();
        this.history = history;
        this.personD = personD;
        this.patientD = patientD;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblBp = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblEno = new javax.swing.JLabel();
        txtTemp = new javax.swing.JTextField();
        txtBp = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtEno = new javax.swing.JTextField();
        lblTemp = new javax.swing.JLabel();
        txtEdate = new javax.swing.JTextField();
        lblEdate = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtComm = new javax.swing.JTextField();
        lblEdate1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ENTER PERSON VITALS");

        lblBp.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblBp.setText("Blood Pressure :");

        lblPulse.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblPulse.setText("Pulse :");

        lblEno.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblEno.setText("Encounter No :");

        txtBp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBpFocusLost(evt);
            }
        });

        lblId.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblId.setText("Person ID :");

        lblTemp.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblTemp.setText("Temperature :");

        txtEdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdateActionPerformed(evt);
            }
        });

        lblEdate.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblEdate.setText("Encounter Date :");

        btnSave.setBackground(new java.awt.Color(204, 0, 0));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblEdate1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblEdate1.setText("Community :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEno)
                            .addComponent(lblPulse)
                            .addComponent(lblBp)
                            .addComponent(lblId)
                            .addComponent(lblTemp))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtTemp)
                            .addComponent(txtBp)
                            .addComponent(txtPulse)
                            .addComponent(txtEno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEdate)
                            .addComponent(lblEdate1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEdate, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtComm)))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblTitle)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemp)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBp)
                    .addComponent(txtBp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEno)
                    .addComponent(txtEno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdate)
                    .addComponent(txtEdate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEdate1))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(102, 102, 102))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBpFocusLost

    }//GEN-LAST:event_txtBpFocusLost

    private void txtEdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
     boolean flag;
     String alphapattern = "^[a-zA-Z\\s]{1,}$";
     String numpattern = "\\d+";
     String alphanum = "^[a-zA-Z0-9\\s]+$";
     String decimal = "[+-]?([0-9]*[.])?[0-9]+";
        
     Pattern aP = Pattern.compile(alphapattern);
     Pattern nP = Pattern.compile(numpattern);
     Pattern an = Pattern.compile(alphanum);
     Pattern de = Pattern.compile(decimal);
     
     
     Matcher cM = nP.matcher(txtId.getText());
     Matcher mM = de.matcher(txtTemp.getText());
     Matcher ctM = nP.matcher(txtBp.getText());
     Matcher yM = nP.matcher(txtPulse.getText());
     Matcher sM = nP.matcher(txtEno.getText());
     Matcher sr = an.matcher(txtEdate.getText());
     Matcher Com = aP.matcher(txtComm.getText());
     
     
     if ((!cM.matches()) || (!mM.matches()) || (!ctM.matches()) || (!yM.matches())|| (!sM.matches()) || (!sr.matches()) || (!Com.matches()))
            {
            flag=false;
            }
         
         else{
                flag=true;
            }
        
        
  
     if (flag == true){
        
        int check=0;
        for(person p : personD.getPersonD()){
             if(p.getPersonID() == Integer.parseInt(txtId.getText())){
                 check = 1;




                 String date = txtEdate.getText();
                 double temperature = Double.parseDouble(txtTemp.getText());
                 double bloodPressure = Double.parseDouble(txtBp.getText());
                 int pulse = Integer.parseInt(txtPulse.getText());
                 int encounter = Integer.parseInt(txtEno.getText());
                 int id = Integer.parseInt(txtId.getText());
                 String community = txtComm.getText();

                 VitalSigns vs = history.addNewVitals();

                 vs.setBloodPressure(bloodPressure);
                 vs.setDate(date);
                 vs.setPulse(pulse);
                 vs.setTemperature(temperature);
                 vs.setEncounter(encounter);
                 vs.setId(id);
                 JOptionPane.showMessageDialog(this, "Person Vitals added to Encounter History !");

                 if(bloodPressure <90 || bloodPressure >120){

                 patient pa = patientD.addNewPatient();

                 pa.setBp(bloodPressure);
                 pa.setEdate(date);
                 pa.setEno(encounter);
                 pa.setPid(id);
                 pa.setPul(pulse);
                 pa.setTemp(temperature);
                 pa.setComm(community);

                 }



             }
       }
                
    
            
            if (check ==0){
                JOptionPane.showMessageDialog(this, "Person Does not exits !");
                
            }
        
        }
        
       else {
            JOptionPane.showMessageDialog(this, "ERROR! Enter the correct value in the field.");} 
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBp;
    private javax.swing.JLabel lblEdate;
    private javax.swing.JLabel lblEdate1;
    private javax.swing.JLabel lblEno;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBp;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtEdate;
    private javax.swing.JTextField txtEno;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
