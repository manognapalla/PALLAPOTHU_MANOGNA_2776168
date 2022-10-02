/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.employee;
import model.employeeHistory;

/**
 *
 * @author riddhivora
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    employeeHistory history;
    private employeeHistory selectedemployeeHistory;
    public ViewJPanel(employeeHistory history) {
        initComponents();
        this.history = history;
        
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

        jProgressBar1 = new javax.swing.JProgressBar();
        lblemployeedetails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemployee = new javax.swing.JTable();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        IblemployeeID = new javax.swing.JLabel();
        txtemployeeid = new javax.swing.JTextField();
        IblAge = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        Iblgender = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        lblContactinfo = new javax.swing.JLabel();
        Iblstartdate = new javax.swing.JLabel();
        txtstartdate = new javax.swing.JTextField();
        Ibllevel = new javax.swing.JLabel();
        txtlevel = new javax.swing.JTextField();
        lblteaminfo = new javax.swing.JLabel();
        txtteaminfo = new javax.swing.JTextField();
        lblposition = new javax.swing.JLabel();
        txtpositiontitle = new javax.swing.JTextField();
        lblcellphonenumber = new javax.swing.JLabel();
        txtcellphonenumber = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        Iblname = new javax.swing.JLabel();
        btnupdatesave = new javax.swing.JButton();

        lblemployeedetails.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblemployeedetails.setText("                                                       View Employee Details");
        lblemployeedetails.setSize(new java.awt.Dimension(42, 25));

        tblemployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "EmployeeID", "Age", "Gender", "Start Date", "Level", "Team Info", "Position Title", "Cell Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblemployee);

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnsearch.setText("Search");

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        IblemployeeID.setText("EmployeeID:");

        IblAge.setText("Age:");

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });

        Iblgender.setText("Gender:");

        lblContactinfo.setText("Contact Information:");

        Iblstartdate.setText("Start Date:");

        txtstartdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstartdateActionPerformed(evt);
            }
        });

        Ibllevel.setText("Level:");

        lblteaminfo.setText("Team Info:");

        lblposition.setText("PositionTitle:");

        txtpositiontitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpositiontitleActionPerformed(evt);
            }
        });

        lblcellphonenumber.setText("Cell Phone Number:");

        lblemail.setText("                    Email:");

        Iblname.setText("Name:");

        btnupdatesave.setText("Save");
        btnupdatesave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatesaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnview)
                        .addGap(18, 18, 18)
                        .addComponent(btnupdatesave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblContactinfo)
                                        .addGap(467, 467, 467))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblemail, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblcellphonenumber)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtcellphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblposition)
                                        .addComponent(lblteaminfo)
                                        .addComponent(Ibllevel)
                                        .addComponent(Iblstartdate)
                                        .addComponent(Iblgender)
                                        .addComponent(IblAge)
                                        .addComponent(IblemployeeID)
                                        .addComponent(Iblname))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtpositiontitle, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtteaminfo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtlevel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtstartdate, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtgender, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtage, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtemployeeid, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(btnsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblemployeedetails, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btndelete, btnupdate, btnview});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblemployeedetails, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnupdate)
                    .addComponent(btndelete)
                    .addComponent(btnview)
                    .addComponent(btnupdatesave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname)
                    .addComponent(Iblname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IblemployeeID))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Iblgender))
                        .addGap(18, 18, 18)
                        .addComponent(txtstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(Iblstartdate)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ibllevel)
                    .addComponent(txtlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblteaminfo)
                    .addComponent(txtteaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblposition)
                    .addComponent(txtpositiontitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblContactinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcellphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcellphonenumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblemail))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtageActionPerformed

    private void txtstartdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstartdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstartdateActionPerformed

    private void txtpositiontitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpositiontitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpositiontitleActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblemployee.getSelectedRow();
        
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please Select a Row");
            return; 
            
        }
        DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
        
        employee selectedemployee = (employee) model.getValueAt(selectedRowIndex , 0);
      
     txtname.setText(selectedemployee.getName());
     txtemployeeid.setText(String.valueOf(selectedemployee.getEmployeeID()));
     txtage.setText(String.valueOf(selectedemployee.getAge()));
     txtgender.setText(selectedemployee.getGender());
     txtstartdate.setText(selectedemployee.getStartdate());
     txtlevel.setText(selectedemployee.getLevel());
     txtteaminfo.setText(selectedemployee.getTeaminfo());
     txtpositiontitle.setText(selectedemployee.getPositiontitle());
     txtcellphonenumber.setText(selectedemployee.getCellphone());
     txtemail.setText(selectedemployee.getEmail());
    }//GEN-LAST:event_btnviewActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblemployee.getSelectedRow();
        
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please Select a Row");
            return; 
            
        }
        DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
        
        employee selectedemployee = (employee) model.getValueAt(selectedRowIndex , 0);
      
        history.deleteemployee(selectedemployee);
        
        JOptionPane.showMessageDialog(this, "Employee Detail deleted");
        
        populateTable();
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblemployee.getSelectedRow();
        
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please Select a Row to update");
            return; 
            
        }
        DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
        
        employee selectedemployee = (employee) model.getValueAt(selectedRowIndex , 0);
        
        txtname.setText(selectedemployee.getName());
     txtemployeeid.setText(String.valueOf(selectedemployee.getEmployeeID()));
     txtage.setText(String.valueOf(selectedemployee.getAge()));
     txtgender.setText(selectedemployee.getGender());
     txtstartdate.setText(selectedemployee.getStartdate());
     txtlevel.setText(selectedemployee.getLevel());
     txtteaminfo.setText(selectedemployee.getTeaminfo());
     txtpositiontitle.setText(selectedemployee.getPositiontitle());
     txtcellphonenumber.setText(selectedemployee.getCellphone());
     txtemail.setText(selectedemployee.getEmail());
     
        
        
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnupdatesaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatesaveActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblemployee.getSelectedRow();
        
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please Select a Row to update");
            return; 
            
        }
        DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
        
        employee selectedemployee = (employee) model.getValueAt(selectedRowIndex , 0);
        
        selectedemployee.setName(txtname.getText());
        selectedemployee.setEmployeeID(Integer.parseInt(txtemployeeid.getText()));
        selectedemployee.setAge(Integer.parseInt(txtage.getText()));
        selectedemployee.setGender(txtgender.getText());
        selectedemployee.setStartDate(txtstartdate.getText());
        selectedemployee.setLevel(txtlevel.getText());
        selectedemployee.setTeaminfo(txtteaminfo.getText());
        selectedemployee.setPositiontitle(txtpositiontitle.getText());
        selectedemployee.setCellPhone(txtcellphonenumber.getText());
        selectedemployee.setEmail(txtemail.getText());
        
        populateTable();
        
        txtname.setText("");
        txtemployeeid.setText("");
        txtage.setText("");
        txtgender.setText("");
        txtstartdate.setText("");
        txtlevel.setText("");
        txtteaminfo.setText("");
        txtpositiontitle.setText("");
        txtcellphonenumber.setText("");
        txtemail.setText("");
        
        
    }//GEN-LAST:event_btnupdatesaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IblAge;
    private javax.swing.JLabel IblemployeeID;
    private javax.swing.JLabel Iblgender;
    private javax.swing.JLabel Ibllevel;
    private javax.swing.JLabel Iblname;
    private javax.swing.JLabel Iblstartdate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdatesave;
    private javax.swing.JButton btnview;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblContactinfo;
    private javax.swing.JLabel lblcellphonenumber;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblemployeedetails;
    private javax.swing.JLabel lblposition;
    private javax.swing.JLabel lblteaminfo;
    private javax.swing.JTable tblemployee;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcellphonenumber;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtemployeeid;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtlevel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpositiontitle;
    private javax.swing.JTextField txtstartdate;
    private javax.swing.JTextField txtteaminfo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel)tblemployee.getModel();
        model.setRowCount(0);
        
        for (employee emp : history.getHistory()){
       Object[] row = new Object [10];
       row[0] = emp;
       row[1] = emp.getEmployeeID();
       row[2] = emp.getAge();
       row[3] = emp.getGender();
       row[4] = emp.getStartdate();
       row[5] = emp.getLevel();
       row[6] = emp.getTeaminfo();
       row[7] = emp.getPositiontitle();
       row[8] = emp.getCellphone();
       row[9] = emp.getEmail();
       
       model.addRow(row);
       
        
    }
}
       
}
