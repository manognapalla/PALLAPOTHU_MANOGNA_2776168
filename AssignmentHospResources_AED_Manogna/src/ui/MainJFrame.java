/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ui;

import ui.patient.PatientManagerWorkAreaJPanel;
import model.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import ui.patient.ManagePatientsJPanel;
import ui.patient.ManageVitalSignsJPanel;
import ui.patient.VitalSignReportJPanel;
import ui.person.ManagePersonsJPanel;

/**
 *
 * @author manognapallapothu
 */
public class MainJFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form MainJFrame
     */
    private PersonDirectory personDirectory;
    public MainJFrame() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        personDirectory= new PersonDirectory();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        patientManagerJButton = new javax.swing.JButton();
        managePersonsJButton = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEncounter = new javax.swing.JButton();
        btnDirectory = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        userType = new javax.swing.JComboBox<>();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));

        jSplitPane1.setDividerSize(3);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(700, 700));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(700, 700));

        leftJPanel.setBackground(new java.awt.Color(204, 153, 255));
        leftJPanel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        leftJPanel.setMinimumSize(new java.awt.Dimension(200, 700));
        leftJPanel.setPreferredSize(new java.awt.Dimension(200, 700));

        patientManagerJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        patientManagerJButton.setText("Patients Directory");
        patientManagerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientManagerJButtonActionPerformed(evt);
            }
        });

        managePersonsJButton.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        managePersonsJButton.setText("Person Directory");
        managePersonsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonsJButtonActionPerformed(evt);
            }
        });

        btnDashboard.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnDashboard.setText("Community Dashboard");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select");

        btnEncounter.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnEncounter.setText("Encounter Details");
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });

        btnDirectory.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnDirectory.setText("Patients Details");
        btnDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDirectory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(managePersonsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientManagerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEncounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftJPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(managePersonsJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(patientManagerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(338, 338, 338))
        );

        jSplitPane1.setLeftComponent(leftJPanel);

        userProcessContainer.setMinimumSize(new java.awt.Dimension(500, 700));
        userProcessContainer.setPreferredSize(new java.awt.Dimension(500, 700));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Login Screen");

        userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Hospital Admin", "Community Admin", "Doctor", "Person Login" }));
        userType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTypeActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        btnLogin.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login As:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblUsername)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLogin)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, lblPassword, lblUsername});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, lblPassword, lblUsername, txtPassword, txtUsername});

        userProcessContainer.add(jPanel1, "card2");

        jSplitPane1.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientManagerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientManagerJButtonActionPerformed
        // TODO add your handling code here:
        PatientManagerWorkAreaJPanel pmwaJPanel=
                new PatientManagerWorkAreaJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("pmwaJPanel", pmwaJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_patientManagerJButtonActionPerformed

    private void managePersonsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonsJButtonActionPerformed
        // TODO add your handling code here:
        ManagePersonsJPanel mpJPanel= 
                new ManagePersonsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mpJPanel", mpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePersonsJButtonActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        VitalSignReportJPanel report = new VitalSignReportJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("report",report);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void userTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTypeActionPerformed
        // TODO add your handling code here:
        
        patientManagerJButton.setVisible(false);
        btnDashboard.setVisible(false);
        managePersonsJButton.setVisible(false);
        jLabel1.setVisible(false);
        btnEncounter.setVisible(false);
        btnDirectory.setVisible(false);
        btnLogin.setEnabled(true);
        
        //managePersonsJButton.setVisible(true);
        //jLabel1.setVisible(true);
        
        
         if (userType.getSelectedItem().toString() == "Person Login") {
            txtPassword.setEnabled(false);
            txtUsername.setEnabled(false);
            
        } 
         else {
            txtPassword.setEnabled(true);
            txtUsername.setEnabled(true);
            
        }
//         if (userType.getSelectedItem().toString() == "System Admin"){
//             
//         }
//         if (userType.getSelectedItem().toString() == "System Admin"){
//             
//         }
//         if (userType.getSelectedItem().toString() == "Community Admin"){
//             
//         }
    }//GEN-LAST:event_userTypeActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        patientManagerJButton.setVisible(false);
        btnDashboard.setVisible(false);
        managePersonsJButton.setVisible(false);
        jLabel1.setVisible(false);
        btnEncounter.setVisible(false);
        btnLogin.setEnabled(true);
        /*managePersonsJButton.setVisible(true);
        jLabel1.setVisible(true);
        patientManagerJButton.setVisible(true);
        vitalSignReportJButton.setVisible(true);*/
            
        if (userType.getSelectedItem().toString() == "Person Login") {
            txtPassword.setEnabled(false);
            txtUsername.setEnabled(false);
            jLabel1.setVisible(true);
            managePersonsJButton.setVisible(true);
            
        } 
            
            
            
            
            if (userType.getSelectedItem().toString() == "System Admin") {
            if (txtUsername.getText().matches("admin") && txtPassword.getText().matches("123")) {
                JOptionPane.showMessageDialog(this, "System Admin Login Successfull");
                managePersonsJButton.setVisible(true);
                jLabel1.setVisible(true);
                patientManagerJButton.setVisible(true);
                btnDashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }
            
            }
            
            
            if (userType.getSelectedItem().toString() == "Hospital Admin") {
            if (txtUsername.getText().matches("hospadmin") && txtPassword.getText().matches("123")) {
                JOptionPane.showMessageDialog(this, "Hospital Admin Login Successfull");
                managePersonsJButton.setVisible(true);
                jLabel1.setVisible(true);
                patientManagerJButton.setVisible(true);
                btnDashboard.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }
            }
             
            
            
            
            if (userType.getSelectedItem().toString() == "Community Admin"){
             if (txtUsername.getText().matches("communityadmin") && txtPassword.getText().matches("123")) {
                JOptionPane.showMessageDialog(this, "Community Admin login successfull");
                //managePersonsJButton.setVisible(false);
//                jLabel1.setVisible(true);
//                btnDashboard.setVisible(true);
//                patientManagerJButton.setVisible(false);
//                
//                patientManagerJButton.setEnabled(false);

                VitalSignReportJPanel report = new VitalSignReportJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("report",report);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                
                 
             }  
             else {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }
            }
            
            if (userType.getSelectedItem().toString() == "Doctor"){
             if (txtUsername.getText().matches("doctor") && txtPassword.getText().matches("123")) {
                 JOptionPane.showMessageDialog(this, "Doctor Admin login successfull");
                //managePersonsJButton.setVisible(false);
                jLabel1.setVisible(true);
                btnDashboard.setVisible(false);
                patientManagerJButton.setVisible(false);
                btnEncounter.setVisible(true);
                patientManagerJButton.setEnabled(false);
                btnDirectory.setVisible(true);
                 
             }  
             else {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }
            }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        // TODO add your handling code here:
        ManageVitalSignsJPanel mvsJPanel=new ManageVitalSignsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mvsJPanel", mvsJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnEncounterActionPerformed

    private void btnDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectoryActionPerformed
        // TODO add your handling code here:
        ManagePatientsJPanel mpJPanel=new ManagePatientsJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("mpJPanel", mpJPanel);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDirectoryActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
        * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDirectory;
    private javax.swing.JButton btnEncounter;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JButton managePersonsJButton;
    private javax.swing.JButton patientManagerJButton;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JComboBox<String> userType;
    // End of variables declaration//GEN-END:variables
}
