/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.customermanagementsystem;

/**
 *
 * @author coolm
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form CustomerManagementFrame
     */
    public MainMenu() {
        initComponents();
        
        getContentPane().setBackground(new java.awt.Color(51, 51, 51));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomersButton = new javax.swing.JButton();
        ActorsButton = new javax.swing.JButton();
        ReportsButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        CustomersButton.setBackground(new java.awt.Color(51, 51, 51));
        CustomersButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CustomersButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomersButton.setText(" CUSTOMERS");
        CustomersButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CustomersButton.setFocusPainted(false);
        CustomersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomersButtonActionPerformed(evt);
            }
        });

        ActorsButton.setBackground(new java.awt.Color(51, 51, 51));
        ActorsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ActorsButton.setForeground(new java.awt.Color(255, 255, 255));
        ActorsButton.setText(" ACTORS");
        ActorsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ActorsButton.setFocusPainted(false);
        ActorsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActorsButtonActionPerformed(evt);
            }
        });

        ReportsButton.setBackground(new java.awt.Color(51, 51, 51));
        ReportsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ReportsButton.setForeground(new java.awt.Color(255, 255, 255));
        ReportsButton.setText("REPORTS");
        ReportsButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ReportsButton.setFocusPainted(false);
        ReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(51, 51, 51));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("EXIT");
        ExitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ExitButton.setFocusPainted(false);
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGEMENT MENU");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CustomersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ActorsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ReportsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(CustomersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ActorsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomersButtonActionPerformed
        // TODO add your handling code here:
        
        // OPEN CUSTOMER DATA TABLE
        new CustomerManagementForm().setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_CustomersButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ActorsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActorsButtonActionPerformed
        // TODO add your handling code here:
        
        new ActorManagementForm().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ActorsButtonActionPerformed

    private void ReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsButtonActionPerformed
        // TODO add your handling code here:
        
        new ReportForm().setVisible(true);
        
        dispose();
    }//GEN-LAST:event_ReportsButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActorsButton;
    private javax.swing.JButton CustomersButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ReportsButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
