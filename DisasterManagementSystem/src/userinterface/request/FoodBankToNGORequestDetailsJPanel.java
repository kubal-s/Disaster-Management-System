/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.request;

import business.config.EcoSystem;
import business.useraccount.UserAccount;
import business.workqueue.FoodBankToNGORequest;
import business.workqueue.VictimHelpRequest;
import business.workqueue.WorkRequest;
import business.printer.Printer;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import userinterface.foodpackagerrole.FoodPackagerWorkAreaJPanel;
import userinterface.victimrole.VictimWorkAreaJPanel;

public class FoodBankToNGORequestDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VictimRequestDetailsJPanel
     */
    private JPanel userProcessContainer;
    private WorkRequest foodBankToNGORequest;

    public FoodBankToNGORequestDetailsJPanel(JPanel userProcessContainer, WorkRequest foodBankToNGORequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.foodBankToNGORequest = foodBankToNGORequest;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        txtRequestID = new javax.swing.JLabel();
        txtRequestedBy = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        txtRequestedEnterpriseType = new javax.swing.JLabel();
        txtActingEnterprise = new javax.swing.JLabel();
        txtSummary = new javax.swing.JLabel();
        txtDescription = new javax.swing.JLabel();
        txtAddress = new javax.swing.JLabel();
        txtPeopleAffected = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFoodBankSummary = new javax.swing.JLabel();
        txtFoodBankDescription = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtFoodBankRequestID = new javax.swing.JLabel();
        txtSenderName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 240));

        jLabel1.setText("Food Bank Request Details");

        jLabel2.setText("Request ID:");

        jLabel3.setText("Requested By:");

        jLabel4.setText("Summary:");

        jLabel5.setText("Requested Enterprise Type :");

        jLabel6.setText("Acting Enterprise:");

        jLabel7.setText("Description:");

        jLabel8.setText("Address:");

        jLabel9.setText("People Affected:");

        jLabel10.setText("Date:");

        jLabel11.setText("Status:");

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        txtRequestID.setText("N/A");

        txtRequestedBy.setText("N/A");

        txtDate.setText("N/A");

        txtRequestedEnterpriseType.setText("N/A");

        txtActingEnterprise.setText("N/A");

        txtSummary.setText("N/A");

        txtDescription.setText("N/A");

        txtAddress.setText("N/A");

        txtPeopleAffected.setText("N/A");

        txtStatus.setText("N/A");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel12.setText("Phone number:");

        txtPhoneNumber.setText("N/A");

        jLabel13.setText("Help Request Details");

        jLabel14.setText("Summary:");

        jLabel15.setText("Description:");

        txtFoodBankSummary.setText("N/A");

        txtFoodBankDescription.setText("N/A");

        jLabel16.setText("Request ID:");

        jLabel17.setText("Sender:");

        txtFoodBankRequestID.setText("N/A");

        txtSenderName.setText("N/A");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addComponent(jLabel13)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel14)
                                .addComponent(jLabel15)
                                .addComponent(jLabel10)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel12)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel8))
                                .addComponent(jLabel9)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatus)
                            .addComponent(txtPeopleAffected)
                            .addComponent(txtAddress)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtRequestedBy)
                            .addComponent(txtRequestID)
                            .addComponent(txtFoodBankDescription)
                            .addComponent(txtFoodBankSummary)
                            .addComponent(txtDate)
                            .addComponent(txtRequestedEnterpriseType)
                            .addComponent(txtActingEnterprise)
                            .addComponent(txtSummary)
                            .addComponent(txtDescription)
                            .addComponent(txtFoodBankRequestID)
                            .addComponent(txtSenderName))))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtFoodBankRequestID))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtSenderName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtFoodBankSummary))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtFoodBankDescription))
                .addGap(32, 32, 32)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRequestID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRequestedBy))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPhoneNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRequestedEnterpriseType))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtActingEnterprise))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSummary))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAddress))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPeopleAffected))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrint)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed

        PrinterJob pjob = PrinterJob.getPrinterJob();
        PageFormat preformat = pjob.defaultPage();
        preformat.setOrientation(PageFormat.LANDSCAPE);
        PageFormat postformat = pjob.pageDialog(preformat);
        
        if (preformat != postformat) {
            //Set print component
            pjob.setPrintable(new Printer(this), postformat);
            if (pjob.printDialog()) {
                try {
                    pjob.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(FoodBankToNGORequestDetailsJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) this.userProcessContainer.getLayout();
        Component[] comps = this.userProcessContainer.getComponents();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtActingEnterprise;
    private javax.swing.JLabel txtAddress;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txtDescription;
    private javax.swing.JLabel txtFoodBankDescription;
    private javax.swing.JLabel txtFoodBankRequestID;
    private javax.swing.JLabel txtFoodBankSummary;
    private javax.swing.JLabel txtPeopleAffected;
    private javax.swing.JLabel txtPhoneNumber;
    private javax.swing.JLabel txtRequestID;
    private javax.swing.JLabel txtRequestedBy;
    private javax.swing.JLabel txtRequestedEnterpriseType;
    private javax.swing.JLabel txtSenderName;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JLabel txtSummary;
    // End of variables declaration//GEN-END:variables

    private void initialize() {
        WorkRequest victimWorkRequest = ((FoodBankToNGORequest)foodBankToNGORequest).getVictimHelpRequest();
        this.txtFoodBankRequestID.setText(String.valueOf(foodBankToNGORequest.getRequestID()));
        this.txtSenderName.setText(foodBankToNGORequest.getSender().getUser().getName());
        this.txtFoodBankSummary.setText(foodBankToNGORequest.getSummary());
        this.txtFoodBankDescription.setText(foodBankToNGORequest.getDescription());
        if(victimWorkRequest.getAssignedEnterprise()!=null){
            this.txtActingEnterprise.setText(victimWorkRequest.getRequestedEnterprise().toString());
        }
        int peopleAffected = ((VictimHelpRequest) victimWorkRequest).getPeopleAffected();
        this.txtPeopleAffected.setText(String.valueOf(peopleAffected));
        this.txtAddress.setText(victimWorkRequest.getAddress().toString());
        this.txtDate.setText(new SimpleDateFormat("MM-dd-yyyy hh:mm:ss").format(victimWorkRequest.getRequestDate()));
        this.txtDescription.setText(victimWorkRequest.getDescription());
        this.txtRequestID.setText(String.valueOf(victimWorkRequest.getRequestID()));
        this.txtRequestedBy.setText(victimWorkRequest.getSender().getUser().getName());
        this.txtRequestedEnterpriseType.setText(victimWorkRequest.getRequestedEnterprise().getValue());
        this.txtStatus.setText(victimWorkRequest.getStatus());
        this.txtSummary.setText(victimWorkRequest.getSummary());
        this.txtPhoneNumber.setText(victimWorkRequest.getSender().getUser().getPhone());
    }
}
