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
import Business.Organization.Organization;
import Business.Role.PoliceOfficerRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import business.user.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author akhil
 */
public class AddPoliceOfficerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPoliceOfficerJPanel
     */   
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount policeAdminAccount;
    Enterprise currentEnterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public AddPoliceOfficerJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount policeAdminAccount) {
        initComponents();    
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.policeAdminAccount = policeAdminAccount;
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
        txtPoliceOfficerName = new javax.swing.JTextField();
        btnAddPoliceOfficer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPoliceOfficerPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 240));

        jLabel1.setText("Police Officer Name");

        jLabel2.setText("Police Officer Username");

        jLabel3.setText("Police Officer Phone No.");

        jLabel4.setText("Police Officer Password");

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

        txtPoliceOfficerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoliceOfficerNameActionPerformed(evt);
            }
        });

        btnAddPoliceOfficer.setText("Add");
        btnAddPoliceOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPoliceOfficerActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/policeofficer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddPoliceOfficer)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPoliceOfficerPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(txtPoliceOfficerUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(txtPoliceOfficerName, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(txtPoliceOfficerPassword))))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPoliceOfficerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddPoliceOfficer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof PoliceAdminRoleWorkAreaJPanel){
                PoliceAdminRoleWorkAreaJPanel  parwajp=(PoliceAdminRoleWorkAreaJPanel) comp;
                parwajp.populatePoliceOfficers();
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

    private void txtPoliceOfficerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoliceOfficerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPoliceOfficerNameActionPerformed

    private void btnAddPoliceOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPoliceOfficerActionPerformed
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
            if(ua.getUsername().equals(txtPoliceOfficerUsername.getText())){
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

        Role role = new PoliceOfficerRole();
        User user = ecosystem.getUserDirectory().createUser(txtPoliceOfficerUsername.getText());
        user.setPhone(txtPoliceOfficerPhoneNo.getText());

        UserAccount ua = this.ecosystem.getUserAccountDirectory().createUserAccount(txtPoliceOfficerUsername.getText(),txtPoliceOfficerPassword.getText() , user, role);
        outerloop:
        for(Network n:this.ecosystem.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(this.currentEnterprise.getName())){
                    e.getUserAccountDirectory().addUserAccount(ua);
                    for(Organization o :e.getOrganizationDirectory().getOrganizationList()){
                        if(o.getName().equals(Organization.Type.PoliceOfficer.getValue())){
                            o.getUserAccountDirectory().addUserAccount(ua);
                            System.out.println(o.getUserAccountDirectory().getUserAccountList());
                            break outerloop;
                        }
                    }
                    //                    e.getUserAccountDirectory().createUserAccount(txtVolunteerUsername.getText(),txtVolunteerPassword.getText() , user, role);

                }
            }
        }

        dB4OUtil.storeSystem(ecosystem);

        clearSelections();

        JOptionPane.showMessageDialog(null,"Police Officer added successfully!");
        return;
        }
        public void initialize(){
            outerloop:
            for(Network n:this.ecosystem.getNetworkList()){
                for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getUserAccount().getUsername().equals(this.policeAdminAccount.getUsername())){
                        this.currentEnterprise = e;
                        break outerloop;
                    }
                }
            }
    }//GEN-LAST:event_btnAddPoliceOfficerActionPerformed
    public void clearSelections(){
        txtPoliceOfficerName.setText("");
        txtPoliceOfficerPassword.setText("");
        txtPoliceOfficerPhoneNo.setText("");
        txtPoliceOfficerUsername.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPoliceOfficer;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtPoliceOfficerName;
    private javax.swing.JPasswordField txtPoliceOfficerPassword;
    private javax.swing.JTextField txtPoliceOfficerPhoneNo;
    private javax.swing.JTextField txtPoliceOfficerUsername;
    // End of variables declaration//GEN-END:variables
}
