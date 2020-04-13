/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.policeadminrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akhil
 */
public class UpdatePoliceOfficerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePoliceOfficerJPanel
     */  
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount policeAdminAccount;
    Enterprise currentEnterprise;
    UserAccount policeOfficer;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();


    public UpdatePoliceOfficerJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount policeAdminAccount, UserAccount policeOfficer) {
        initComponents();    
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.policeAdminAccount = policeAdminAccount;
        this.policeOfficer = policeOfficer;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtPoliceOfficerUsername = new javax.swing.JTextField();
        txtPoliceOfficerPhoneNo = new javax.swing.JTextField();
        txtPoliceOfficerPassword = new javax.swing.JTextField();
        txtPoliceOfficerName = new javax.swing.JTextField();
        btnUpdatePoliceOfficer = new javax.swing.JButton();

        jLabel1.setText("Police officer Name");

        jLabel2.setText("Police officer Username");

        jLabel3.setText("Police officer Phone No.");

        jLabel4.setText("Police officer Password");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPoliceOfficerUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoliceOfficerUsernameActionPerformed(evt);
            }
        });

        txtPoliceOfficerPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoliceOfficerPhoneNoActionPerformed(evt);
            }
        });

        txtPoliceOfficerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoliceOfficerPasswordActionPerformed(evt);
            }
        });

        txtPoliceOfficerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoliceOfficerNameActionPerformed(evt);
            }
        });

        btnUpdatePoliceOfficer.setText("Update");
        btnUpdatePoliceOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePoliceOfficerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdatePoliceOfficer)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4))
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPoliceOfficerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPoliceOfficerPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPoliceOfficerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPoliceOfficerName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPoliceOfficerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPoliceOfficerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPoliceOfficerPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPoliceOfficerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdatePoliceOfficer)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof PoliceAdminRoleWorkAreaJPanel){
                PoliceAdminRoleWorkAreaJPanel narwajp =(PoliceAdminRoleWorkAreaJPanel) comp;
                narwajp.populatePoliceOfficers();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtPoliceOfficerUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoliceOfficerUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoliceOfficerUsernameActionPerformed

    private void txtPoliceOfficerPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoliceOfficerPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoliceOfficerPhoneNoActionPerformed

    private void txtPoliceOfficerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoliceOfficerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoliceOfficerPasswordActionPerformed

    private void txtPoliceOfficerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoliceOfficerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoliceOfficerNameActionPerformed

    private void btnUpdatePoliceOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePoliceOfficerActionPerformed
        // TODO add your handling code here:
        if(txtPoliceOfficerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter police officer name!");
            return;
        }
        if(txtPoliceOfficerUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter police officer username!");
            return;
        }
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(txtPoliceOfficerUsername.getText())&&!this.policeOfficer.getUsername().equals(txtPoliceOfficerUsername.getText())){
                JOptionPane.showMessageDialog(null,"Username already exists... please enter a different username!");
                return;
            }
        }
        if(txtPoliceOfficerPhoneNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter police officer phone Number!");
            return;
        }
        if(txtPoliceOfficerPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter police officer password!");
            return;
        }
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(this.policeOfficer.getUsername())){
                ua.getUser().setName(txtPoliceOfficerName.getText());
                ua.getUser().setPhone(txtPoliceOfficerPhoneNo.getText());
                ua.setUsername(txtPoliceOfficerUsername.getText());
                ua.setPassword(txtPoliceOfficerPassword.getText());
                break;
            }
        }

        dB4OUtil.storeSystem(ecosystem);

        isEnabled(false);

        JOptionPane.showMessageDialog(null,"Police Officer updated successfully!");
        return;
        }
        public void initialize(){
            txtPoliceOfficerName.setText(this.policeOfficer.getUser().getName());
            txtPoliceOfficerPassword.setText(this.policeOfficer.getPassword());
            txtPoliceOfficerPhoneNo.setText(this.policeOfficer.getUser().getPhone());
            txtPoliceOfficerUsername.setText(this.policeOfficer.getUsername());
            outerloop:
            for(Network n:this.ecosystem.getNetworkList()){
                for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getUserAccount().getUsername().equals(this.policeAdminAccount.getUsername())){
                        this.currentEnterprise = e;
                        break outerloop;
                    }
                }
            }
    }//GEN-LAST:event_btnUpdatePoliceOfficerActionPerformed

    public void isEnabled(boolean b){
        txtPoliceOfficerName.setEnabled(b);
        txtPoliceOfficerPassword.setEnabled(b);
        txtPoliceOfficerPhoneNo.setEnabled(b);
        txtPoliceOfficerUsername.setEnabled(b);
//        txtDisasterManagmt.setEnabled(b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdatePoliceOfficer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtPoliceOfficerName;
    private javax.swing.JTextField txtPoliceOfficerPassword;
    private javax.swing.JTextField txtPoliceOfficerPhoneNo;
    private javax.swing.JTextField txtPoliceOfficerUsername;
    // End of variables declaration//GEN-END:variables
}
