/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.victimrole;

import business.db4outil.DB4OUtil;
import business.config.EcoSystem;
import business.role.Role;
import business.role.VictimRole;
import business.useraccount.UserAccount;
import business.address.Address;
import javax.swing.JPanel;
import business.user.User;
import java.awt.Color;
import javax.swing.JOptionPane;

public class VictimRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VictimJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    
    public VictimRegistrationJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        ecosystem = DB4OUtil.getInstance().retrieveSystem();
    }
    
    private void clearVictimRegistrationFields(){
        victimNameTextField.setText("");
        victimUsernameTextField.setText("");
        victimPasswordTextField.setText("");
        victimPhoneTextField.setText("");
        victimStreetTextField.setText("");
        victimUnitTextField.setText("");
        victimCityTextField.setText("");
        victimStateTextField.setText("");
        victimZipcodeTextField.setText("");
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
        jLabel5 = new javax.swing.JLabel();
        submitVictimRegistration = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        victimNameTextField = new javax.swing.JTextField();
        victimUsernameTextField = new javax.swing.JTextField();
        victimStreetTextField = new javax.swing.JTextField();
        victimUnitTextField = new javax.swing.JTextField();
        victimCityTextField = new javax.swing.JTextField();
        victimStateTextField = new javax.swing.JTextField();
        victimZipcodeTextField = new javax.swing.JTextField();
        victimPhoneTextField = new javax.swing.JTextField();
        statusTextField = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        victimPasswordTextField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 240));

        jLabel1.setText("Register to Request Help");

        jLabel2.setText("Name");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jLabel5.setText("Address");

        submitVictimRegistration.setText("Submit");
        submitVictimRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitVictimRegistrationActionPerformed(evt);
            }
        });

        jLabel6.setText("Street");

        jLabel7.setText("Unit Number");

        jLabel8.setText("City");

        jLabel9.setText("State");

        jLabel10.setText("Zipcode");

        jLabel11.setText("Phone number");

        victimNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimNameTextFieldActionPerformed(evt);
            }
        });

        victimUsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimUsernameTextFieldActionPerformed(evt);
            }
        });

        victimStreetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimStreetTextFieldActionPerformed(evt);
            }
        });

        victimUnitTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimUnitTextFieldActionPerformed(evt);
            }
        });

        victimCityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimCityTextFieldActionPerformed(evt);
            }
        });

        victimStateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimStateTextFieldActionPerformed(evt);
            }
        });

        victimZipcodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimZipcodeTextFieldActionPerformed(evt);
            }
        });

        victimPhoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimPhoneTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/wecarevictim.png"))); // NOI18N

        victimPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                victimPasswordTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(statusTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(victimNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(66, 66, 66)
                                    .addComponent(victimStreetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(victimUsernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                        .addComponent(victimPasswordTextField))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(96, 96, 96)
                                    .addComponent(submitVictimRegistration))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(victimPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(victimZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(victimStateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(victimCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(victimUnitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(victimNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(victimUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(victimPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(victimStreetTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(victimUnitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(victimCityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(victimStateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(victimZipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(victimPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(submitVictimRegistration))
                    .addComponent(jLabel12))
                .addGap(181, 181, 181)
                .addComponent(statusTextField)
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitVictimRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitVictimRegistrationActionPerformed
        // TODO add your handling code here:
        if(victimNameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter your name!");
            return;
        }
        if(victimUsernameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter your username!");
            return;
        }
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(victimUsernameTextField.getText())){
                JOptionPane.showMessageDialog(null,"Username already exists... please enter a different username!");
                return;
            }
        }
        if(victimPasswordTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter a password!");
            return;
        }
        if(victimPhoneTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter your phone no!");
            return;
        }
        
        User tempUser = new User();
        if(!tempUser.validatePhoneNumber(victimPhoneTextField.getText())){
            JOptionPane.showMessageDialog(null,"Please enter phone 10 digits only!");
            return;
        }
        if(victimZipcodeTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter zip code!");
            return;
        }
        String victimName = victimNameTextField.getText();
        String victimUsername = victimUsernameTextField.getText();
        String victimPassword = victimPasswordTextField.getText();
        String victimPhone = victimPhoneTextField.getText();
        String victimStreet = victimStreetTextField.getText();
        String victimUnitNumber = victimUnitTextField.getText();
        String victimCity = victimCityTextField.getText();
        String victimState = victimStateTextField.getText();
        String victimZipcode = victimZipcodeTextField.getText();
        
        User victim = new User();
        Address victimAddress = new Address();
        victimAddress.setStreetName(victimStreet);
        victimAddress.setUnitNumber(victimUnitNumber);
        victimAddress.setCity(victimCity);
        victimAddress.setState(victimState);
        victimAddress.setZipcode(victimZipcode);
        victim.setName(victimName);
        victim.setAddress(victimAddress);
        victim.setPhone(victimPhone);
        
        UserAccount victimUserAccount = new UserAccount();
        victimUserAccount.setUsername(victimUsername);
        victimUserAccount.setPassword(victimPassword);
        victimUserAccount.setRole(new VictimRole());
        victimUserAccount.setUser(victim);
        
        if (ecosystem.getUserAccountDirectory().checkIfUsernameIsUnique(victimUsername)){
            ecosystem.getUserAccountDirectory().getUserAccountList().add(victimUserAccount);
            JOptionPane.showMessageDialog(null,"You are registered successfully!");
            DB4OUtil.getInstance().storeSystem(ecosystem);
            clearVictimRegistrationFields();
            return;
//            statusTextField.setText("Successfuly Registered");
//            statusTextField.setForeground(Color.BLUE);
        }
        else{
            JOptionPane.showMessageDialog(null,"Some problem occured in registration!");
             clearVictimRegistrationFields();
            return;
//            statusTextField.setText("Username already exists");
//            statusTextField.setForeground(Color.RED);
        }    
       
//        ecosystem.getUserAccountDirectory().getUserAccountList().add(victimUserAccount);
        
    }//GEN-LAST:event_submitVictimRegistrationActionPerformed

    private void victimUsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimUsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimUsernameTextFieldActionPerformed

    private void victimStreetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimStreetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimStreetTextFieldActionPerformed

    private void victimNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimNameTextFieldActionPerformed

    private void victimUnitTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimUnitTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimUnitTextFieldActionPerformed

    private void victimCityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimCityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimCityTextFieldActionPerformed

    private void victimStateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimStateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimStateTextFieldActionPerformed

    private void victimZipcodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimZipcodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimZipcodeTextFieldActionPerformed

    private void victimPhoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimPhoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimPhoneTextFieldActionPerformed

    private void victimPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_victimPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_victimPasswordTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel statusTextField;
    private javax.swing.JButton submitVictimRegistration;
    private javax.swing.JTextField victimCityTextField;
    private javax.swing.JTextField victimNameTextField;
    private javax.swing.JPasswordField victimPasswordTextField;
    private javax.swing.JTextField victimPhoneTextField;
    private javax.swing.JTextField victimStateTextField;
    private javax.swing.JTextField victimStreetTextField;
    private javax.swing.JTextField victimUnitTextField;
    private javax.swing.JTextField victimUsernameTextField;
    private javax.swing.JTextField victimZipcodeTextField;
    // End of variables declaration//GEN-END:variables
}
