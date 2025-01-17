/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemadminrole;

import business.db4outil.DB4OUtil;
import business.config.EcoSystem;
import business.user.User;
import business.network.Network;
import business.role.SystemAdminRole;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class SystemAdminRoleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminRole
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public SystemAdminRoleWorkAreaJPanel() {
        initComponents();
    }

    public SystemAdminRoleWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populate();
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
        tblDirectory = new javax.swing.JTable();
        btnRegisterCity = new javax.swing.JButton();
        btnUpdateCity = new javax.swing.JButton();
        btnDeleteCity = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));
        setToolTipText("");

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "City Name", "City Disaster Management"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDirectory);

        btnRegisterCity.setText("Register City");
        btnRegisterCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCityActionPerformed(evt);
            }
        });

        btnUpdateCity.setText("Update City");
        btnUpdateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCityActionPerformed(evt);
            }
        });

        btnDeleteCity.setText("Delete City");
        btnDeleteCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCityActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/WholeCommunity_web.gif"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(255, 255, 240));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Manage States");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdateCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegisterCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, Short.MAX_VALUE)
                .addGap(508, 508, 508))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegisterCity)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdateCity)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteCity))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCityActionPerformed
        // TODO add your handling code here:
        JPanel registerCityJPanel = new RegisterCityJPanel(userProcessContainer,ecosystem);
        userProcessContainer.add("registerCity",registerCityJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_btnRegisterCityActionPerformed

    private void btnUpdateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCityActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            Network network = ((Network)tblDirectory.getValueAt(selectedRow, 1));
            //Item selectedItem = restaurant.getMenu().getItemFromName(selectedItemName);
            JPanel updateCityJPanel = new UpdateCityJPanel(userProcessContainer,ecosystem, network);
            userProcessContainer.add("updateCity",updateCityJPanel);
            CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
            cardLayout.next(this.userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnUpdateCityActionPerformed

    private void btnDeleteCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCityActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDirectory.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Network network = (Network)tblDirectory.getValueAt(selectedRow, 1);
                for (UserAccount ua : this.ecosystem.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(network.getCityAdmin().getUsername())) {
                        this.ecosystem.getUserAccountDirectory().getUserAccountList().remove(ua);
                        break;
                    }
                }
                for(Network n: this.ecosystem.getNetworkList()){
                    if(n.getName().equals(network.getName())){
                        this.ecosystem.getNetworkList().remove(n);
                        break;
                    }
                }                
                dB4OUtil.storeSystem(this.ecosystem);
                populate();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteCityActionPerformed
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);   
        for(Network network: this.ecosystem.getNetworkList()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= network.getCityName();
            row[1]= network;
            dtm.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteCity;
    private javax.swing.JButton btnRegisterCity;
    private javax.swing.JButton btnUpdateCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDirectory;
    // End of variables declaration//GEN-END:variables
}
