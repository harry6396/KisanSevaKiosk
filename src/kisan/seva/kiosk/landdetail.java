/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisan.seva.kiosk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabhat
 */
public class landdetail extends javax.swing.JFrame {
    String a1[]=new String[9];
    String a2[]=new String[8];
    String a3[]=new String[8];
    String a4[]=new String[3];
    /**
     * Creates new form landdetail
     */
    public landdetail() {
        initComponents();
        setExtendedState(profile.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }
     public landdetail(String a[],String b[],String c[]) {
        initComponents();
        setExtendedState(profile.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        a1=a;
        a2=b;
        a3=c;
   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t5 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        jLabel5.setText("LAND DETAIL");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel6.setText("REGISTRATION NUMBER");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 200, -1));

        jLabel7.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel7.setText("OWNER");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel8.setText("AREA(IN ACRES)");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 110, -1));
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 200, -1));

        jLabel9.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel9.setText("SOIL TEST");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 200, -1));

        jLabel10.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel10.setText("DOCUMENTS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jButton1.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton1.setText("UPLOAD");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel11.setText("NAME OF THE LAND NOMINEES");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, -1, -1));

        t5.setColumns(20);
        t5.setRows(5);
        jScrollPane1.setViewportView(t5);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 250, 110));

        jLabel12.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel12.setText("ANY LAND DISPUTE");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel13.setText("(any police/court case)");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        jButton2.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton2.setText("UPLOAD");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        jLabel14.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel14.setText("ph VALUE");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 200, -1));

        jButton3.setText("SAVE AND CONTINUE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1220, 590));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/Header.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 120));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //int e1;
        String e2;
        a4[0]=t1.getText();
        //e1=Integer.parseInt(t4.getText());
        e2= t3.getText();
        a4[1]=t2.getText();
        a4[2]=t5.getText();
        String b;
        try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://kisanseva.c8qvdaiyevh5.us-east-2.rds.amazonaws.com/kisansevakiosk", "harry6396", "prabhat1");
           Statement stmt=con.createStatement();
           b="insert into reg4 values('"+a4[0]+"','"+a4[1]+"','"+e2+"','"+a4[2]+"','"+a2[0]+"');";
           stmt.executeUpdate(b);
           JOptionPane.showMessageDialog(null, "Data is saved successfully");
           
           new lastdetail(a1,a2,a3,a4).setVisible(true);
           this.setVisible(false);
       }
       catch(Exception e)
       {
           
       }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(landdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new landdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextArea t5;
    // End of variables declaration//GEN-END:variables
}
