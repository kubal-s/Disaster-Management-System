/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.volunteerrole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akhil
 */
public class VolunteerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount volunteerAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Enterprise currentEnterprise;
    public VolunteerWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();    
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.volunteerAccount = userAccount;
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

        BtnViewMyTasks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestDirectory = new javax.swing.JTable();
        btnAssigntToMe = new javax.swing.JButton();

        BtnViewMyTasks.setText("View My Tasks");
        BtnViewMyTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewMyTasksActionPerformed(evt);
            }
        });

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
        if (tblRequestDirectory.getColumnModel().getColumnCount() > 0) {
            tblRequestDirectory.getColumnModel().getColumn(0).setResizable(false);
        }

        btnAssigntToMe.setText("Assign To Me");
        btnAssigntToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssigntToMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAssigntToMe)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnViewMyTasks)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssigntToMe)
                .addGap(18, 18, 18)
                .addComponent(BtnViewMyTasks)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnViewMyTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewMyTasksActionPerformed
        // TODO add your handling code here:
        JPanel viewMyVolunterringTasksJPanel = new ViewMyVolunterringTasksJPanel(userProcessContainer,ecosystem,volunteerAccount);
        userProcessContainer.add("viewMyVolunterringTasks",viewMyVolunterringTasksJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_BtnViewMyTasksActionPerformed

    private void btnAssigntToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssigntToMeActionPerformed
        // TODO add your handling code here:
                int selectedRow = tblRequestDirectory.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a request to assign");
        } else {
            DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();

            int requestID = (int) (Integer) dtm.getValueAt(selectedRow, 0);
            WorkRequest cwr = null;
            cwr = ecosystem.getWorkQueue().getWorkRequestByID(requestID);
            if (cwr.getStatus().equals("approved for processing by volunteers")) {
                cwr.setStatus("processed by "+volunteerAccount.getUser().getName());
                if(cwr.getForwardRequest().getRequestedEnterprise().equals(Enterprise.EnterpriseType.FoodBank)){
                    cwr.getForwardRequest().setStatus("delivered by "+volunteerAccount.getUser().getName());
                }
                populateRequests();
            }
            else{
                JOptionPane.showMessageDialog(null, "Request already assigned for processing");
            }

        }
        DB4OUtil.getInstance().storeSystem(ecosystem);

    }//GEN-LAST:event_btnAssigntToMeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnViewMyTasks;
    private javax.swing.JButton btnAssigntToMe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestDirectory;
    // End of variables declaration//GEN-END:variables

        private void populateRequests() {
        DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();
        dtm.setRowCount(0);

        for (WorkRequest w : ecosystem.getWorkQueue().getWorkRequestList()) {
            if (w.getRequestedEnterprise().equals(Enterprise.EnterpriseType.NonGovernmentOrganization)
                    && w.getAssignedEnterprise() == this.currentEnterprise
                    && (w.getStatus().equals("approved for processing by volunteers")
                    || w.getStatus().startsWith("processed by"))) {
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
                    if (o.getName().equals(Organization.Type.Volunteer.getValue())
                            && o.getUserAccountDirectory().getUserAccountList().contains(volunteerAccount)) {
                        this.currentEnterprise = e;
                        break outerloop;
                    }
                }

            }
        }
        populateRequests();
    }

}
