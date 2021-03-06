/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.organization.groceryManagerWorkArea;

import business.enterprise.EndPointEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.GroceryOrganization;
import business.organization.NGOOrganization;
import business.organization.Organization;
import business.userAccount.UserAccount;
import business.workQueue.StatusEnum;
import business.workQueue.UglyGroceryWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhanashree Chavan
 */
public class GroceryManagerDonateRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GroceryManagerDonateRequestJPanel
     */
    private JPanel userProcessContainer;
    private GroceryOrganization groceryOrganization;
    private UserAccount userAccount;
    private Network network;

    public GroceryManagerDonateRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Network network, GroceryOrganization groceryOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.groceryOrganization = groceryOrganization;
        this.userAccount = userAccount;
        this.network = network;
        populateNGOJComboBox();
        populateUglyFoodWorkRequestJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        uglyFoodWorkRequestJTable = new javax.swing.JTable();
        donatejButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ngoJComboBox = new javax.swing.JComboBox();

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donate Grocery Request");

        uglyFoodWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Total Quantity", "Available Quantity", "Raised by", "Store Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uglyFoodWorkRequestJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(uglyFoodWorkRequestJTable);

        donatejButton.setText("Donate");
        donatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donatejButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("NGO Name: ");

        ngoJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ngoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(donatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngoJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(donatejButton))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void donatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donatejButtonActionPerformed
        int selectedRow = uglyFoodWorkRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");
            return;
        }

        UglyGroceryWorkRequest selectedRequest = (UglyGroceryWorkRequest) uglyFoodWorkRequestJTable.getValueAt(selectedRow, 4);
        Organization selectedNGO = (NGOOrganization) ngoJComboBox.getSelectedItem();
        selectedNGO.getUglyGroceryWorkQueue().getUglyGroceryWorkRequestList().add(selectedRequest);
        selectedRequest.setStatus(StatusEnum.GroceryToDonate);
        JOptionPane.showMessageDialog(null, "Request sent to " + selectedNGO + ". Thank You!!");

        populateUglyFoodWorkRequestJTable();
    }//GEN-LAST:event_donatejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton donatejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox ngoJComboBox;
    private javax.swing.JTable uglyFoodWorkRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateNGOJComboBox() {
        ngoJComboBox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof EndPointEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof NGOOrganization) {
                        ngoJComboBox.addItem(organization);
                    }

                }
                break;
            }
        }
    }

    private void populateUglyFoodWorkRequestJTable() {
        DefaultTableModel model = (DefaultTableModel) uglyFoodWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (UserAccount ua : groceryOrganization.getUserAccountDirectory().getUserAccountList()) {
            for (UglyGroceryWorkRequest workRequest : ua.getGroceryWorkQueue().getUglyGroceryWorkRequestList()) {
                workRequest.checkExpired();
                if (workRequest.getStatus().equals(StatusEnum.GroceryToSell)) {
                    Object[] row = new Object[5];
                    row[0] = workRequest.getProduct();
                    row[1] = workRequest.getTotalQuantity();
                    row[2] = workRequest.getAvailQuantity();
                    row[3] = workRequest.getSender();
                    row[4] = workRequest;
                    model.addRow(row);
                }
            }
        }
    }

}
