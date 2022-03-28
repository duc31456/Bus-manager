/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Do_an;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static Do_an.KetNoi.layKetNoi;

/**
 *
 * @author Administrator
 */
public class TaoUser extends javax.swing.JFrame {

    /**
     * Creates new form TaoUser
     */
    public TaoUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tạo tài khoản mới");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        B_Ktra = new javax.swing.JButton();
        B_Tao = new javax.swing.JButton();
        B_Renew = new javax.swing.JButton();
        B_Back = new javax.swing.JButton();
        T_Ten = new javax.swing.JTextField();
        T_Pass1 = new javax.swing.JPasswordField();
        T_Pass2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TẠO TÀI KHOẢN MỚI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 350, 80));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 540, 10));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TÊN TÀI KHOẢN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MẬT KHẨU");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, 50));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NHẬP LẠI MẬT KHẨU");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 170, 50));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/add_50.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 50, 50));

        B_Ktra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Ktra.setForeground(new java.awt.Color(58, 71, 80));
        B_Ktra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/check_18.png"))); // NOI18N
        B_Ktra.setText("KIỂM TRA");
        B_Ktra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_KtraActionPerformed(evt);
            }
        });
        jPanel1.add(B_Ktra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, 40));

        B_Tao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Tao.setForeground(new java.awt.Color(58, 71, 80));
        B_Tao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/add_22.png"))); // NOI18N
        B_Tao.setText("TẠO");
        B_Tao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_TaoActionPerformed(evt);
            }
        });
        jPanel1.add(B_Tao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 110, 40));

        B_Renew.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Renew.setForeground(new java.awt.Color(58, 71, 80));
        B_Renew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/new_18.png"))); // NOI18N
        B_Renew.setText("LÀM MỚI");
        B_Renew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RenewActionPerformed(evt);
            }
        });
        jPanel1.add(B_Renew, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, 130, 40));

        B_Back.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Back.setForeground(new java.awt.Color(58, 71, 80));
        B_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/back_18.png"))); // NOI18N
        B_Back.setText("TRỞ VỀ");
        B_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BackActionPerformed(evt);
            }
        });
        jPanel1.add(B_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 120, 40));

        T_Ten.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        T_Ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_TenActionPerformed(evt);
            }
        });
        jPanel1.add(T_Ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 310, 40));

        T_Pass1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        T_Pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_Pass1ActionPerformed(evt);
            }
        });
        jPanel1.add(T_Pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 310, 40));

        T_Pass2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(T_Pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 310, 40));

        jLabel10.setBackground(new java.awt.Color(183, 183, 183));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/bg_form.jpg"))); // NOI18N
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 740));

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


    private void T_Pass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_Pass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_Pass1ActionPerformed

    private void T_TenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_TenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_TenActionPerformed

    private void B_KtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_KtraActionPerformed
        String ten = T_Ten.getText().toUpperCase().trim();
        String pass = T_Pass1.getText();

        Connection kn = layKetNoi();

        if (ten.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(this, " Vui Lòng Điền Đầy Đủ Thông Tin","Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if (checkusername(ten) == 1 && checkupass(pass) == 1) {
            if (T_Pass1.getText().equals(T_Pass2.getText())) {

                if (checkUser(ten) != 1) {
                    JOptionPane.showMessageDialog(this, "Bạn Có Thể Sử Dụng Tên Này");
                } else {
                    JOptionPane.showMessageDialog(this, "Tên Đã Tồn Tại Vui Lòng Thử Tên Khác","Thông Báo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                  JOptionPane.showMessageDialog(this, "Mật Khẩu Không Trùng Khớp","Thông Báo", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            if(checkusername(ten) != 1)
                JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Tài Khoản Đúng Định Dạng (A-Z a-z 1-9)","Thông Báo", JOptionPane.WARNING_MESSAGE);
            else if(checkupass(pass) != 1)
                JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Mật Khẩu Đúng Định Dạng (A-Z a-z 1-9)","Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_B_KtraActionPerformed

    private void B_TaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_TaoActionPerformed

        String ten = T_Ten.getText().toUpperCase().trim();
        String pass = T_Pass1.getText();

        if (ten.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(this, " Vui Lòng Điền Đầy Đủ Thông Tin", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        } else if (checkusername(ten) == 1 && checkupass(pass) == 1) {
            if (T_Pass1.getText().equals(T_Pass2.getText())) {
                if (checkUser(ten) != 1) {
                    tao(ten, pass);
                    JOptionPane.showMessageDialog(this, "Tạo Thành Công");
                    T_Ten.setText("");
                    T_Pass1.setText("");
                    T_Pass2.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Tên Đã Tồn Tại Vui Lòng Thử Tên Khác", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mật Khẩu Không Trùng Khớp", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui Lòng Nhập Đúng Định Dạng (A-Z a-z 1-9)", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_B_TaoActionPerformed

    private void B_RenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RenewActionPerformed
        T_Ten.setText("");
        T_Pass1.setText("");
        T_Pass2.setText("");
    }//GEN-LAST:event_B_RenewActionPerformed

    private void B_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BackActionPerformed
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_BackActionPerformed

    
    public void tao(String ten, String pass) {
        Connection kn = layKetNoi();
        String sql = "insert into TAIKHOAN values (?,?,1)";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, ten.toUpperCase());
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(TaoUser.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public int checkUser(String a) {
        int b = 0;
        Connection kn = layKetNoi();
        String sql = "Select TaiKhoan from TAIKHOAN";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getString("TaiKhoan").equals(a)) {
                    b = 1;
                }
            }

        } catch (SQLException e) {
            Logger.getLogger(TaoUser.class.getName()).log(Level.SEVERE, null, e);

        }

        return b;
    }

    public int checkusername(String a) {
        int b = 0;
//        String check = "[a-z0-9_-]{1,15}$";
        String check = "[a-z0-9A-Z]{1,15}$";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }

    public int checkupass(String a) {
        int b = 0;
//        String check = "[a-z0-9_-]{1,20}$";
        String check = "[a-z0-9A-Z]{1,20}$";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }

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
            java.util.logging.Logger.getLogger(TaoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Back;
    private javax.swing.JButton B_Ktra;
    private javax.swing.JButton B_Renew;
    private javax.swing.JButton B_Tao;
    private javax.swing.JPasswordField T_Pass1;
    private javax.swing.JPasswordField T_Pass2;
    private javax.swing.JTextField T_Ten;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}