/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpusapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nansyiiah
 */
public class LiatUser extends javax.swing.JFrame {

    public Connection conn;
    public ResultSet rs;
    public PreparedStatement pst;
    private String[] data;
    /**
     * Creates new form LiatUser
     */
    public LiatUser() {
        initComponents();
        UpdateTablee();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void UpdateTablee(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpus_pbo", "root", "");
            String sql = "SELECT * FROM akun;";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            ResultSetMetaData md = rs.getMetaData();
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
//            int columnCount = md.getColumnCount();
//            Vector columnNames = new Vector(columnCount);
            
//            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            
            dtm.setRowCount(0);
            String [] dataa = new String[5];
        int i = 1; 
        
        while(rs.next()){
            
            dataa[0] = rs.getString("nim");
            dataa[1] = rs.getString("nama");
            dtm.addRow(dataa);
            i++;
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kembali = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        edituser = new javax.swing.JLabel();
        deleteuser = new javax.swing.JLabel();
        tambahuser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        jPanel1.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 70, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NIM", "Nama"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 330, 120));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 40));

        edituser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edituserMouseClicked(evt);
            }
        });
        jPanel1.add(edituser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 504, 90, 30));

        deleteuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteuserMouseClicked(evt);
            }
        });
        jPanel1.add(deleteuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 110, 30));

        tambahuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahuserMouseClicked(evt);
            }
        });
        jPanel1.add(tambahuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/MacBook_-_5.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 443, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        new MenuAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliMouseClicked

    private void tambahuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahuserMouseClicked
        // TODO add your handling code here:
        new TambahUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_tambahuserMouseClicked

    private void deleteuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteuserMouseClicked
        // TODO add your handling code here:
        new DeleteUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_deleteuserMouseClicked

    private void edituserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edituserMouseClicked
        // TODO add your handling code here:
        new EditUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_edituserMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LiatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LiatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LiatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LiatUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiatUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deleteuser;
    private javax.swing.JLabel edituser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kembali;
    private javax.swing.JLabel tambahuser;
    // End of variables declaration//GEN-END:variables

//    private void initComponents() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
