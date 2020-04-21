/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.policeadminrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodBankEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalToPoliceRequest;
import Business.WorkQueue.VictimHelpRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.request.FoodBankToNGORequestDetailsJPanel;
import userinterface.request.HospitalToPoliceRequestDetailsJPanel;
import userinterface.request.PoliceToHospitalRequestDetailsJPanel;
import userinterface.request.VictimRequestDetailsJPanel;


public class PoliceAdminRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceAdminRoleWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount policeAdminAccount;
    private Enterprise currentEnterprise;

    public PoliceAdminRoleWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.policeAdminAccount = userAccount;
        initialize();
        populatePoliceOfficers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancel = new javax.swing.JButton();
        btnRequestHospitalBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestDirectory = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVolunteersDirectory = new javax.swing.JTable();
        btnAddPoliceOfficer = new javax.swing.JButton();
        btnUpdatePoliceOfficer = new javax.swing.JButton();
        btnDeletePoliceOfficer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 240));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnRequestHospitalBtn.setText("Request Hospital Help");
        btnRequestHospitalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestHospitalBtnActionPerformed(evt);
            }
        });

        tblRequestDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "RequestID", "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestDirectory);

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        tblVolunteersDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Police Officer Username", "Police Officer Name", "Police Officer Phone No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVolunteersDirectory);

        btnAddPoliceOfficer.setText("Add Police Officer");
        btnAddPoliceOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPoliceOfficerActionPerformed(evt);
            }
        });

        btnUpdatePoliceOfficer.setText("Update Police Officer");
        btnUpdatePoliceOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePoliceOfficerActionPerformed(evt);
            }
        });

        btnDeletePoliceOfficer.setText("Delete Police Officer");
        btnDeletePoliceOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePoliceOfficerActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/policestation.jpeg"))); // NOI18N

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRequestHospitalBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnDeletePoliceOfficer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddPoliceOfficer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdatePoliceOfficer, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewDetails)
                        .addGap(8, 8, 8)
                        .addComponent(btnProcess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRequestHospitalBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddPoliceOfficer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdatePoliceOfficer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletePoliceOfficer)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int selectedRow = tblRequestDirectory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a request to cancel");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();
            int requestID = (int) (Integer) dtm.getValueAt(selectedRow, 0);
            WorkRequest cwr = null;
            cwr = ecosystem.getWorkQueue().getWorkRequestByID(requestID);
            if (cwr.getStatus().equals("completed")) {
                JOptionPane.showMessageDialog(null, "Cannot cancel request already completed");
            } else {
                cwr.setStatus("submitted");
                cwr.setAssignedEnterprise(null);
                JOptionPane.showMessageDialog(null,"Request unassigned!");
            }
            populateRequests();
        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRequestHospitalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestHospitalBtnActionPerformed
        int selectedRow = tblRequestDirectory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a request to process");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();

            int requestID = (int) (Integer) dtm.getValueAt(selectedRow, 0);
            WorkRequest cwr = null;
            cwr = ecosystem.getWorkQueue().getWorkRequestByID(requestID);
            if(cwr instanceof HospitalToPoliceRequest){
                JOptionPane.showMessageDialog(null, "Cannot create hospital help request!");
            }
            else if(!cwr.getStatus().equals("submitted")){
                cwr.setAssignedEnterprise(this.currentEnterprise);
                JPanel requestHospitalHelpJPanel = new RequestHospitalHelpJPanel(userProcessContainer, ecosystem, cwr, policeAdminAccount);
                userProcessContainer.add("requestHospitalHelp", requestHospitalHelpJPanel);
                CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                cardLayout.next(this.userProcessContainer);
                JOptionPane.showMessageDialog(null,"Request submitted to hospitals!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Request not approved yet!");
            }
            populateRequests();
        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnRequestHospitalBtnActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        int selectedRow = tblRequestDirectory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a request to process");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();

            int requestID = (int) (Integer) dtm.getValueAt(selectedRow, 0);
            WorkRequest cwr = null;
            cwr = ecosystem.getWorkQueue().getWorkRequestByID(requestID);
            if(cwr.getStatus().equals("submitted")){
                cwr.setStatus("approved for investigation");
                if (cwr instanceof HospitalToPoliceRequest){
                    ((HospitalToPoliceRequest)cwr).getVictimHelpRequest().setStatus("approved for investigation");
                }
                cwr.setAssignedEnterprise(this.currentEnterprise);
                JOptionPane.showMessageDialog(null, "Approved for investigation!");
            }
            else if (cwr.getStatus().equals("cancelled")) {
                JOptionPane.showMessageDialog(null, "Cannot process! request already cancelled");
            }
            else{
                JOptionPane.showMessageDialog(null, "Already approved");
            }
            populateRequests();
        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnAddPoliceOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPoliceOfficerActionPerformed
        // TODO add your handling code here:
        JPanel addPoliceOfficerJPanel = new AddPoliceOfficerJPanel(userProcessContainer, ecosystem, policeAdminAccount);
        userProcessContainer.add("addPoliceOfficer", addPoliceOfficerJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnAddPoliceOfficerActionPerformed

    private void btnUpdatePoliceOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePoliceOfficerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVolunteersDirectory.getSelectedRow();
        if (selectedRow >= 0) {
            UserAccount policeOffice = ((UserAccount) tblVolunteersDirectory.getValueAt(selectedRow, 0));
            //Item selectedItem = restaurant.getMenu().getItemFromName(selectedItemName);
            JPanel updatePoliceOfficerJPanel = new UpdatePoliceOfficerJPanel(userProcessContainer, ecosystem, policeAdminAccount, policeOffice);
            userProcessContainer.add("updatePoliceOfficer", updatePoliceOfficerJPanel);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(this.userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnUpdatePoliceOfficerActionPerformed

    private void btnDeletePoliceOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePoliceOfficerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVolunteersDirectory.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                UserAccount policeOfficer = (UserAccount) tblVolunteersDirectory.getValueAt(selectedRow, 0);
                for (UserAccount ua : this.ecosystem.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(policeOfficer.getUsername())) {
                        this.ecosystem.getUserAccountDirectory().getUserAccountList().remove(ua);
                        break;
                    }
                }
                outerloop:
                for (Network n : this.ecosystem.getNetworkList()) {
                    for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                        if (e.getUserAccount().getUsername().equals(this.policeAdminAccount.getUsername())) {
                            this.currentEnterprise = e;
                            for (UserAccount pol : e.getUserAccountDirectory().getUserAccountList()) {
                                if (pol.getUsername().equals(policeOfficer.getUsername())) {
                                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                                        if (o.getName().equals(Organization.Type.PoliceOfficer.getValue())) {
                                            o.getUserAccountDirectory().getUserAccountList().remove(pol);
                                            e.getUserAccountDirectory().getUserAccountList().remove(pol);
                                            break outerloop;
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
                dB4OUtil.storeSystem(this.ecosystem);
                populatePoliceOfficers();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }


    }//GEN-LAST:event_btnDeletePoliceOfficerActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequestDirectory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a request to view details");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();
            int requestID = (int) (Integer) dtm.getValueAt(selectedRow, 0);
            WorkRequest cwr = null;
            cwr = ecosystem.getWorkQueue().getWorkRequestByID(requestID);

            if (cwr instanceof VictimHelpRequest) {
                JPanel victimRequestDetailsJPanel = new VictimRequestDetailsJPanel(userProcessContainer, cwr);
                userProcessContainer.add("RequestDetails", victimRequestDetailsJPanel);
                CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                cardLayout.next(this.userProcessContainer);
            } else {
                JPanel hospitalToPoliceRequestDetailsJPanel = new HospitalToPoliceRequestDetailsJPanel(userProcessContainer, cwr);
                userProcessContainer.add("RequestDetails", hospitalToPoliceRequestDetailsJPanel);
                CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                cardLayout.next(this.userProcessContainer);
            }

        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnViewDetailsActionPerformed



    public void populatePoliceOfficers() {
        DefaultTableModel dtm = (DefaultTableModel) tblVolunteersDirectory.getModel();
        dtm.setRowCount(0);
        for (UserAccount n : this.currentEnterprise.getUserAccountDirectory().getUserAccountList()) {
            if (n.getRole().getRoleType().equals(Role.RoleType.PoliceOfficer)) {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = n;
                row[1] = n.getUser().getName();
                row[2] = n.getUser().getPhone();
                dtm.addRow(row);
            }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPoliceOfficer;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeletePoliceOfficer;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRequestHospitalBtn;
    private javax.swing.JButton btnUpdatePoliceOfficer;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRequestDirectory;
    private javax.swing.JTable tblVolunteersDirectory;
    // End of variables declaration//GEN-END:variables

    private void populateRequests() {
        DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();
        dtm.setRowCount(0);

        for (WorkRequest w : ecosystem.getWorkQueue().getWorkRequestList()) {
            System.out.println(w.getAddress());
            if (w.getRequestedEnterprise().equals(Enterprise.EnterpriseType.PoliceDepartment)
                    && w.getAssignedEnterprise() == null
                    && this.currentEnterprise.getZipCodes().contains(w.getAddress().getZipcode())
                    && w.getStatus().equals("submitted")) {
                Object[] row = new Object[tblRequestDirectory.getColumnCount()];
                row[0] = w.getRequestID();
                row[1] = w.getSender().getUser().getName();
                row[2] = w.getStatus();
                dtm.addRow(row);
            }
        }

        for (WorkRequest w : ecosystem.getWorkQueue().getWorkRequestList()) {
            if (w.getAssignedEnterprise() == this.currentEnterprise) {
                Object[] row = new Object[tblRequestDirectory.getColumnCount()];
                row[0] = w.getRequestID();
                row[1] = w.getSender().getUser().getName();
                row[2] = w.getStatus();
                dtm.addRow(row);
            }
        }
    }

    public void initialize() {
        outerloop:
        for (Network n : this.ecosystem.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getUserAccount().getUsername().equals(this.policeAdminAccount.getUsername())) {
                    this.currentEnterprise = e;
                    break outerloop;
                }
            }
        }

       populateRequests();
    }
}
