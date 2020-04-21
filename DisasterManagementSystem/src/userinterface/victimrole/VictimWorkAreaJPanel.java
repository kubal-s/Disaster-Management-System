/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.victimrole;

import business.db4outil.DB4OUtil;
import business.config.EcoSystem;
import business.enterprise.Enterprise;
import business.useraccount.UserAccount;
import business.workqueue.PoliceToHospitalRequest;
import business.workqueue.VictimHelpRequest;
import business.workqueue.WorkRequest;
import business.address.Address;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.policeofficerrole.PoliceOfficerTasksJPanel;
import userinterface.request.VictimRequestDetailsJPanel;

public class VictimWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VictimWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount victimUserAccount;
    private List<WorkRequest> victimWorkRequests;
    private DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");

    public VictimWorkAreaJPanel(JPanel userProcessContainer, UserAccount victimUserAccount) {
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = DB4OUtil.getInstance().retrieveSystem();
        this.victimUserAccount = victimUserAccount;

        initComponents();
        // Create and initialize the Engine
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSubmitHelpRequest = new javax.swing.JButton();
        comboxEnterprise = new javax.swing.JComboBox();
        txtSummary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtPeopleAffected = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        txtUnitNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHelpRequest = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 240));

        jLabel1.setText("Create Help Request");

        jLabel5.setText("Description");

        jLabel2.setText("Summary");

        jLabel3.setText("Enterprise");

        btnSubmitHelpRequest.setText("Submit");
        btnSubmitHelpRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitHelpRequestActionPerformed(evt);
            }
        });

        comboxEnterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboxEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxEnterpriseActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.setText("\n");
        jScrollPane1.setViewportView(txtDescription);

        jLabel4.setText("People Affected");

        txtPeopleAffected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeopleAffectedActionPerformed(evt);
            }
        });

        jLabel6.setText("Location");

        jLabel9.setText("State");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        jLabel10.setText("Zipcode");

        jLabel11.setText("Phone number");

        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        txtUnitNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitNumberActionPerformed(evt);
            }
        });

        jLabel8.setText("Street");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        jLabel12.setText("Unit Number");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        jLabel13.setText("City");

        txtZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipcodeActionPerformed(evt);
            }
        });

        jLabel7.setText("Help History");

        tblHelpRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestID", "Date", "Summary", "Enterprise", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblHelpRequest);

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/wecarevictim2.jpg"))); // NOI18N

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnSubmitHelpRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtZipcode, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtState, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtUnitNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPeopleAffected, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 307, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewDetails)
                        .addGap(20, 20, 20)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboxEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPeopleAffected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(8, 8, 8)
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSubmitHelpRequest)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewDetails)
                            .addComponent(btnCancel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitHelpRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitHelpRequestActionPerformed
        // TODO add your handling code here:
        if (txtSummary.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please state the problem faced..enter summary!");
            return;
        }
        if (txtPeopleAffected.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter number of people affected!");
            return;
        }
        try {
            Integer.parseInt(txtPeopleAffected.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please people affected in digits!");
            return;
        }
        if (txtCity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter city name!");
            return;
        }
        if (txtState.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter state name!");
            return;
        }
        if (txtZipcode.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter zipcode!");
            return;
        }
        WorkRequest victimWorkRequest = new VictimHelpRequest();
        victimWorkRequest.setRequestID(ecosystem.getWorkQueue().getRequestID());
        victimWorkRequest.setRequestedEnterprise((Enterprise.EnterpriseType) comboxEnterprise.getSelectedItem());
        victimWorkRequest.setSummary(txtSummary.getText());
        victimWorkRequest.setDescription(txtDescription.getText());
        ((VictimHelpRequest) victimWorkRequest).setPeopleAffected(Integer.parseInt(txtPeopleAffected.getText()));
        Address victimWorkRequestAddress = new Address();
        victimWorkRequestAddress.setStreetName(txtStreet.getText());
        victimWorkRequestAddress.setUnitNumber(txtUnitNumber.getText());
        victimWorkRequestAddress.setCity(txtCity.getText());
        victimWorkRequestAddress.setState(txtState.getText());
        victimWorkRequestAddress.setZipcode(txtZipcode.getText());
        victimWorkRequest.setAddress(victimWorkRequestAddress);
        victimWorkRequest.setSender(victimUserAccount);
        victimWorkRequest.setStatus("submitted");
        victimWorkRequest.setRequestDate(new Date());
        populateTbl(victimWorkRequest);
        clearFields();
        this.ecosystem.getWorkQueue().add(victimWorkRequest);
        DB4OUtil.getInstance().storeSystem(ecosystem);
        JOptionPane.showMessageDialog(null, "Request submitted successfully!");
        return;
    }//GEN-LAST:event_btnSubmitHelpRequestActionPerformed

    private void comboxEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboxEnterpriseActionPerformed

    private void txtPeopleAffectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeopleAffectedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeopleAffectedActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed

    private void txtUnitNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitNumberActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipcodeActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
                // TODO add your handling code here:

        int selectedRow = tblHelpRequest.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a request to view details");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblHelpRequest.getModel();
            int requestID = (int) (Integer) dtm.getValueAt(selectedRow, 0);
            WorkRequest cwr = null;
            cwr = ecosystem.getWorkQueue().getWorkRequestByID(requestID);
            JPanel victimRequestDetailsJPanel = new VictimRequestDetailsJPanel(userProcessContainer, cwr);
            userProcessContainer.add("RequestDetails", victimRequestDetailsJPanel);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(this.userProcessContainer);
        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int selectedRow = tblHelpRequest.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a request to cancel");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblHelpRequest.getModel();

            int requestID = (int) (Integer) dtm.getValueAt(selectedRow, 0);
            WorkRequest cwr = null;
            cwr = ecosystem.getWorkQueue().getWorkRequestByID(requestID);
            if (cwr.getStatus().equals("completed")) {
                JOptionPane.showMessageDialog(null, "Cannot cancel completed request");
            } else {
                cwr.setStatus("cancelled");
                JOptionPane.showMessageDialog(null,"Request cancelled!");
                initialize();
            }
        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmitHelpRequest;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JComboBox comboxEnterprise;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblHelpRequest;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtPeopleAffected;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtSummary;
    private javax.swing.JTextField txtUnitNumber;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables

    public void initialize() {
        comboxEnterprise.removeAllItems();
        comboxEnterprise.addItem(Enterprise.EnterpriseType.FoodBank);
        comboxEnterprise.addItem(Enterprise.EnterpriseType.Hospital);
        comboxEnterprise.addItem(Enterprise.EnterpriseType.PoliceDepartment);
        comboxEnterprise.addItem(Enterprise.EnterpriseType.NonGovernmentOrganization);

        victimWorkRequests = ecosystem.getWorkQueue().getWorkRequestListForUser(victimUserAccount);
        DefaultTableModel dtm = (DefaultTableModel) tblHelpRequest.getModel();
        dtm.setRowCount(0);
        for (WorkRequest w : victimWorkRequests) {
            Object[] row = new Object[tblHelpRequest.getColumnCount()];
            row[0] = w.getRequestID();
            row[1] = dateFormat.format(w.getRequestDate());
            row[2] = w.getSummary();
            row[3] = w.getRequestedEnterprise().toString();
            row[4] = w.getStatus();
            dtm.addRow(row);
        }

    }

    public void populateTbl(WorkRequest wr) {
        System.out.println(wr);
        DefaultTableModel dtm = (DefaultTableModel) tblHelpRequest.getModel();
        //dtm.setRowCount(0);
        Object[] row = new Object[tblHelpRequest.getColumnCount()];
        row[0] = wr.getRequestID();
        row[1] = dateFormat.format(wr.getRequestDate());
        row[2] = wr.getSummary();
        row[3] = wr.getRequestedEnterprise().toString();
        row[4] = wr.getStatus();
        dtm.addRow(row);
    }

    private void clearFields() {
        txtSummary.setText("");
        txtDescription.setText("");
        txtPeopleAffected.setText("");
        txtStreet.setText("");
        txtUnitNumber.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZipcode.setText("");
        txtPhoneNumber.setText("");
    }

}
