/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.foodpackagerrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author akhil
 */
public class FoodPackagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodPackagerWorkAreaJPanel
     */   
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount packagerAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public FoodPackagerWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.packagerAccount = userAccount;
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
        tblRequestDirectory = new javax.swing.JTable();
        btnAssigntToMe = new javax.swing.JButton();
        BtnViewMyTasks = new javax.swing.JButton();

        tblRequestDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestDirectory);

        btnAssigntToMe.setText("Assign To Me");
        btnAssigntToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigntToMeActionPerformed(evt);
            }
        });

        BtnViewMyTasks.setText("View My Tasks");
        BtnViewMyTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewMyTasksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnViewMyTasks)
                    .addComponent(btnAssigntToMe))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAssigntToMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnViewMyTasks)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssigntToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigntToMeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssigntToMeActionPerformed

    private void BtnViewMyTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewMyTasksActionPerformed
        // TODO add your handling code here:
        JPanel viewMyTasksJPanel = new ViewMyPackagingTasksJPanel(userProcessContainer,ecosystem,packagerAccount);
        userProcessContainer.add("viewMyTasks",viewMyTasksJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_BtnViewMyTasksActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnViewMyTasks;
    private javax.swing.JButton btnAssigntToMe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestDirectory;
    // End of variables declaration//GEN-END:variables
}