/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.organization.groceryAdminWorkArea;

import business.organization.GroceryOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Monas
 */
public class GroceryAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * s
     * Creates new form NetworkAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private GroceryOrganization groceryOrganization;

    public GroceryAdminWorkAreaJPanel(JPanel userProcessContainer, GroceryOrganization groceryOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.groceryOrganization = groceryOrganization;
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
        manageEmployeeBtn = new javax.swing.JButton();
        manageUserAccountsBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Grocery Admin Work Area");

        manageEmployeeBtn.setText("Manage Employee");
        manageEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeBtnActionPerformed(evt);
            }
        });

        manageUserAccountsBtn.setText("Manage User Accounts");
        manageUserAccountsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageUserAccountsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(manageEmployeeBtn)
                .addGap(49, 49, 49)
                .addComponent(manageUserAccountsBtn)
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeBtnActionPerformed
        GroceryManageEmployeeJPanel groceryManageEmployeeJPanel = new GroceryManageEmployeeJPanel(userProcessContainer, groceryOrganization);
        userProcessContainer.add("GroceryManageEmployeeJPanel", groceryManageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeBtnActionPerformed

    private void manageUserAccountsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountsBtnActionPerformed
        GroceryManageUserAccountJPanel groceryManageUserAccountJPanel = new GroceryManageUserAccountJPanel(userProcessContainer, groceryOrganization);
        userProcessContainer.add("GroceryManageUserAccountJPanel", groceryManageUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageUserAccountsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeBtn;
    private javax.swing.JButton manageUserAccountsBtn;
    // End of variables declaration//GEN-END:variables
}
