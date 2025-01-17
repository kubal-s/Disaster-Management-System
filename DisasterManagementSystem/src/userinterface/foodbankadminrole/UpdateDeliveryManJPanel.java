/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.foodbankadminrole;

import business.db4outil.DB4OUtil;
import business.config.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.user.User;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class UpdateDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDeliveryManJPanel
     */    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount foodBankAdminAccount;
    UserAccount deliveryMan;
    Enterprise currentEnterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public UpdateDeliveryManJPanel(JPanel userProcessContainer, EcoSystem ecosystem,UserAccount foodBankAdmin,UserAccount deliveryMan) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.foodBankAdminAccount = foodBankAdmin;
        this.deliveryMan = deliveryMan;
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

        txtDeliveryManPhoneNo = new javax.swing.JTextField();
        txtDeliveryManPassword = new javax.swing.JTextField();
        txtDeliveryManName = new javax.swing.JTextField();
        btnAddDeliveryMan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtDeliveryManUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblEnterpriseName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));

        txtDeliveryManPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryManPhoneNoActionPerformed(evt);
            }
        });

        txtDeliveryManPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryManPasswordActionPerformed(evt);
            }
        });

        txtDeliveryManName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryManNameActionPerformed(evt);
            }
        });

        btnAddDeliveryMan.setText("Update");
        btnAddDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeliveryManActionPerformed(evt);
            }
        });

        jLabel1.setText("Delivery Man Name");

        jLabel2.setText("Delivery Man Username");

        jLabel3.setText("Delivery Man Phone No.");

        jLabel4.setText("Delivery Man Password");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtDeliveryManUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryManUsernameActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/deliverymanadd.jpg"))); // NOI18N

        lblEnterpriseName.setText("Enterprise Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddDeliveryMan)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDeliveryManPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDeliveryManPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDeliveryManUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDeliveryManName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEnterpriseName))))
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5)))
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblEnterpriseName))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDeliveryManName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDeliveryManUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDeliveryManPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDeliveryManPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddDeliveryMan))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeliveryManPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryManPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryManPhoneNoActionPerformed

    private void txtDeliveryManPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryManPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryManPasswordActionPerformed

    private void txtDeliveryManNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryManNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryManNameActionPerformed

    private void btnAddDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeliveryManActionPerformed
        // TODO add your handling code here:
        if(txtDeliveryManName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter delivery man name!");
            return;
        }
        if(txtDeliveryManUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter delivery man username!");
            return;
        }
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(txtDeliveryManUsername.getText())&&!this.deliveryMan.getUsername().equals(txtDeliveryManUsername.getText())){
                JOptionPane.showMessageDialog(null,"Username already exists... please enter a different username!");
                return;
            }
        }
        if(txtDeliveryManPhoneNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter delivery man phone Number!");
            return;
        }
        User tempUser = new User();
        if(!tempUser.validatePhoneNumber(txtDeliveryManPhoneNo.getText())){
            JOptionPane.showMessageDialog(null,"Please enter phone 10 digits only!");
            return;
        }
        if(txtDeliveryManPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter delivery man password!");
            return;
        }
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(this.deliveryMan.getUsername())){
                ua.getUser().setName(txtDeliveryManName.getText());
                ua.getUser().setPhone(txtDeliveryManPhoneNo.getText());
                ua.setUsername(txtDeliveryManUsername.getText());
                ua.setPassword(txtDeliveryManPassword.getText());
                break;
            }
        }

        dB4OUtil.storeSystem(ecosystem);

        isEnabled(false);

        JOptionPane.showMessageDialog(null,"Delivery man updated successfully!");
        return;
        }
        public void initialize(){
            txtDeliveryManName.setText(this.deliveryMan.getUser().getName());
            txtDeliveryManPassword.setText(this.deliveryMan.getPassword());
            txtDeliveryManPhoneNo.setText(this.deliveryMan.getUser().getPhone());
            txtDeliveryManUsername.setText(this.deliveryMan.getUsername());
            outerloop:
            for(Network n:this.ecosystem.getNetworkList()){
                for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getUserAccount().getUsername().equals(this.foodBankAdminAccount.getUsername())){
                        this.currentEnterprise = e;
                        break outerloop;
                    }
                }
            }
            lblEnterpriseName.setText(this.currentEnterprise.getName());
    }//GEN-LAST:event_btnAddDeliveryManActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof FoodBankAdminRoleWorkAreaJPanel){
                FoodBankAdminRoleWorkAreaJPanel fbarwajp =(FoodBankAdminRoleWorkAreaJPanel) comp;
                fbarwajp.populatePackagers();
                fbarwajp.populateDeliveryMan();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDeliveryManUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryManUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryManUsernameActionPerformed

    public void isEnabled(boolean b){
        txtDeliveryManName.setEnabled(b);
        txtDeliveryManPassword.setEnabled(b);
        txtDeliveryManPhoneNo.setEnabled(b);
        txtDeliveryManUsername.setEnabled(b);
//        txtDisasterManagmt.setEnabled(b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDeliveryMan;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JTextField txtDeliveryManName;
    private javax.swing.JTextField txtDeliveryManPassword;
    private javax.swing.JTextField txtDeliveryManPhoneNo;
    private javax.swing.JTextField txtDeliveryManUsername;
    // End of variables declaration//GEN-END:variables
}
