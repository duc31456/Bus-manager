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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class TongKet extends javax.swing.JFrame {

   private static String sv = "1";
   private static String th = "2";

    /**
     * Creates new form TongKet
     */
    public TongKet() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Tổng kết vé theo tháng đầy đủ");

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat ngay = new SimpleDateFormat("dd");
        SimpleDateFormat thang = new SimpleDateFormat("MM");
        SimpleDateFormat nam = new SimpleDateFormat("yyyy");
        N_Thang.setValue(Integer.parseInt(thang.format(date)));
        N_Nam.setValue(Integer.parseInt(nam.format(date)));
        N_Thang.setMaximum(12);
        N_Thang.setMinimum(1);
        N_Nam.setMaximum(2100);
        N_Nam.setMinimum(2000);

        layduLieuSLT();
//        layduLieuTKT();
        hienthongtin();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        N_Thang = new com.toedter.components.JSpinField();
        N_Nam = new com.toedter.components.JSpinField();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_SL = new javax.swing.JTable();
        TKA = new javax.swing.JLabel();
        SLSV = new javax.swing.JLabel();
        SLT = new javax.swing.JLabel();
        TKA1 = new javax.swing.JLabel();
        SLSV1 = new javax.swing.JLabel();
        SLT1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("vé");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 680, 30, 25));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Đồng");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 680, -1, 25));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tháng");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Năm");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jButton3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/show_22.png"))); // NOI18N
        jButton3.setText("Hiển Thị Thông Tin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 50, 210, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tổng:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Vé HS/SV");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, -1, 25));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vé thường");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, -1, 25));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Thường");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 680, -1, 25));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TỔNG KẾT VÉ THEO THÁNG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 410, 50));

        jButton4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/back_18.png"))); // NOI18N
        jButton4.setText("Quay về");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, 130, 40));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("HS/SV");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 680, -1, 25));

        N_Thang.setMinimumSize(new java.awt.Dimension(30, 20));
        N_Thang.setPreferredSize(new java.awt.Dimension(30, 20));
        jPanel1.add(N_Thang, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 50, 25));

        N_Nam.setMinimumSize(new java.awt.Dimension(30, 20));
        N_Nam.setPreferredSize(new java.awt.Dimension(30, 20));
        N_Nam.setValue(1);
        jPanel1.add(N_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 60, 25));

        T_SL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày", "Số lượng vé HS/SV", "Số tiền vé HS/SV", "Số lượng vé Thường", "Số tiền vé Thường", "Tổng kết số lượng vé", "Tổng kết số tiền vé"
            }
        ));
        jScrollPane2.setViewportView(T_SL);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 1200, 530));

        TKA.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TKA.setForeground(new java.awt.Color(113, 225, 237));
        jPanel1.add(TKA, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 680, 50, 25));

        SLSV.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SLSV.setForeground(new java.awt.Color(113, 225, 237));
        jPanel1.add(SLSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 680, 40, 25));

        SLT.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SLT.setForeground(new java.awt.Color(113, 225, 237));
        jPanel1.add(SLT, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 680, 30, 25));

        TKA1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        TKA1.setForeground(new java.awt.Color(113, 225, 237));
        TKA1.setText(" ");
        jPanel1.add(TKA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 680, 90, 25));

        SLSV1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SLSV1.setForeground(new java.awt.Color(113, 225, 237));
        SLSV1.setText(" ");
        jPanel1.add(SLSV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 680, 80, 25));

        SLT1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SLT1.setForeground(new java.awt.Color(113, 225, 237));
        SLT1.setText(" ");
        jPanel1.add(SLT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 680, 70, 25));

        jLabel16.setBackground(new java.awt.Color(102, 206, 225));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Do_an/img/bg_form_tkv.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1300, 770));

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        layduLieuSLT();
//        layduLieuTKT();
        hienthongtin();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        TongKetVe tk = new TongKetVe();
        tk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public String laysoluong(String maloai, String ngay) {
        String a = "";
        Connection kn = layKetNoi();
        String sql = "select COUNT(MaVe) from VEXE,CHUYENXE "
                + "where CHUYENXE.MaChuyenXe=VEXE.MaChuyenXe "
                + "and VEXE.MaLoaiVe=? "
                + "and CHUYENXE.NgayChay= ?";

        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maloai);
            ps.setString(2, ngay);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(TongKet.class.getName()).log(Level.SEVERE, null, e);
        }
        return a;
    }

  public void layduLieuSLT() {
        Vector data = new Vector();
        Vector a = new Vector();
        a.add("Ngày");
        a.add("Số Lượng Vé HS/SV");
        a.add("Số Tiền Vé HS/SV");
        a.add("Số Lượng Vé Thường");
        a.add("Số Tiền Vé Thường");
        a.add("Tổng Kết Số Lượng Vé");        
        a.add("Tổng Kết Số Tiền Vé");

        int nam = N_Nam.getValue();
        boolean khongnhuan = true;
        if (nam % 4 == 0 || nam % 400 == 0) {
            khongnhuan = false;
        }
        int thang = N_Thang.getValue();
        int tksl, tkgt;
        String sv = "1";
        String th = "2";
        String ngay;
        int GiaT = laygiave(th);
        int GiaSV = laygiave(sv);



        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            for (int i = 1; i <= 31; i++) {
                ngay = N_Nam.getValue() + "-" + thang + "-" + i;
                tksl = Integer.parseInt(laysoluong(sv, ngay)) + Integer.parseInt(laysoluong(th, ngay));
                tkgt = Integer.parseInt(laysoluong(sv, ngay)) * GiaSV + Integer.parseInt(laysoluong(th, ngay)) * GiaT;
                Vector e = new Vector();
                e.add(i);
                e.add(laysoluong(sv, ngay));
                e.add(Integer.parseInt(laysoluong(sv, ngay)) * GiaSV);
                e.add(laysoluong(th, ngay));
                e.add(Integer.parseInt(laysoluong(th, ngay)) * GiaT);
                e.add(tksl);
                e.add(tkgt);
                data.add(e);


            }
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            for (int i = 1; i <= 30; i++) {
                ngay = N_Nam.getValue() + "-" + thang + "-" + i;
                tksl= Integer.parseInt(laysoluong(sv, ngay)) + Integer.parseInt(laysoluong(th, ngay));
                tkgt = Integer.parseInt(laysoluong(sv, ngay)) * GiaSV + Integer.parseInt(laysoluong(th, ngay)) * GiaT;
                Vector e = new Vector();
                e.add(i);
                e.add(laysoluong(sv, ngay));
                e.add(Integer.parseInt(laysoluong(sv, ngay)) * GiaSV);
                e.add(laysoluong(th, ngay));
                e.add(Integer.parseInt(laysoluong(th, ngay)) * GiaT);
                e.add(tksl);
                e.add(tkgt);
                data.add(e);
            }
        } else if (thang == 2 && khongnhuan) {
            for (int i = 1; i <= 28; i++) {
                ngay = N_Nam.getValue() + "-" + thang + "-" + i;
                tksl= Integer.parseInt(laysoluong(sv, ngay)) + Integer.parseInt(laysoluong(th, ngay));
                tkgt = Integer.parseInt(laysoluong(sv, ngay)) * GiaSV + Integer.parseInt(laysoluong(th, ngay)) * GiaT;
                Vector e = new Vector();
                e.add(i);
                 e.add(laysoluong(sv, ngay));
                e.add(Integer.parseInt(laysoluong(sv, ngay)) * GiaSV);
                e.add(laysoluong(th, ngay));
                e.add(Integer.parseInt(laysoluong(th, ngay)) * GiaT);
                e.add(tksl);
                e.add(tkgt);
                data.add(e);
            }
        } else {
            for (int i = 1; i <= 29; i++) {
                ngay = N_Nam.getValue() + "-" + thang + "-" + i;
                tksl= Integer.parseInt(laysoluong(sv, ngay)) + Integer.parseInt(laysoluong(th, ngay));
                tkgt = Integer.parseInt(laysoluong(sv, ngay)) * GiaSV + Integer.parseInt(laysoluong(th, ngay)) * GiaT;
                Vector e = new Vector();
                e.add(i);
                 e.add(laysoluong(sv, ngay));
                e.add(Integer.parseInt(laysoluong(sv, ngay)) * GiaSV);
                e.add(laysoluong(th, ngay));
                e.add(Integer.parseInt(laysoluong(th, ngay)) * GiaT);
                e.add(tksl);
                e.add(tkgt);
                data.add(e);
            }
        }
        T_SL.setModel(new DefaultTableModel(data, a));
    }
    
    

    public int laygiave(String maloai) {
        int gia = 0;

        Connection kn = layKetNoi();
        String sql = "select giave from LOAIVE where MaLoaiVe=?";

        try {
            PreparedStatement ps = kn.prepareStatement(sql);
            ps.setString(1, maloai);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                gia = rs.getInt(1);
            }
        } catch (SQLException e) {
            Logger.getLogger(TongKet.class.getName()).log(Level.SEVERE, null, e);
        }
        return gia;
    }

    public int laysoluongngThang(String maloai, int thang, int nam) {
        int soluong = 0;
        boolean khongnhuan = true;
        if (nam % 4 == 0 || nam % 400 == 0) {
            khongnhuan = false;
        }

        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            String a[] = new String[40];
            for (int i = 1; i <= 31; i++) {
                a[i - 1] = i + "";
                String ngay = nam + "-" + thang + "-" + a[i - 1];
                soluong = soluong + Integer.parseInt(laysoluong(maloai, ngay));
            }
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            String a[] = new String[40];
            for (int i = 1; i <= 30; i++) {
                a[i - 1] = i + "";
                String ngay = nam + "-" + thang + "-" + a[i - 1];
                soluong = soluong + Integer.parseInt(laysoluong(maloai, ngay));
            }
        } else if (thang == 2 && khongnhuan) {
            String a[] = new String[40];
            for (int i = 1; i <= 28; i++) {
                a[i - 1] = i + "";
                String ngay = nam + "-" + thang + "-" + a[i - 1];
                soluong = soluong + Integer.parseInt(laysoluong(maloai, ngay));
            }
        } else {
            String a[] = new String[40];
            for (int i = 1; i <= 29; i++) {
                a[i - 1] = i + "";
                String ngay = nam + "-" + thang + "-" + a[i - 1];
                soluong = soluong + Integer.parseInt(laysoluong(maloai, ngay));
            }
        }

        return soluong;
    }

    public void hienthongtin() {
        SLSV.setText(laysoluongngThang(sv, N_Thang.getValue(), N_Nam.getValue()) + "");
        int b = laysoluongngThang(sv, N_Thang.getValue(), N_Nam.getValue());

        SLT.setText(laysoluongngThang(th, N_Thang.getValue(), N_Nam.getValue()) + "");
        int c = laysoluongngThang(th, N_Thang.getValue(), N_Nam.getValue());
        TKA.setText(c + b + "");

        SLSV1.setText(laysoluongngThang(sv, N_Thang.getValue(), N_Nam.getValue()) * laygiave(sv) + "");
        SLT1.setText(laysoluongngThang(th, N_Thang.getValue(), N_Nam.getValue()) * laygiave(th) + "");
        TKA1.setText(b * laygiave(sv) + c * laygiave(th) + "");

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
            java.util.logging.Logger.getLogger(TongKet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TongKet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TongKet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TongKet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TongKet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.components.JSpinField N_Nam;
    private com.toedter.components.JSpinField N_Thang;
    private javax.swing.JLabel SLSV;
    private javax.swing.JLabel SLSV1;
    private javax.swing.JLabel SLT;
    private javax.swing.JLabel SLT1;
    private javax.swing.JLabel TKA;
    private javax.swing.JLabel TKA1;
    private javax.swing.JTable T_SL;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
