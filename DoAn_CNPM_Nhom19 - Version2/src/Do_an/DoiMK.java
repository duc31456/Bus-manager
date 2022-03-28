/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Do_an;

import static Do_an.KetNoi.layKetNoi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DoiMK extends javax.swing.JFrame {

    /**
     * Creates new form TaoUser
     */
    public DoiMK() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Đổi mật khẩu");
    }

    public DoiMK(String user) {
        initComponents();
        L_Ten.setText(user);
        this.setLocationRelativeTo(null);
        this.setTitle("Đổi mật khẩu");

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
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        B_Back = new javax.swing.JButton();
        B_Check = new javax.swing.JButton();
        B_Doi = new javax.swing.JButton();
        B_Xoa = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        L_Ten = new javax.swing.JLabel();
        T_Pass1 = new javax.swing.JPasswordField();
        T_Pass3 = new javax.swing.JPasswordField();
        T_Pass2 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ĐỔI MẬT KHẨU");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 90));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 570, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NHẬP LẠI MẬT KHẨU ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 170, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TÀI KHOẢN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 110, 50));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MẬT KHẨU");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 110, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MẬT KHẨU MỚI");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, 50));

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

        B_Check.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Check.setForeground(new java.awt.Color(58, 71, 80));
        B_Check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/check_18.png"))); // NOI18N
        B_Check.setText("KIỂM TRA");
        B_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CheckActionPerformed(evt);
            }
        });
        jPanel1.add(B_Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, 40));

        B_Doi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Doi.setForeground(new java.awt.Color(58, 71, 80));
        B_Doi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/change_22.png"))); // NOI18N
        B_Doi.setText("ĐỔI");
        B_Doi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_DoiActionPerformed(evt);
            }
        });
        jPanel1.add(B_Doi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 110, 40));

        B_Xoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        B_Xoa.setForeground(new java.awt.Color(58, 71, 80));
        B_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/new_18.png"))); // NOI18N
        B_Xoa.setText("LÀM MỚI");
        B_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_XoaActionPerformed(evt);
            }
        });
        jPanel1.add(B_Xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 640, 130, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/lock_50.png"))); // NOI18N
        jLabel11.setText("jLabel7");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, 60));

        L_Ten.setBackground(new java.awt.Color(153, 153, 153));
        L_Ten.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        L_Ten.setOpaque(true);
        jPanel1.add(L_Ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 310, 40));

        T_Pass1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        T_Pass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_Pass1ActionPerformed(evt);
            }
        });
        jPanel1.add(T_Pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 310, 40));

        T_Pass3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        T_Pass3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_Pass3ActionPerformed(evt);
            }
        });
        jPanel1.add(T_Pass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 310, 40));

        T_Pass2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jPanel1.add(T_Pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 310, 40));

        jLabel12.setBackground(new java.awt.Color(183, 183, 183));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/bg_form.jpg"))); // NOI18N
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

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

    private void B_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_XoaActionPerformed
        T_Pass1.setText("");
        T_Pass2.setText("");
        T_Pass3.setText("");
    }//GEN-LAST:event_B_XoaActionPerformed

    private void B_DoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_DoiActionPerformed
        String ten = L_Ten.getText();
        String pass = T_Pass3.getText();
        
        
        if (pass.equals(T_Pass2.getText())) 
        {
            if (checkTK(ten, T_Pass1.getText()) == 1) 
            {
                if(!pass.equals(T_Pass1.getText()))
                {
                    if (checkpass(pass) == 1 && checkusername(ten) == 1) 
                    {
                        doiMK(pass, ten);
                        JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
                        T_Pass1.setText("");
                        T_Pass2.setText("");
                        T_Pass3.setText("");
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu đúng định dạng ký tự (a-z,A-Z,0-9)", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                    }
                } 
                else 
                {
                    JOptionPane.showMessageDialog(this, "Mật khẩu mới không được trùng mật khẩu cũ","Thông Báo", JOptionPane.WARNING_MESSAGE);
                }
            } 
            else
            {
                JOptionPane.showMessageDialog(this, "Mật khẩu hiện tại không đúng", "Thông Báo", JOptionPane.WARNING_MESSAGE);
            }
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Mật khẩu không khớp", "Thông Báo", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_B_DoiActionPerformed

    private void B_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BackActionPerformed
        User us = new User();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_B_BackActionPerformed

    private void B_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CheckActionPerformed
        String ten = L_Ten.getText();
        String pass = T_Pass1.getText();
        if (checkTK(ten, pass) == 1) {
            if (T_Pass2.getText().equals(T_Pass3.getText())) {
                if (checkpass(pass) == 1 && checkusername(ten) == 1) {
                    JOptionPane.showMessageDialog(this, " Bạn có thể đổi mật khẩu cho tài khoản này");
                } else {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu đúng định dạng ký tự (a-z,A-Z,0-9)", "Thông Báo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mật khẩu mới không khớp", "Thông Báo", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Mật khẩu hiện tại không đúng", "Thông Báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_B_CheckActionPerformed

    private void T_Pass3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_Pass3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_Pass3ActionPerformed

    public int checkTK(String a, String b) {
        int c = 0;
        Connection kn = layKetNoi();
        String sql = "Select * from TAIKHOAN WHERE TaiKhoan =? AND MatKhau =?";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, a);
            ps.setString(2, b);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                c = 1;
            }
        } catch (SQLException e) {
            Logger.getLogger(DoiMK.class.getName()).log(Level.SEVERE, null, e);
        }

        return c;
    }

    public void doiMK(String pass, String ten) {
        Connection kn = layKetNoi();
        String sql = "UPDATE TAIKHOAN SET MatKhau = ? WHERE TaiKhoan=?";
        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, pass);
            ps.setString(2, ten);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(DoiMK.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public int checkusername(String a) {
        int b = 0;
        String check = "[a-zA-Z0-9]{1,10}$";
        if (a.matches(check)) {
            b = 1;
        }
        return b;
    }

    public int checkpass(String a) {
        int b = 0;
        String check = "[a-zA-Z0-9]{1,20}$";
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
            java.util.logging.Logger.getLogger(DoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Back;
    private javax.swing.JButton B_Check;
    private javax.swing.JButton B_Doi;
    private javax.swing.JButton B_Xoa;
    private javax.swing.JLabel L_Ten;
    private javax.swing.JPasswordField T_Pass1;
    private javax.swing.JPasswordField T_Pass2;
    private javax.swing.JPasswordField T_Pass3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
