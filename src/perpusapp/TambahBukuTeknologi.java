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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author nansyiiah
 */
public class TambahBukuTeknologi extends javax.swing.JFrame {

    /**
     * Creates new form TambahBukuAdmin
     */
    public Connection conn;
    public ResultSet rs;
    public PreparedStatement pst;
    private String[] data;
    
    public TambahBukuTeknologi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kembali = new javax.swing.JLabel();
        tambahkan = new javax.swing.JLabel();
        tahunterbit = new javax.swing.JTextField();
        idbuku = new javax.swing.JTextField();
        judulbuku = new javax.swing.JTextField();
        penulisbuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        jPanel1.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 80, 40));

        tambahkan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahkanMouseClicked(evt);
            }
        });
        jPanel1.add(tambahkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 90, 40));

        tahunterbit.setBorder(null);
        tahunterbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tahunterbitActionPerformed(evt);
            }
        });
        jPanel1.add(tahunterbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 130, 30));

        idbuku.setBorder(null);
        idbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbukuActionPerformed(evt);
            }
        });
        jPanel1.add(idbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 130, -1));

        judulbuku.setBorder(null);
        judulbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulbukuActionPerformed(evt);
            }
        });
        jPanel1.add(judulbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 130, 30));

        penulisbuku.setBorder(null);
        penulisbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penulisbukuActionPerformed(evt);
            }
        });
        jPanel1.add(penulisbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 130, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/tambah buku.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        // TODO add your handling code here:
        new MenuAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_kembaliMouseClicked

    private void tambahkanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahkanMouseClicked
        // TODO add your handling code here:
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perpus_pbo", "root", "");
            String sql = "insert into buku_teknologi values('"+idbuku.getText()+"','"+judulbuku.getText()+"','"+penulisbuku.getText()+"','"+tahunterbit.getText()+"')";
            Statement stat = conn.createStatement();
            PreparedStatement p = conn.prepareStatement(sql);
            stat.executeUpdate(sql);
//            ResultSetMetaData md = rs.getMetaData();
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan Data");
            
//            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
////            int columnCount = md.getColumnCount();
////            Vector columnNames = new Vector(columnCount);
//            
////            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
//            
//            dtm.setRowCount(0);
//            String [] dataa = new String[5];
//        int i = 1; 
//        
//        while(rs.next()){
//            
//            dataa[0] = rs.getString("id_buku");
//            dataa[1] = rs.getString("judul_buku");
//            dataa[2] = rs.getString("penulis_buku");
//            dataa[3] = rs.getString("tahun_terbit");
//            dtm.addRow(dataa);
//            i++;
//        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tambahkanMouseClicked

    private void tahunterbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tahunterbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tahunterbitActionPerformed

    private void idbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbukuActionPerformed

    private void judulbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulbukuActionPerformed

    private void penulisbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penulisbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penulisbukuActionPerformed

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
            java.util.logging.Logger.getLogger(TambahBukuTeknologi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahBukuTeknologi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahBukuTeknologi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahBukuTeknologi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahBukuTeknologi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idbuku;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField judulbuku;
    private javax.swing.JLabel kembali;
    private javax.swing.JTextField penulisbuku;
    private javax.swing.JTextField tahunterbit;
    private javax.swing.JLabel tambahkan;
    // End of variables declaration//GEN-END:variables
}
