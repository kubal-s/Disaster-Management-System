/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.foodpackagerrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodBankEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhil
 */
public class ViewMyPackagingTasksJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewMyPackagingTasksJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount packagerAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Enterprise currentEnterprise;

    public ViewMyPackagingTasksJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.packagerAccount = userAccount;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestDirectory = new javax.swing.JTable();
        btnProcessRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 240));

        tblRequestDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Request ID", "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestDirectory);

        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/pack.jpg"))); // NOI18N

        btnViewDetails.setText("View Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProcessRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnViewDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProcessRequest)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        int selectedRow = tblRequestDirectory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a request to process");
        } else {
            JFrame frame = new JFrame();
            Object input = JOptionPane.showInputDialog(frame, "Enter number of food packets:");
            int assignedFoodPackets = Integer.parseInt(input.toString());
            int availableFoodPackets = ((FoodBankEnterprise) this.currentEnterprise).getFoodPackets();
            if (assignedFoodPackets > availableFoodPackets) {
                JOptionPane.showMessageDialog(null, "Not enough food packets available");
            } else {
                ((FoodBankEnterprise) this.currentEnterprise).setFoodPackets(availableFoodPackets-assignedFoodPackets);
                DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();
                int requestID = (int) (Integer) dtm.getValueAt(selectedRow, 0);
                WorkRequest cwr = null;
                cwr = ecosystem.getWorkQueue().getWorkRequestByID(requestID);
                cwr.setStatus("ready for delivery");
                populateRequests();
            }
        }
        DB4OUtil.getInstance().storeSystem(ecosystem);
    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        Component[] comps = this.userProcessContainer.getComponents();
        for (Component comp : comps) {
            if (comp instanceof FoodPackagerWorkAreaJPanel) {
                FoodPackagerWorkAreaJPanel jp = (FoodPackagerWorkAreaJPanel) comp;
                jp.initialize();
            }
        }
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestDirectory;
    // End of variables declaration//GEN-END:variables

    private void populateRequests() {
        DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();
        dtm.setRowCount(0);
        for (WorkRequest w : ecosystem.getWorkQueue().getWorkRequestList()) {
            if (w.getRequestedEnterprise().equals(Enterprise.EnterpriseType.FoodBank)
                    && w.getAssignedEnterprise() == this.currentEnterprise
                    && w.getStatus().equals("packaged by " + this.packagerAccount.getUser().getName())) {
                Object[] row = new Object[tblRequestDirectory.getColumnCount()];
                row[0] = w.getRequestID();
                row[1] = w.getSender().getUser().getName();
                row[2] = w.getStatus();
                dtm.addRow(row);
            }
        }

    }

    public void initialize() {
        outerloop:
        for (Network n : this.ecosystem.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o.getName().equals(Organization.Type.FoodPackaging.getValue())
                            && o.getUserAccountDirectory().getUserAccountList().contains(packagerAccount)) {
                        this.currentEnterprise = e;
                        break outerloop;
                    }
                }

            }
        }
        populateRequests();
    }

}
