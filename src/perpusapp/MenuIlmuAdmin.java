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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nansyiiah
 */
public class MenuIlmuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuIlmuAdmin
     */
    public Connection conn;
    public ResultSet rs;
    public PreparedStatement pst;
    private String[] data;
    public MenuIlmuAdmin() {
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
            String sql = "SELECT * FROM buku_ilmupengetahuan;";
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
            
            dataa[0] = rs.getString("id_buku");
            dataa[1] = rs.getString("judul_buku");
            dataa[2] = rs.getString("penulis_buku");
            dataa[3] = rs.getString("tahun_terbit");
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        edit_buku = new javax.swing.JLabel();
        kembali = new javax.swing.JLabel();
        tambah_buku = new javax.swing.JLabel();
        delete_buku = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Buku", "Judul Buku", "Penulis Buku", "Tahun Terbit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 320, 120));

        edit_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_bukuMouseClicked(evt);
            }
        });
        jPanel2.add(edit_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 120, 40));

        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        jPanel2.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 94, 80, 40));

        tambah_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambah_bukuMouseClicked(evt);
            }
        });
        jPanel2.add(tambah_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, 40));

        delete_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_bukuMouseClicked(evt);
            }
        });
        jPanel2.add(delete_buku, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buku ilmu pengetahuan.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambah_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambah_bukuMouseClicked
        // TODO add your handling code here:
        new TambahBukuIlmu().setVisible(true);
        dispose();
    }//GEN-LAST:event_tambah_bukuMouseClicked

    private void edit_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_bukuMouseClicked
        // TODO add your handling code here:
        new EditBukuIlmu().setVisible(true);
        dispose();
    }//GEN-LAST:event_edit_bukuMouseClicked

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        // TODO add your handling code here:
        new MenuAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliMouseClicked

    private void delete_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_bukuMouseClicked
        // TODO add your handling code here:
        new DeleteBukuIlmu().setVisible(true);
        dispose();
    }//GEN-LAST:event_delete_bukuMouseClicked

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
            java.util.logging.Logger.getLogger(MenuIlmuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuIlmuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuIlmuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuIlmuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuIlmuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel delete_buku;
    private javax.swing.JLabel edit_buku;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel kembali;
    private javax.swing.JLabel tambah_buku;
    // End of variables declaration//GEN-END:variables
}
