package userinterface.cityadminrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.FoodBankAdminRole;
import Business.Role.HospitalAdminRole;
import Business.Role.NGOAdminRole;
import Business.Role.PoliceAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import business.user.User;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class CreateEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateEnterpriseJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Enterprise.EnterpriseType temEnterpriseType;
    Set<String> zipCodes;
    Network currentNetwork;
    UserAccount cityAdminUserAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public CreateEnterpriseJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount cityAdminUserAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.cityAdminUserAccount = cityAdminUserAccount;
        this.zipCodes = new HashSet<String>();
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

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        txtEnterpriseAdminName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboxEnterpriseType = new javax.swing.JComboBox();
        txtEnterpriseAdminUsername = new javax.swing.JTextField();
        btnCreateEnterprise = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblZipCodesDirectory = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAddedZipCodesDirec = new javax.swing.JTable();
        btnAddZipCode = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEnterpriseAdminPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 240));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Enterprise Name");

        jLabel2.setText("Admin Name");

        jLabel3.setText("Admin Username");

        jLabel4.setText("Admin Password");

        txtEnterpriseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseNameActionPerformed(evt);
            }
        });

        txtEnterpriseAdminName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseAdminNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Enterprise Type");

        comboxEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboxEnterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxEnterpriseTypeActionPerformed(evt);
            }
        });

        txtEnterpriseAdminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterpriseAdminUsernameActionPerformed(evt);
            }
        });

        btnCreateEnterprise.setText("Submit Enterprise");
        btnCreateEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEnterpriseActionPerformed(evt);
            }
        });

        tblZipCodesDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ZipCode", "Add "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblZipCodesDirectory);

        tblAddedZipCodesDirec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ZipCode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblAddedZipCodesDirec);

        btnAddZipCode.setText("Add Zip Code");
        btnAddZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddZipCodeActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/shakehand.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboxEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEnterpriseAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEnterpriseAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtEnterpriseAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnBack)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCreateEnterprise)))
                .addGap(80, 80, 80)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboxEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEnterpriseAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEnterpriseAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateEnterprise))
                    .addComponent(txtEnterpriseAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof CityAdminRoleWorkAreaJPanel){
                CityAdminRoleWorkAreaJPanel carwajp =(CityAdminRoleWorkAreaJPanel) comp;
                carwajp.populate();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEnterpriseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseNameActionPerformed

    private void txtEnterpriseAdminNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseAdminNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseAdminNameActionPerformed

    private void txtEnterpriseAdminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterpriseAdminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterpriseAdminUsernameActionPerformed

    private void btnCreateEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEnterpriseActionPerformed
        // TODO add your handling code here:
        if(txtEnterpriseName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter enterprise name!");
            return;
        }        
        for(Network n:this.ecosystem.getNetworkList()){
            if(n.getName().equals(this.currentNetwork.getName())){
                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getName().equals(txtEnterpriseName.getText())){
                        JOptionPane.showMessageDialog(null,"Enterprise name already exists... please enter a different name!");
                        return;
                    }
                }
            }
        }
        if(txtEnterpriseAdminName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter admin name!");
            return;
        }
        if(txtEnterpriseAdminUsername.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter admin username!");
            return;
        }
        for(UserAccount ua:this.ecosystem.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(txtEnterpriseAdminUsername.getText())){
                JOptionPane.showMessageDialog(null,"Username already exists... please enter a different username!");
                return;
            }
        }
        if(txtEnterpriseAdminPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter admin password!");
            return;
        }
        
        if(tblAddedZipCodesDirec.getRowCount()==0){
            JOptionPane.showMessageDialog(null,"Enterprise should serve at least one zipcode!");
            return;
        }
        
        String enterpriseName = txtEnterpriseName.getText();
        String enterpriseAdminName = txtEnterpriseAdminName.getText();
        String enterpriseAdminPassword = txtEnterpriseAdminPassword.getText();
        String enterpriseAdminUsername  = txtEnterpriseAdminUsername.getText();
        Role role = null;
        User user = ecosystem.getUserDirectory().createUser(enterpriseAdminName);
        if(temEnterpriseType.equals(Enterprise.EnterpriseType.FoodBank)){
            role = new FoodBankAdminRole();
        }
        else if(temEnterpriseType.equals(Enterprise.EnterpriseType.Hospital)){
            role = new HospitalAdminRole();
        }
        else if(temEnterpriseType.equals(Enterprise.EnterpriseType.NonGovernmentOrganization)){
            role = new NGOAdminRole();
        }
        else if(temEnterpriseType.equals(Enterprise.EnterpriseType.PoliceDepartment)){
            role = new PoliceAdminRole();
        }
        
        UserAccount ua = this.ecosystem.getUserAccountDirectory().createUserAccount(enterpriseAdminUsername,enterpriseAdminPassword , user, role);
        for(Network n:this.ecosystem.getNetworkList()){
            if(n.getName().equals(this.currentNetwork.getName())){
      
                Enterprise enterprise = n.getEnterpriseDirectory().createAndAddEnterprise(enterpriseName, temEnterpriseType);
                createAdminOrganization(enterprise,ua); 
                enterprise.setUserAccount(ua);
//                enterprise.getUserAccountDirectory().createUserAccount(enterpriseAdminUsername, enterpriseAdminPassword, user, role);
                enterprise.setZipCodes(zipCodes);
                break;
            }
        }

        dB4OUtil.storeSystem(ecosystem);
        
        clearSelections();
        
        JOptionPane.showMessageDialog(null,"Enterprise added successfully!");
        return;
    }//GEN-LAST:event_btnCreateEnterpriseActionPerformed
    public void initialize(){
        for(Network n:this.ecosystem.getNetworkList()){
            if(n.getCityAdmin().getUsername().equals(this.cityAdminUserAccount.getUsername())){
                this.currentNetwork = n;
                break;
            }
        }
        DefaultTableModel dtm = (DefaultTableModel)tblZipCodesDirectory.getModel();
        dtm.setRowCount(0);
        for(String zc : this.currentNetwork.getZipCodes()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= zc;
            row[1]= false;
            dtm.addRow(row);
        }
        comboxEnterpriseType.removeAllItems();
        for(Enterprise.EnterpriseType enterpriseType: Enterprise.EnterpriseType.values()){
            comboxEnterpriseType.addItem(enterpriseType);
        }
    }
    private void comboxEnterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxEnterpriseTypeActionPerformed
        // TODO add your handling code here:
        this.temEnterpriseType = (Enterprise.EnterpriseType)comboxEnterpriseType.getSelectedItem();
    }//GEN-LAST:event_comboxEnterpriseTypeActionPerformed

    private void btnAddZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddZipCodeActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tblZipCodesDirectory.getModel();
        // this.zipCodes = new HashSet<String>();
        for(int row = 0;row < dtm.getRowCount();row++) {
            if(dtm.getValueAt(row,1).equals(true)){
                this.zipCodes.add((String)dtm.getValueAt(row,0));
            }
        }
        populateAddZipCode();
    }//GEN-LAST:event_btnAddZipCodeActionPerformed
    public void isEditable(boolean b){
        txtEnterpriseAdminName.setEditable(b);
        txtEnterpriseAdminPassword.setEditable(b);
        txtEnterpriseAdminUsername.setEditable(b);
        txtEnterpriseName.setEditable(b);
//        txtDisasterManagmt.setEnabled(b);
    }

    public void populateAddZipCode(){
        DefaultTableModel dtm = (DefaultTableModel)tblAddedZipCodesDirec.getModel();
        dtm.setRowCount(0);
        for(String zc : this.zipCodes){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= zc;
            dtm.addRow(row);
        }
    }
    public void clearSelections(){
        txtEnterpriseAdminName.setText("");
        txtEnterpriseAdminPassword.setText("");
        txtEnterpriseAdminUsername.setText("");
        txtEnterpriseName.setText("");
        DefaultTableModel dtm1 = (DefaultTableModel)tblAddedZipCodesDirec.getModel();
        dtm1.setRowCount(0);
        DefaultTableModel dtm2 = (DefaultTableModel)tblZipCodesDirectory.getModel();
        dtm2.setRowCount(0);
        for(String zc : this.currentNetwork.getZipCodes()){
            Object[] row = new Object[dtm2.getColumnCount()];
            row[0]= zc;
            row[1]= false;
            dtm2.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddZipCode;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEnterprise;
    private javax.swing.JComboBox comboxEnterpriseType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblAddedZipCodesDirec;
    private javax.swing.JTable tblZipCodesDirectory;
    private javax.swing.JTextField txtEnterpriseAdminName;
    private javax.swing.JPasswordField txtEnterpriseAdminPassword;
    private javax.swing.JTextField txtEnterpriseAdminUsername;
    private javax.swing.JTextField txtEnterpriseName;
    // End of variables declaration//GEN-END:variables

    private void createAdminOrganization(Enterprise enterprise,UserAccount admin) {
        if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
            Organization hospitalAdminOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.HospitalAdmin);
            hospitalAdminOrganization.getUserAccountDirectory().addUserAccount(admin);
            Organization hospitalDoctorOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
            Organization hospitalStaffOrganization  = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.HospitalStaff);
        } 
        else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.FoodBank)){
            Organization foodBankAdminOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.FoodBankAdmin);
            foodBankAdminOrganization.getUserAccountDirectory().addUserAccount(admin);
            Organization deliveryManOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Delivery);
            Organization packagingOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.FoodPackaging);
        }
        else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.PoliceDepartment)){
            Organization policeAdminOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.PoliceAdmin);
            policeAdminOrganization.getUserAccountDirectory().addUserAccount(admin);
            Organization policeOfficerOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.PoliceOfficer);
        }       
        else if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.NonGovernmentOrganization)){
            Organization ngoAdminOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.NGOAdmin);
            ngoAdminOrganization.getUserAccountDirectory().addUserAccount(admin);
            Organization ngoVolunteersOrganization = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Volunteer);
           
        }
    }
}
