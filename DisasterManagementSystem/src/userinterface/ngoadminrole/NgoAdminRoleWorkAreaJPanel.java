/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ngoadminrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodBankEnterprise;
import Business.Enterprise.NonGovernmentOrganizationEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodBankToNGORequest;
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


public class NgoAdminRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NgoAdminRoleWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount ngoAdminAccount;
    private Enterprise currentEnterprise;
    public NgoAdminRoleWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.ngoAdminAccount = userAccount;
        initialize();
        populateVolunteers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestDirectory = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVolunteersDirectory = new javax.swing.JTable();
        btnAddVolunteer = new javax.swing.JButton();
        btnUpdateVolunteer = new javax.swing.JButton();
        btnDeleteVolunteer = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 240));

        tblRequestDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Request ID", "Sender", "Status"
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

        tblVolunteersDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Volunteer Username", "Volunteer Name", "Phone No."
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

        btnAddVolunteer.setText("Add Volunteer");
        btnAddVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVolunteerActionPerformed(evt);
            }
        });

        btnUpdateVolunteer.setText("Update Volunteer");
        btnUpdateVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateVolunteerActionPerformed(evt);
            }
        });

        btnDeleteVolunteer.setText("Delete Volunteer");
        btnDeleteVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteVolunteerActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/requestngo.jpg"))); // NOI18N

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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 866, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnUpdateVolunteer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteVolunteer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddVolunteer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(1282, 1282, 1282))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcess)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddVolunteer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdateVolunteer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteVolunteer)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVolunteerActionPerformed
        // TODO add your handling code here:
        JPanel addVolunteerJPanel = new AddVolunteerJPanel(userProcessContainer,ecosystem,ngoAdminAccount);
        userProcessContainer.add("addVolunteer",addVolunteerJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnAddVolunteerActionPerformed

    private void btnUpdateVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateVolunteerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVolunteersDirectory.getSelectedRow();
        if(selectedRow>=0){
            UserAccount volunteer = ((UserAccount)tblVolunteersDirectory.getValueAt(selectedRow, 0));
            //Item selectedItem = restaurant.getMenu().getItemFromName(selectedItemName);
            JPanel updateVolunteerJPanel = new UpdateVolunteerJPanel(userProcessContainer,ecosystem,ngoAdminAccount,volunteer);
            userProcessContainer.add("updateVolunteer",updateVolunteerJPanel);
            CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
            cardLayout.next(this.userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnUpdateVolunteerActionPerformed

    private void btnDeleteVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteVolunteerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVolunteersDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                UserAccount volunteer = (UserAccount)tblVolunteersDirectory.getValueAt(selectedRow, 0);
                for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
                    if(ua.getUsername().equals(volunteer.getUsername())){
                        this.ecosystem.getUserAccountDirectory().getUserAccountList().remove(ua);
                        break;
                    }
                }
                outerloop :
                for(Network n:this.ecosystem.getNetworkList()){
                    for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList()){
                        if(e.getUserAccount().getUsername().equals(this.ngoAdminAccount.getUsername())){
                            this.currentEnterprise = e;
                            for(UserAccount vol : e.getUserAccountDirectory().getUserAccountList()){
                                if(vol.getUsername().equals(volunteer.getUsername())){
                                    for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                                        if(o.getName().equals(Organization.Type.Volunteer.getValue())){
                                            o.getUserAccountDirectory().getUserAccountList().remove(vol);
                                            e.getUserAccountDirectory().getUserAccountList().remove(vol);
                                            break outerloop;
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
                dB4OUtil.storeSystem(this.ecosystem);
                populateVolunteers();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteVolunteerActionPerformed

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
                cwr.setStatus("approved for processing by volunteers");
                cwr.setAssignedEnterprise(this.currentEnterprise);
                JOptionPane.showMessageDialog(null,"Request approved!");
            }
            else if (cwr.getStatus().equals("cancelled")) {
                JOptionPane.showMessageDialog(null, "Cannot process! request already cancelled");
            }
            else{
                JOptionPane.showMessageDialog(null, "Already under processing");
            }
            populateRequests();
        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnProcessActionPerformed

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
                JOptionPane.showMessageDialog(null,"Request unassigned!");
                cwr.setAssignedEnterprise(null);
            }
            populateRequests();
        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnCancelActionPerformed

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
                JPanel foodBankToNGORequestDetailsJPanel = new FoodBankToNGORequestDetailsJPanel(userProcessContainer, cwr);
                userProcessContainer.add("RequestDetails", foodBankToNGORequestDetailsJPanel);
                CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                cardLayout.next(this.userProcessContainer);
            }

        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnViewDetailsActionPerformed
    
    public void populateVolunteers(){
        DefaultTableModel dtm = (DefaultTableModel)tblVolunteersDirectory.getModel();
        dtm.setRowCount(0);   
        for(UserAccount n: this.currentEnterprise.getUserAccountDirectory().getUserAccountList()){  
            if(n.getRole().getRoleType().equals(Role.RoleType.Volunteer)){
                    Object[] row = new Object[dtm.getColumnCount()];
                    row[0]= n;
                    row[1]= n.getUser().getName();
                    row[2] = n.getUser().getPhone();
                    dtm.addRow(row);
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVolunteer;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDeleteVolunteer;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnUpdateVolunteer;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRequestDirectory;
    private javax.swing.JTable tblVolunteersDirectory;
    // End of variables declaration//GEN-END:variables

    private void populateRequests() {
        System.out.println(ecosystem.getWorkQueue().getWorkRequestList().size());
        DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();
        dtm.setRowCount(0);

        for (WorkRequest w : ecosystem.getWorkQueue().getWorkRequestList()) {
            if (w.getRequestedEnterprise().equals(Enterprise.EnterpriseType.NonGovernmentOrganization)
                    && w.getAssignedEnterprise() == null
                    && this.currentEnterprise.getZipCodes().contains(((FoodBankToNGORequest)w).getVictimHelpRequest().getAddress().getZipcode())
                    &&!((FoodBankToNGORequest)w).getVictimHelpRequest().getStatus().equals("submitted")) {
                Object[] row = new Object[tblRequestDirectory.getColumnCount()];
                row[0] = w.getRequestID();
                row[1] = w.getSender().getUser().getName();
                row[2] = w.getStatus();
                dtm.addRow(row);
            }
        }

        for (WorkRequest w : ecosystem.getWorkQueue().getWorkRequestList()) {
            if (w.getAssignedEnterprise() == this.currentEnterprise
                    &&!((FoodBankToNGORequest)w).getVictimHelpRequest().getStatus().equals("submitted")) {
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
                if (e.getUserAccount().getUsername().equals(this.ngoAdminAccount.getUsername())) {
                    this.currentEnterprise = e;
                    break outerloop;
                }
            }
        }

        populateRequests();
    }
}
