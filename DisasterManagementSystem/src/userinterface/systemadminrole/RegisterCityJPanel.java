/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemadminrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import business.user.User;
import Business.Network.Network;
import Business.Role.CityAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhil
 */
public class RegisterCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterCityJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Network network, tempNetwork;
   
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public RegisterCityJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.tempNetwork = new Network();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();
        txtCityAdminName = new javax.swing.JTextField();
        txtCityAdminUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCityAdminPassword = new javax.swing.JTextField();
        btnAddZipCode = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        btnAddCity = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("City Name");

        jLabel2.setText("City Admin Name");

        jLabel3.setText("City Admin Username");

        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });

        txtCityAdminName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityAdminNameActionPerformed(evt);
            }
        });

        jLabel4.setText("City Admin Password");

        btnAddZipCode.setText("Add Zip Code");
        btnAddZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddZipCodeActionPerformed(evt);
            }
        });

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Zip Code"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        jLabel6.setText("Add Zip Code");

        btnAddCity.setText("Submit City ");
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/addstate.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddCity, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4))
                                        .addGap(24, 24, 24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(75, 75, 75)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCityAdminUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCityAdminName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCityName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCityAdminPassword)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(txtZipCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddZipCode))))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCityAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCityAdminUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCityAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddZipCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddCity))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof SystemAdminRoleWorkAreaJPanel){
                SystemAdminRoleWorkAreaJPanel sarwajp =(SystemAdminRoleWorkAreaJPanel) comp;
                sarwajp.populate();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed

    private void txtCityAdminNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityAdminNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityAdminNameActionPerformed

    private void btnAddZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddZipCodeActionPerformed
        // TODO add your handling code here:
        if(txtZipCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter zip code!");
            return;
        }
        this.tempNetwork.addZipCode(txtZipCode.getText());
        txtZipCode.setText("");
        populate();
    }//GEN-LAST:event_btnAddZipCodeActionPerformed

    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        // TODO add your handling code here:
        if(txtCityName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter city name!");
            return;
        }
        for(Network n:this.ecosystem.getNetworkList()){
            if(n.getCityName().equals(txtCityName.getText())){
               JOptionPane.showMessageDialog(null,"This city already exist..enter a different city!");
               return;
            }
        }
//        txtDisasterManagmt.setText("Disaster Management of" + txtCityName);
        if(txtCityAdminName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter city admin name!");
            return;
        }
        if(txtCityAdminUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter city admin username!");
            return;
        }     
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(txtCityAdminUserName.getText())){
                JOptionPane.showMessageDialog(null,"Username already exists... please enter a different username!");
                return;
            }
        }
        if(txtCityAdminPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter city admin password!");
            return;
        }
        String disasterMangmt = "Disaster Management of " + txtCityName.getText();
        
        String name = txtCityAdminName.getText();
        String username = txtCityAdminUserName.getText();
        String password = txtCityAdminPassword.getText();
        
        User user = ecosystem.getUserDirectory().createUser(name);
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(username, password, user, new CityAdminRole());
        
        this.network = this.ecosystem.createAndAddNetwork();
        this.network.setCityName(txtCityName.getText());
        this.network.setCityAdmin(userAccount);
        this.network.setName(disasterMangmt);
        this.network.setZipCodes(this.tempNetwork.getZipCodes());
        dB4OUtil.storeSystem(ecosystem);
        
//        isEditable(false);
        clearSelections();
        
        JOptionPane.showMessageDialog(null,"City added successfully!");
        return;
    }//GEN-LAST:event_btnAddCityActionPerformed
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);   
        for(String zipCode: this.tempNetwork.getZipCodes()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=zipCode;
            dtm.addRow(row);
        }
    }
    public void clearSelections(){
        txtCityAdminName.setText("");
        txtCityAdminPassword.setText("");
        txtCityAdminUserName.setText("");
        txtCityName.setText("");
        txtZipCode.setText("");
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);  
    }
    public void isEditable(boolean b){
        txtCityAdminName.setEditable(b);
        txtCityAdminPassword.setEditable(b);
        txtCityAdminUserName.setEditable(b);
        txtCityName.setEditable(b);
        txtZipCode.setEditable(b);
//        txtDisasterManagmt.setEnabled(b);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnAddZipCode;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JTextField txtCityAdminName;
    private javax.swing.JTextField txtCityAdminPassword;
    private javax.swing.JTextField txtCityAdminUserName;
    private javax.swing.JTextField txtCityName;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
