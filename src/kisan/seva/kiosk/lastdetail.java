/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisan.seva.kiosk;

/**
 *
 * @author Prabhat
 */
public class lastdetail extends javax.swing.JFrame {
    String a1[]=new String[9];
    String a2[]=new String[8];
    String a3[]=new String[8];
    String a4[]=new String[5];
    /**
     * Creates new form lastdetail
     */
    public lastdetail() {
        initComponents();
        setExtendedState(profile.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }
    public lastdetail(String a[],String b[],String c[],String d[]) {
        initComponents();
        setExtendedState(profile.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        int i;
        a1=a;
        a2=b;
        a3=c;
        a4=d;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("KISAN SEVA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Malayalam MN", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KIOSK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/Screen Shot 2017-08-05 at 11.06.26 PM.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 300, 790));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 760));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        jLabel4.setText("KISAN SEVA KIOSK");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 860, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel5.setText("PHOTO");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton1.setText("UPLOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 170, 140));

        jLabel7.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel7.setText("SIGNATURE");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 200, 90));

        jButton2.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton2.setText("READY");
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jButton3.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton3.setText("BROWSE");
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jButton4.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton4.setText("UPLOAD");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel9.setText("THUMB IMPRESSION");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, -1));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 90, 100));

        jLabel11.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel11.setText("LEFT THUMB");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 90, 100));

        jLabel13.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel13.setText("RIGHT THUMB");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        jButton5.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton5.setText("UPLOAD");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 90, -1));

        jButton6.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton6.setText("UPLOAD");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        jButton7.setText("SAVE AND CONTINUE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/Screen Shot 2017-08-06 at 2.34.34 AM.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 860, 670));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 860, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new finalsubmission(a1,a2,a3,a4).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(lastdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lastdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lastdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lastdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lastdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
