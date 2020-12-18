/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kingaspx.FirebaseProjects;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;
import java.util.Map;

public class StoreDatabase extends javax.swing.JPanel {

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference().child("users");

    public StoreDatabase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        data_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        data_field1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Store Database");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 30, 400, 60);

        data_field.setBackground(new java.awt.Color(255, 255, 255));
        data_field.setForeground(new java.awt.Color(0, 0, 0));
        data_field.setText("Any Data");
        data_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(data_field);
        data_field.setBounds(130, 160, 370, 40);

        jButton1.setBackground(new java.awt.Color(148, 67, 65));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Store");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 270, 180, 30);

        data_field1.setBackground(new java.awt.Color(255, 255, 255));
        data_field1.setForeground(new java.awt.Color(0, 0, 0));
        data_field1.setText("Any Data");
        data_field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_field1ActionPerformed(evt);
            }
        });
        jPanel1.add(data_field1);
        data_field1.setBounds(130, 210, 370, 40);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void data_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Map<String, Object> users = new HashMap<>();
        users.put(data_field.getText(), data_field1.getText());
        ref.updateChildrenAsync(users);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void data_field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_field1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_field1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField data_field;
    private javax.swing.JTextField data_field1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
