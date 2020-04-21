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
import business.organization.Organization;
import business.role.FoodPackagerRole;
import business.role.Role;
import business.useraccount.UserAccount;
import business.user.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class AddPackagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPackagerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount foodBankAdmin;
    Enterprise currentEnterprise;
    
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public AddPackagerJPanel(JPanel userProcessContainer, EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.foodBankAdmin = userAccount;
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

        txtPackagerPhoneNo = new javax.swing.JTextField();
        txtPackagerName = new javax.swing.JTextField();
        btnAddPackaget = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtPackagerUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPackagerPassword = new javax.swing.JPasswordField();
        lblEnterpriseName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));

        txtPackagerPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackagerPhoneNoActionPerformed(evt);
            }
        });

        txtPackagerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackagerNameActionPerformed(evt);
            }
        });

        btnAddPackaget.setText("Add");
        btnAddPackaget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPackagetActionPerformed(evt);
            }
        });

        jLabel1.setText("Packager Name");

        jLabel2.setText("Packager Username");

        jLabel3.setText("Packager Phone No.");

        jLabel4.setText("Packager Password");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPackagerUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackagerUsernameActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/foodpackager.png"))); // NOI18N

        txtPackagerPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackagerPasswordActionPerformed(evt);
            }
        });

        lblEnterpriseName.setText("Enterprise Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddPackaget)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(78, 78, 78)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnterpriseName)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPackagerPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txtPackagerUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txtPackagerName, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txtPackagerPassword)))))
                .addGap(128, 128, 128)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblEnterpriseName))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPackagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPackagerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPackagerPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPackagerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddPackaget))
                    .addComponent(jLabel5))
                .addGap(323, 323, 323))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPackagerPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackagerPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackagerPhoneNoActionPerformed

    private void txtPackagerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackagerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackagerNameActionPerformed

    private void btnAddPackagetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPackagetActionPerformed
        // TODO add your handling code here:
        if(txtPackagerName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter packager name!");
            return;
        }
        if(txtPackagerUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter packager username!");
            return;
        }
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(txtPackagerUsername.getText())){
                JOptionPane.showMessageDialog(null,"Username already exists... please enter a different username!");
                return;
            }
        }
        if(txtPackagerPhoneNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter packager phone Number!");
            return;
        }
        
        User tempUser = new User();
        if(!tempUser.validatePhoneNumber(txtPackagerPhoneNo.getText())){
            JOptionPane.showMessageDialog(null,"Please enter phone 10 digits only!");
            return;
        }
        if(txtPackagerPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter packager password!");
            return;
        }

        Role role = new FoodPackagerRole();
        User user = ecosystem.getUserDirectory().createUser(txtPackagerUsername.getText());
        user.setPhone(txtPackagerPhoneNo.getText());

        UserAccount ua = this.ecosystem.getUserAccountDirectory().createUserAccount(txtPackagerUsername.getText(),txtPackagerPassword.getText() , user, role);
        outerloop:
        for(Network n:this.ecosystem.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(this.currentEnterprise.getName())){
                    e.getUserAccountDirectory().addUserAccount(ua);
                    for(Organization o :e.getOrganizationDirectory().getOrganizationList()){
                        if(o.getName().equals(Organization.Type.FoodPackaging.getValue())){
                            o.getUserAccountDirectory().addUserAccount(ua);
                            break outerloop;
                        }
                    }
                }
            }
        }

        dB4OUtil.storeSystem(ecosystem);

        clearSelections();

        JOptionPane.showMessageDialog(null,"Packager added successfully!");
        return;
        }
        public void initialize(){
            outerloop:
            for(Network n:this.ecosystem.getNetworkList()){
                for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getUserAccount().getUsername().equals(this.foodBankAdmin.getUsername())){
                        this.currentEnterprise = e;
                        break outerloop;
                    }
                }
            }
            lblEnterpriseName.setText(this.currentEnterprise.getName());
    }//GEN-LAST:event_btnAddPackagetActionPerformed
    public void clearSelections(){
        txtPackagerName.setText("");
        txtPackagerPassword.setText("");
        txtPackagerPhoneNo.setText("");
        txtPackagerUsername.setText("");
    }
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

    private void txtPackagerUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackagerUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackagerUsernameActionPerformed

    private void txtPackagerPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackagerPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackagerPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPackaget;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JTextField txtPackagerName;
    private javax.swing.JPasswordField txtPackagerPassword;
    private javax.swing.JTextField txtPackagerPhoneNo;
    private javax.swing.JTextField txtPackagerUsername;
    // End of variables declaration//GEN-END:variables
}
