/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Do_an;

import static Do_an.KetNoi.layKetNoi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class QLNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form QLNhanVien
     */
    public QLNhanVien() {
        
        initComponents();
        layduLieuNV();
        this.setLocationRelativeTo(null);
        this.setTitle("Quản lý nhân viên");
    }
    static DefaultTableModel dtm;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        B_Back = new javax.swing.JButton();
        B_Change = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_NV = new javax.swing.JTable();
        btn_xoa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("QUẢN LÝ NHÂN VIÊN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 350, 80));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 540, 10));

        B_Back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Back.setForeground(new java.awt.Color(58, 71, 80));
        B_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/back_18.png"))); // NOI18N
        B_Back.setText("TRỞ VỀ");
        B_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BackActionPerformed(evt);
            }
        });
        jPanel1.add(B_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 700, 120, 40));

        B_Change.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Change.setForeground(new java.awt.Color(58, 71, 80));
        B_Change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/change_22.png"))); // NOI18N
        B_Change.setText("THAY ĐỔI");
        B_Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ChangeActionPerformed(evt);
            }
        });
        jPanel1.add(B_Change, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 700, -1, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/users_settings_50.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, 50));

        T_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "CMND", "Giới Tính", "Số Điện Thoại", "Tài Khoản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(T_NV);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 900, 510));

        btn_xoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/delete_18.png"))); // NOI18N
        btn_xoa.setText("XÓA");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 700, 130, 40));

        jLabel4.setBackground(new java.awt.Color(183, 183, 183));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/background_form_new.jpg"))); // NOI18N
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ChangeActionPerformed
       int removeIndex = T_NV.getSelectedRow();
        
       if(removeIndex == -1)
       {
            editNhanVien e = new editNhanVien();
            e.setVisible(true);
            this.dispose();
       }
       else 
        {
            String ma = T_NV.getModel().getValueAt(removeIndex, 0).toString();
            String ten = T_NV.getModel().getValueAt(removeIndex, 1).toString();
            String cmnd = T_NV.getModel().getValueAt(removeIndex, 2).toString();
            String gioi = T_NV.getModel().getValueAt(removeIndex, 3).toString();
            String sdt = T_NV.getModel().getValueAt(removeIndex, 4).toString();
            String tk = T_NV.getModel().getValueAt(removeIndex, 5).toString();
            editNhanVien e = new editNhanVien(ma,ten,cmnd,gioi.trim(),sdt,tk);
            e.setVisible(true);
            this.dispose();
        }
        
//        editNhanVien e = new editNhanVien();
//        e.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_B_ChangeActionPerformed

    private void B_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BackActionPerformed
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_BackActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int removeIndex = T_NV.getSelectedRow();
       
       if(removeIndex == -1)
       {
           JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 nhân viên để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
       }
       else 
        {
           String ma = T_NV.getModel().getValueAt(removeIndex, 0).toString();
           
           if(CheckNV_ChuyenXe(ma) != 1)
           {
                int rett = JOptionPane.showConfirmDialog(rootPane, "Bạn có thật sự muốn xóa?");
                if( rett == JOptionPane.OK_OPTION)
                {
                     xoaNV(ma);
                     layduLieuNV();
                     JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
                }
                else
                {
                    return;
                }
           }
           else
           {
               JOptionPane.showMessageDialog(this, "Nhân viên này hiện đang lưu trong hệ thống, không thể xóa!!", "Thông Báo", JOptionPane.WARNING_MESSAGE);
           }
           
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

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
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNhanVien().setVisible(true);
            }
        });
    }
    
    public int CheckNV_ChuyenXe(String ma){
        Connection kn = layKetNoi();
        int b = 0;
        String sql = "select * from CHUYENXE where MaNV ='" + ma + "'";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                b = 1;
            }
        } catch (Exception ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return b;
    }
    
    public void xoaNV(String maNV){
        Connection conn = layKetNoi();
        String sql = "delete from NHANVIEN where MaNV = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, maNV);
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void layduLieuNV() {
        Connection kn = layKetNoi();
        DefaultTableModel dtm = (DefaultTableModel) T_NV.getModel();
        dtm.setNumRows(0);

        String sql = "Select * from NHANVIEN, TAIKHOAN where TAIKHOAN.TaiKhoan = NHANVIEN.TaiKhoan and TAIKHOAN.MaVaiTro = 1 order by MaNV ";
        Vector vt;
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vt = new Vector();
                vt.add(rs.getString("MaNV"));
                vt.add(rs.getString("TenNV"));
                vt.add(rs.getString("CMND"));
                vt.add(rs.getString("GioiTinh"));
                vt.add(rs.getString("DienThoai"));
                vt.add(rs.getString("TaiKhoan"));
                dtm.addRow(vt);
            }
            T_NV.setModel(dtm);
            rs.close();
            ps.close();
            kn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QLNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Back;
    private javax.swing.JButton B_Change;
    private javax.swing.JTable T_NV;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
