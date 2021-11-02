/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSigns;
import model.patient;
import model.patientDirectory;

/**
 *
 * @author DELL
 */
public class PatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientsJPanel
     */
    patientDirectory patientD;
    public PatientsJPanel(patientDirectory patientD) {
        initComponents();
        this.patientD = patientD;
        
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();
        btnCount = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 0, 0));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("PATIENT DIRECTORY");

        tblPatients.setForeground(new java.awt.Color(204, 0, 0));
        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "DATE", "ENCOUNTER NO", "PERSON ID", "TEMPERATURE", "BLOOD PRESSURE", "PULSE", "Community"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblPatients);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("ENTER COMMUNITY NAME TO CHECK NO OF PERSONS WITH ABNORMAL BLOOD PRESSURE");

        btnCount.setBackground(new java.awt.Color(204, 0, 0));
        btnCount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCount.setText("ENTER");
        btnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCount))
                .addContainerGap(299, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
        // TODO add your handling code here:
        String Com = (txtCount.getText());
        HashSet<Integer> sett=new HashSet<Integer>();
        for(patient pa : patientD.getPatientD()){
        if(pa.getComm().equals(Com)){
        
            sett.add(pa.getPid());
        }
        }
       JOptionPane.showMessageDialog(this, sett.size());
    }//GEN-LAST:event_btnCountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTextField txtCount;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPatients.getModel();
        model.setRowCount(0);
        
        for(patient p : patientD.getPatientD()){
            
            Object[] row = new Object[7];
            row[0] = p;
            row[1] = p.getEno();
            row[2] = p.getPid();
            row[3] = p.getTemp();
            row[4] = p.getBp();
            row[5] = p.getPul();
            row[6] = p.getComm();
            
            
            model.addRow(row);
    }
    }
}
