/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.hospitaladminrole;

import business.db4outil.DB4OUtil;
import business.config.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.role.DoctorRole;
import business.role.Role;
import business.useraccount.UserAccount;
import business.user.User;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AddDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDoctorJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount hospitalAdminAccount;
    Enterprise currentEnterprise;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public AddDoctorJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount hospitalAdminAccount) {
        initComponents();  
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.hospitalAdminAccount = hospitalAdminAccount;
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

        txtDoctorUsername = new javax.swing.JTextField();
        txtDoctorPhoneNo = new javax.swing.JTextField();
        txtDoctorName = new javax.swing.JTextField();
        btnAddDoctor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtDoctorPassword = new javax.swing.JPasswordField();
        lblEnterpriseName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));

        txtDoctorUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorUsernameActionPerformed(evt);
            }
        });

        txtDoctorPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPhoneNoActionPerformed(evt);
            }
        });

        txtDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorNameActionPerformed(evt);
            }
        });

        btnAddDoctor.setText("Add");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });

        jLabel1.setText("Doctor Name");

        jLabel2.setText("Doctor Username");

        jLabel3.setText("Doctor Phone No.");

        jLabel4.setText("Doctor Password");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/doc1.png"))); // NOI18N

        txtDoctorPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorPasswordActionPerformed(evt);
            }
        });

        lblEnterpriseName.setText("Enterprise Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddDoctor)
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
                                .addGap(65, 65, 65)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnterpriseName)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDoctorPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txtDoctorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txtDoctorName, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                .addComponent(txtDoctorPassword)))))
                .addGap(80, 80, 80)
                .addComponent(jLabel5)
                .addContainerGap(600, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblEnterpriseName))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDoctorPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddDoctor)))
                .addGap(189, 189, 189))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoctorUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorUsernameActionPerformed

    private void txtDoctorPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorPhoneNoActionPerformed

    private void txtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorNameActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        // TODO add your handling code here:
        if(txtDoctorName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter doctor name!");
            return;
        }
        if(txtDoctorUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter doctor username!");
            return;
        }
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(txtDoctorUsername.getText())){
                JOptionPane.showMessageDialog(null,"Username already exists... please enter a different username!");
                return;
            }
        }
        if(txtDoctorPhoneNo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter doctor phone Number!");
            return;
        }
        User tempUser = new User();
        if(!tempUser.validatePhoneNumber(txtDoctorPhoneNo.getText())){
            JOptionPane.showMessageDialog(null,"Please enter phone 10 digits only!");
            return;
        }
        if(txtDoctorPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter doctor password!");
            return;
        }

        Role role = new DoctorRole();
        User user = ecosystem.getUserDirectory().createUser(txtDoctorUsername.getText());
        user.setPhone(txtDoctorPhoneNo.getText());

        UserAccount ua = this.ecosystem.getUserAccountDirectory().createUserAccount(txtDoctorUsername.getText(),txtDoctorPassword.getText() , user, role);
        outerloop:
        for(Network n:this.ecosystem.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(this.currentEnterprise.getName())){
                    e.getUserAccountDirectory().addUserAccount(ua);
                    for(Organization o :e.getOrganizationDirectory().getOrganizationList()){
                        if(o.getName().equals(Organization.Type.Doctor.getValue())){
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

        JOptionPane.showMessageDialog(null,"Doctor added successfully!");
        return;
        }
        public void initialize(){
            outerloop:
            for(Network n:this.ecosystem.getNetworkList()){
                for(Enterprise e :n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getUserAccount().getUsername().equals(this.hospitalAdminAccount.getUsername())){
                        this.currentEnterprise = e;
                        break outerloop;
                    }
                }
            }
            lblEnterpriseName.setText(this.currentEnterprise.getName());
    }//GEN-LAST:event_btnAddDoctorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof HospitalAdminRoleWorkAreaJPanel){
                HospitalAdminRoleWorkAreaJPanel harwajp =(HospitalAdminRoleWorkAreaJPanel) comp;
                harwajp.populateDoctors();
                harwajp.populateHospitalStaff();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDoctorPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorPasswordActionPerformed

    public void clearSelections(){
        txtDoctorName.setText("");
        txtDoctorPassword.setText("");
        txtDoctorPhoneNo.setText("");
        txtDoctorUsername.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JPasswordField txtDoctorPassword;
    private javax.swing.JTextField txtDoctorPhoneNo;
    private javax.swing.JTextField txtDoctorUsername;
    // End of variables declaration//GEN-END:variables
}
