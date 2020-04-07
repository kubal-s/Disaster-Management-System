/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ngoadminrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NonGovernmentOrganizationEnterprise;
import Business.Network.Network;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhil
 */
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

        tblRequestDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
                "Volunteer Username", "Volunteer Name", "Volunteer phone No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDeleteVolunteer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddVolunteer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateVolunteer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddVolunteer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateVolunteer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteVolunteer)
                .addGap(45, 45, 45))
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
                                    e.getUserAccountDirectory().getUserAccountList().remove(vol);
                                    break outerloop;
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
    public void initialize(){
        outerloop:
        for(Network n:this.ecosystem.getNetworkList()){
            for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getUserAccount().getUsername().equals(this.ngoAdminAccount.getUsername())){
                    this.currentEnterprise = e;
                    break outerloop;
                }
            }
        }

    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVolunteer;
    private javax.swing.JButton btnDeleteVolunteer;
    private javax.swing.JButton btnUpdateVolunteer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRequestDirectory;
    private javax.swing.JTable tblVolunteersDirectory;
    // End of variables declaration//GEN-END:variables
}