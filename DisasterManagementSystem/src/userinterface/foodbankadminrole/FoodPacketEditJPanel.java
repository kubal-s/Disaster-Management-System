/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.foodbankadminrole;

import business.db4outil.DB4OUtil;
import business.config.EcoSystem;
import business.enterprise.Enterprise;
import business.enterprise.FoodBankEnterprise;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.ngoadminrole.NgoAdminRoleWorkAreaJPanel;


public class FoodPacketEditJPanel extends javax.swing.JPanel {

    /**
     * Creates new form foodPacketViewJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount foodBankAdminAccount;
    private Enterprise currentEnterprise;
    public FoodPacketEditJPanel(JPanel userProcessContainer, EcoSystem ecosystem,Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.foodBankAdminAccount = userAccount;
        this.currentEnterprise = enterprise;
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
        lblFoodPacketCount = new javax.swing.JLabel();
        btnAddFoodPackets = new javax.swing.JButton();
        btnRemoveFoodPackets = new javax.swing.JButton();
        txtFoodPackets = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblEnterpriseName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Food Packet Count :");

        lblFoodPacketCount.setText("0");

        btnAddFoodPackets.setText("Add");
        btnAddFoodPackets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodPacketsActionPerformed(evt);
            }
        });

        btnRemoveFoodPackets.setText("Remove");
        btnRemoveFoodPackets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFoodPacketsActionPerformed(evt);
            }
        });

        txtFoodPackets.setText("0");
        txtFoodPackets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodPacketsActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter count to add or remove");

        lblEnterpriseName.setText("Enterprise Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnterpriseName)
                    .addComponent(txtFoodPackets, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoodPacketCount)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAddFoodPackets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemoveFoodPackets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblEnterpriseName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblFoodPacketCount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFoodPackets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddFoodPackets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveFoodPackets)
                .addContainerGap(105, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(ecosystem);
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof FoodBankAdminRoleWorkAreaJPanel){
                FoodBankAdminRoleWorkAreaJPanel jp =(FoodBankAdminRoleWorkAreaJPanel) comp;
                jp.initialize();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtFoodPacketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodPacketsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodPacketsActionPerformed

    private void btnAddFoodPacketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodPacketsActionPerformed
        // TODO add your handling code here:
        try{
            int currentTxtFoodPackets = Integer.parseInt(txtFoodPackets.getText());
            int foodPacketCount = ((FoodBankEnterprise)this.currentEnterprise).getFoodPackets();
            ((FoodBankEnterprise)this.currentEnterprise).setFoodPackets(foodPacketCount+currentTxtFoodPackets);
            initialize();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please enter number to edit food packets");
            
        }
    }//GEN-LAST:event_btnAddFoodPacketsActionPerformed

    private void btnRemoveFoodPacketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFoodPacketsActionPerformed
        // TODO add your handling code here:
        try{
            int currentTxtFoodPackets = Integer.parseInt(txtFoodPackets.getText());
            int foodPacketCount = ((FoodBankEnterprise)this.currentEnterprise).getFoodPackets();
            if(foodPacketCount < currentTxtFoodPackets){
                JOptionPane.showMessageDialog(null,"Not enough food packets to remove");
            }
            else{
                ((FoodBankEnterprise)this.currentEnterprise).setFoodPackets(foodPacketCount-currentTxtFoodPackets);
                initialize();
            }
        }
        catch(Exception e){           
            JOptionPane.showMessageDialog(null,"Please enter number to edit food packets");
        }
    }//GEN-LAST:event_btnRemoveFoodPacketsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFoodPackets;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveFoodPackets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblFoodPacketCount;
    private javax.swing.JTextField txtFoodPackets;
    // End of variables declaration//GEN-END:variables

    private void initialize() {
        lblFoodPacketCount.setText(String.valueOf(((FoodBankEnterprise)this.currentEnterprise).getFoodPackets()));
        lblEnterpriseName.setText(this.currentEnterprise.getName());
    }
}
