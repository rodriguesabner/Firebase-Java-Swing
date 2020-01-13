package com.kingaspx.firebase.menu;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.kingaspx.firebase.model.User;
import static com.kingaspx.firebase.util.Common.generateUUID;
import static com.kingaspx.firebase.util.Common.initFirebase;
import java.util.HashMap;
import java.util.Map;

public class Menu extends javax.swing.JFrame {

    private DatabaseReference mDatabase;

    public Menu() {
        initComponents();

        status_request_lbl.setVisible(false);
        initFirebase();
        //more details: https://firebase.google.com/docs/admin/setup?hl=en-us
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        status_request_lbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        first_text_lbl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Firebase Integration - Demo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        status_request_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        status_request_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status_request_lbl.setText("Please, one moment...");
        jPanel1.add(status_request_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 390, 20));

        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(first_text_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 110, -1));

        jButton1.setText("Set Value");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jButton2.setText("Get Value");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, -1));

        jLabel2.setText("New Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, -1));

        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(426, 458));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        status_request_lbl.setVisible(true);
        status_request_lbl.setText("Please, one moment...");
        registerNewUser(first_text_lbl.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        status_request_lbl.setVisible(true);
        status_request_lbl.setText("Please, one moment...");
        readData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField first_text_lbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel status_request_lbl;
    // End of variables declaration//GEN-END:variables

    private void registerNewUser(String email) {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Table...");
        String id = generateUUID();

        User user = new User();
        user.setId_user(id);
        user.setEmail(email);

//        mDatabase.setValue(user, new DatabaseReference.CompletionListener() {
//            @Override
//            public void onComplete(DatabaseError de, DatabaseReference dr) {
//                status_request_lbl.setText("Finish");
//            }
//        });
    }

    private void readData() {
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Table...");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot ds : dataSnapshot.getChildren()) {
                    for (DataSnapshot data : ds.getChildren()) {
                        User user = data.getValue(User.class);
                        System.out.println(user.getEmail());
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError de) {
                System.out.println(de.getDetails());
            }
        });
    }

    private void removeValue(DatabaseReference mDatabase, String id) {
        //Remove Value
        mDatabase.child(id).removeValueAsync();
    }

    private void updateValue(DatabaseReference mDatabase, String id, String newUsername, String newEmail) {
        Map<String, Object> update = new HashMap<String, Object>();
        update.put("username", newUsername);
        update.put("email", newEmail);

        //Update Value
        mDatabase.child(id).updateChildren(update, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError de, DatabaseReference dr) {
                status_request_lbl.setText("Finish");
            }
        });
    }

}
