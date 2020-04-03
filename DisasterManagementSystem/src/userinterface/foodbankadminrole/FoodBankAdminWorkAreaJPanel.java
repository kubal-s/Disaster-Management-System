/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.foodbankadminrole;

/**
 *
 * @author akhil
 */
public class FoodBankAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodBankAdminWorkAreaJPanel
     */
    public FoodBankAdminWorkAreaJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewRequestDetails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequestDirectory = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblOrganizationDirectory = new javax.swing.JTable();
        btnAddDeliveryMan = new javax.swing.JButton();
        btnUpdateDeliveryMan = new javax.swing.JButton();
        btnDeleteDeliveryMan = new javax.swing.JButton();

        btnViewRequestDetails.setText("View Request Details");
        btnViewRequestDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestDetailsActionPerformed(evt);
            }
        });

        tblRequestDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Sender", "Date Requested", "Message", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRequestDirectory);

        tblOrganizationDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Type", "Organization Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblOrganizationDirectory);

        btnAddDeliveryMan.setText("Add Organization");
        btnAddDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeliveryManActionPerformed(evt);
            }
        });

        btnUpdateDeliveryMan.setText("Update");
        btnUpdateDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDeliveryManActionPerformed(evt);
            }
        });

        btnDeleteDeliveryMan.setText("Delete");
        btnDeleteDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDeliveryManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewRequestDetails)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnDeleteDeliveryMan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdateDeliveryMan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddDeliveryMan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewRequestDetails)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddDeliveryMan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdateDeliveryMan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteDeliveryMan)
                .addGap(0, 26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRequestDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewRequestDetailsActionPerformed

    private void btnAddDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeliveryManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDeliveryManActionPerformed

    private void btnUpdateDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDeliveryManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateDeliveryManActionPerformed

    private void btnDeleteDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDeliveryManActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteDeliveryManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDeliveryMan;
    private javax.swing.JButton btnDeleteDeliveryMan;
    private javax.swing.JButton btnUpdateDeliveryMan;
    private javax.swing.JButton btnViewRequestDetails;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblOrganizationDirectory;
    private javax.swing.JTable tblRequestDirectory;
    // End of variables declaration//GEN-END:variables
}
