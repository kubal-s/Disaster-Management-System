/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.doctorrolee;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalToPoliceRequest;
import Business.WorkQueue.PoliceToHospitalRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount doctorAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Enterprise currentEnterprise;

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.doctorAccount = userAccount;
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

        btnAssigntToMe = new javax.swing.JButton();
        BtnViewMyTasks = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestDirectory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/assets/images/doctor-writing-on-clipboard-scene-stock-gif-5602-1280x720.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAssigntToMe)
                            .addComponent(BtnViewMyTasks))))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssigntToMe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnViewMyTasks)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
            if (cwr.getStatus().equals("ready for doctors")) {
                cwr.setStatus("case assigned to Dr. " + doctorAccount.getUser().getName());
                if (cwr instanceof PoliceToHospitalRequest) {
                    ((PoliceToHospitalRequest) cwr).getVictimHelpRequest().setStatus("case assigned to Dr. " + doctorAccount.getUser().getName());
                }
                populateRequests();
            } else {
                JOptionPane.showMessageDialog(null, "Request already assigned");
            }

        }
        DB4OUtil.getInstance().storeSystem(ecosystem);

    }//GEN-LAST:event_btnAssigntToMeActionPerformed

    private void BtnViewMyTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewMyTasksActionPerformed
        // TODO add your handling code here:
        JPanel doctorTasksJPanel = new DoctorTasksJPanel(userProcessContainer, ecosystem, doctorAccount);
        userProcessContainer.add("doctorTasks", doctorTasksJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(this.userProcessContainer);
    }//GEN-LAST:event_BtnViewMyTasksActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnViewMyTasks;
    private javax.swing.JButton btnAssigntToMe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequestDirectory;
    // End of variables declaration//GEN-END:variables

    private void populateRequests() {
        DefaultTableModel dtm = (DefaultTableModel) tblRequestDirectory.getModel();
        dtm.setRowCount(0);

        for (WorkRequest w : ecosystem.getWorkQueue().getWorkRequestList()) {
            if (w.getRequestedEnterprise().equals(Enterprise.EnterpriseType.Hospital)
                    && w.getAssignedEnterprise() == this.currentEnterprise
                    && (w.getStatus().equals("ready for doctors")
                    || w.getStatus().startsWith("case assigned to Dr."))) {
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
                    if (o.getName().equals(Organization.Type.Doctor.getValue())
                            && o.getUserAccountDirectory().getUserAccountList().contains(doctorAccount)) {
                        this.currentEnterprise = e;
                        break outerloop;
                    }
                }

            }
        }
        populateRequests();
    }
}
