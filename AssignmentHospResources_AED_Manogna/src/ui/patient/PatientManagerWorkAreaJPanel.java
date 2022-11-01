/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.patient;

import model.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author manognapallapothu
 */
public class PatientManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientManagerWorkAreaJPanel
     */
    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    
    public PatientManagerWorkAreaJPanel(JPanel userProcessContainer,
            PersonDirectory personDirectory ) {
        initComponents();
        this.personDirectory= personDirectory;
        this.userProcessContainer=userProcessContainer;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managePatientsJButton = new javax.swing.JButton();
        manageVitalSignsJButton = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 153, 255));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(500, 700));

        managePatientsJButton.setText("Patients Directory");
        managePatientsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientsJButtonActionPerformed(evt);
            }
        });

        manageVitalSignsJButton.setText("Encounter History");
        manageVitalSignsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVitalSignsJButtonActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(managePatientsJButton)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(manageVitalSignsJButton)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managePatientsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageVitalSignsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(513, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePatientsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientsJButtonActionPerformed
        // TODO add your handling code here:
        ManagePatientsJPanel mpJPanel= 
                new ManagePatientsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mpJPanel", mpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePatientsJButtonActionPerformed

    private void manageVitalSignsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVitalSignsJButtonActionPerformed
        // TODO add your handling code here:
        ManageVitalSignsJPanel mvsJPanel= 
                new ManageVitalSignsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mvsJPanel", mvsJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVitalSignsJButtonActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton managePatientsJButton;
    private javax.swing.JButton manageVitalSignsJButton;
    // End of variables declaration//GEN-END:variables
}