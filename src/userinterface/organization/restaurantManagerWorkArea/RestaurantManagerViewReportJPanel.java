/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.organization.restaurantManagerWorkArea;

import business.organization.RestaurantOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Monas
 */
public class RestaurantManagerViewReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkAdminViewReportJPanel
     */
    private JPanel userProcessContainer;
    private RestaurantOrganization restaurantOrganization;

    public RestaurantManagerViewReportJPanel(JPanel userProcessContainer, RestaurantOrganization restaurantOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.restaurantOrganization = restaurantOrganization;
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
        backBtn = new javax.swing.JButton();
        pieChartButton = new javax.swing.JButton();
        barchartWasteButton = new javax.swing.JButton();
        barchartRevenueButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Report");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        pieChartButton.setText("View Food Waste Pie Chart");
        pieChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieChartButtonActionPerformed(evt);
            }
        });

        barchartWasteButton.setText("Line chart of Waste over the time");
        barchartWasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barchartWasteButtonActionPerformed(evt);
            }
        });

        barchartRevenueButton.setText("Line chart of Revenue over the time");
        barchartRevenueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barchartRevenueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(barchartWasteButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pieChartButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(barchartRevenueButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(pieChartButton)
                .addGap(46, 46, 46)
                .addComponent(barchartWasteButton)
                .addGap(51, 51, 51)
                .addComponent(barchartRevenueButton)
                .addContainerGap(206, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void pieChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieChartButtonActionPerformed
        RestaurantFoodWastePieChartJPanel restaurantFoodWastePieChartJPanel = new RestaurantFoodWastePieChartJPanel(userProcessContainer, restaurantOrganization);
        userProcessContainer.add("RestaurantFoodWastePieChartJPanel", restaurantFoodWastePieChartJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_pieChartButtonActionPerformed

    private void barchartWasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barchartWasteButtonActionPerformed
        RestaurantFoodWasteLineChartJPanel restaurantFoodWasteBarChartJPanel = new RestaurantFoodWasteLineChartJPanel(userProcessContainer, restaurantOrganization);
        userProcessContainer.add("RestaurantFoodWasteBarChartJPanel", restaurantFoodWasteBarChartJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_barchartWasteButtonActionPerformed

    private void barchartRevenueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barchartRevenueButtonActionPerformed
        RestaurantFoodRevenueLineChartJPanel restaurantFoodRevenueBarChartJPanel = new RestaurantFoodRevenueLineChartJPanel(userProcessContainer, restaurantOrganization);
        userProcessContainer.add("RestaurantFoodRevenueBarChartJPanel", restaurantFoodRevenueBarChartJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_barchartRevenueButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton barchartRevenueButton;
    private javax.swing.JButton barchartWasteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pieChartButton;
    // End of variables declaration//GEN-END:variables
}
