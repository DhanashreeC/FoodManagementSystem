/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.organization.restaurantManagerWorkArea;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.RestaurantOrganization;
import business.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Monas
 */
public class RestaurantManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private RestaurantOrganization restaurantOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;

    public RestaurantManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, RestaurantOrganization restaurantOrganization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.restaurantOrganization = restaurantOrganization;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
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
        manageMenuBtn = new javax.swing.JButton();
        orderGroceryBtn = new javax.swing.JButton();
        manageFoodOffersBtn = new javax.swing.JButton();
        viewReportBtn = new javax.swing.JButton();
        donateFoodBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Restaurant Manager Work Area");

        manageMenuBtn.setText("Manage Menu");
        manageMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuBtnActionPerformed(evt);
            }
        });

        orderGroceryBtn.setText("Order Grocery");
        orderGroceryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderGroceryBtnActionPerformed(evt);
            }
        });

        manageFoodOffersBtn.setText("Place food offers");
        manageFoodOffersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFoodOffersBtnActionPerformed(evt);
            }
        });

        viewReportBtn.setText("View Report");
        viewReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportBtnActionPerformed(evt);
            }
        });

        donateFoodBtn.setText("Donate Food");
        donateFoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donateFoodBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(manageMenuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orderGroceryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(manageFoodOffersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                        .addComponent(donateFoodBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(manageMenuBtn)
                .addGap(38, 38, 38)
                .addComponent(manageFoodOffersBtn)
                .addGap(34, 34, 34)
                .addComponent(donateFoodBtn)
                .addGap(32, 32, 32)
                .addComponent(orderGroceryBtn)
                .addGap(36, 36, 36)
                .addComponent(viewReportBtn)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuBtnActionPerformed
        RestaurantManagerMenuJPanel restaurantManageMenuJPanel = new RestaurantManagerMenuJPanel(userProcessContainer, restaurantOrganization);
        userProcessContainer.add("RestaurantManageMenuJPanel", restaurantManageMenuJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageMenuBtnActionPerformed

    private void orderGroceryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderGroceryBtnActionPerformed
        RestaurantManagerOrderGroceryJPanel restaurantOrderGroceryJPanel = new RestaurantManagerOrderGroceryJPanel(userProcessContainer, enterprise, restaurantOrganization);
        userProcessContainer.add("RestaurantOrderGrocery", restaurantOrderGroceryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_orderGroceryBtnActionPerformed

    private void manageFoodOffersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFoodOffersBtnActionPerformed
        RestaurantManagerPlaceNewRequestJPanel restaurantManagerPlaceNewRequestJPanel = new RestaurantManagerPlaceNewRequestJPanel(userProcessContainer, userAccount, restaurantOrganization, enterprise);
        userProcessContainer.add("restaurantManagerPlaceNewRequestJPanel", restaurantManagerPlaceNewRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageFoodOffersBtnActionPerformed

    private void viewReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportBtnActionPerformed
        RestaurantManagerViewReportJPanel restaurantManagerViewReportJPanel = new RestaurantManagerViewReportJPanel(userProcessContainer, restaurantOrganization);
        userProcessContainer.add("RestaurantManagerViewReportJPanel", restaurantManagerViewReportJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewReportBtnActionPerformed

    private void donateFoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donateFoodBtnActionPerformed
        RestaurantManagerDonateRequestJPanel restaurantManagerDonateRequestJPanel = new RestaurantManagerDonateRequestJPanel(userProcessContainer, userAccount, network, restaurantOrganization);
        userProcessContainer.add("RestaurantManagerDonateRequestJPanel", restaurantManagerDonateRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_donateFoodBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton donateFoodBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageFoodOffersBtn;
    private javax.swing.JButton manageMenuBtn;
    private javax.swing.JButton orderGroceryBtn;
    private javax.swing.JButton viewReportBtn;
    // End of variables declaration//GEN-END:variables
}
