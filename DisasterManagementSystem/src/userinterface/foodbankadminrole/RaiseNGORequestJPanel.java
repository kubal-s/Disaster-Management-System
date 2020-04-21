/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.foodbankadminrole;

import business.db4outil.DB4OUtil;
import business.config.EcoSystem;
import business.enterprise.Enterprise;
import business.useraccount.UserAccount;
import business.workqueue.FoodBankToNGORequest;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;


public class RaiseNGORequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RaiseNGORequestJPanel
     *
     */
    private EcoSystem ecosystem;
    private JPanel userProcessContainer;
    private WorkRequest victimHelpRequest;
    private UserAccount foodBankAdminAccount;

    public RaiseNGORequestJPanel(JPanel userProcessContainer, EcoSystem ecosystem, WorkRequest victimHelpRequest, UserAccount foodBankAdminAccount) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        this.victimHelpRequest = victimHelpRequest;
        this.foodBankAdminAccount = foodBankAdminAccount;
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
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSummary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));

        jLabel1.setText("Create a Help Request for NGO");

        jLabel5.setText("Description");

        jLabel2.setText("Summary");

        txtSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSummaryActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        txtDescription.setText("\n");
        jScrollPane1.setViewportView(txtDescription);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/ngo-clipart-4.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSubmit)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSummary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        victimHelpRequest.setStatus("delivery assigned to NGO");
        WorkRequest raiseNGORequest = new FoodBankToNGORequest();
        ((FoodBankToNGORequest)raiseNGORequest).setVictimHelpRequest(victimHelpRequest);
        raiseNGORequest.setRequestID(ecosystem.getWorkQueue().getRequestID());
        raiseNGORequest.setRequestedEnterprise(Enterprise.EnterpriseType.NonGovernmentOrganization);
        raiseNGORequest.setSummary(txtSummary.getText());
        raiseNGORequest.setDescription(txtDescription.getText());
        raiseNGORequest.setStatus("submitted");
        raiseNGORequest.setSender(foodBankAdminAccount);
        raiseNGORequest.setAddress(victimHelpRequest.getAddress());
        this.ecosystem.getWorkQueue().getWorkRequestList().add(raiseNGORequest);
        DB4OUtil.getInstance().storeSystem(ecosystem);
        this.userProcessContainer.remove(this);
        CardLayout layout =(CardLayout) this.userProcessContainer.getLayout();
        Component [] comps = this.userProcessContainer.getComponents();
        for(Component comp : comps){
            if(comp instanceof FoodBankAdminRoleWorkAreaJPanel){
                FoodBankAdminRoleWorkAreaJPanel jp =(FoodBankAdminRoleWorkAreaJPanel) comp;
                jp.initialize();
                jp.populatePackagers();
                jp.populateDeliveryMan();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSummaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSummaryActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        DB4OUtil.getInstance().storeSystem(ecosystem);
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof FoodBankAdminRoleWorkAreaJPanel) {
                FoodBankAdminRoleWorkAreaJPanel fbarwajp = (FoodBankAdminRoleWorkAreaJPanel) comp;
                fbarwajp.initialize();
                fbarwajp.populatePackagers();
                fbarwajp.populateDeliveryMan();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtSummary;
    // End of variables declaration//GEN-END:variables
}
