/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisan.seva.kiosk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabhat
 */
public class customer extends javax.swing.JFrame {
String a1[]=new String[3];
String a2[]=new String[14];
int msg;
    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
        setExtendedState(profile.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
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
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/Header.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1400, 130));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/rsz_1rsz_user-image-with-black-background_318-34564.jpg"))); // NOI18N
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 116, 170, 170));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 350, 400));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel6.setText("AADHAR ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 120, -1, -1));
        jPanel3.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, -1));

        jLabel7.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel7.setText("PASSWORD");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 30));

        jButton1.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel8.setText("OR");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jButton2.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton2.setText("AUTHENTICATION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        jButton3.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton3.setText("OTP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));
        jPanel3.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 480, 480));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/rsz_1rsz_1rsz_1rsz_53567.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 70, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       new mainpage().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int a3=0,i;
         a1[0]=t1.getText();
        a1[2]=new String(t2.getPassword());
        for(i=0;i<a1[2].length();i++)
            a3=a3*10+a1[2].charAt(i)-48;
         
         String b;
            if(a3==msg){
           try
           {
               System.out.print(a3);
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://kisanseva.c8qvdaiyevh5.us-east-2.rds.amazonaws.com/kisansevakiosk", "harry6396", "prabhat1");
               Statement stmt=con.createStatement();
               ResultSet rst=null;
               b="select fname,pno,ano,email,address,vill,dist,pin from custreg where ano='"+a1[0]+"';";
               rst=stmt.executeQuery(b);
               while(rst.next())
               {
                   a2[0]=rst.getString(1);
                   a2[1]=rst.getString(2);
                   a2[2]=rst.getString(3);
                   a2[3]=rst.getString(4);
                   a2[4]=rst.getString(5);
                   a2[5]=rst.getString(6);
                   a2[6]=rst.getString(7);
                   a2[7]=rst.getString(8);
                   System.out.print(a3);
               }
               b="select ano,owner,area,acchname,nob,nobr,IFSC from custreg1 where ano='"+a1[0]+"';";
               rst=stmt.executeQuery(b);
               while(rst.next())
               {
                   a2[8]=rst.getString(1);
                   a2[9]=rst.getString(2);
                   a2[10]=rst.getString(3);
                   a2[11]=rst.getString(4);
                   a2[12]=rst.getString(5);
                   a2[13]=rst.getString(6);
                   a2[14]=rst.getString(7);
                   System.out.print(a3);
               }
                   for(i=0;i<=14;i++)
                   System.out.println(a2[i]);
                   new custprofile(a2).setVisible(true);
                   this.setVisible(false);
           }
           catch(Exception e)
           {
               System.out.println(e.getMessage());
           }
            }
            else
                JOptionPane.showMessageDialog(null,"OTP is not correct");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a1[0]=t1.getText(); 
           try
           {
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://kisanseva.c47pjqtqhh6h.us-west-1.rds.amazonaws.com/kisanseva","kisan","prabhat1");
               Statement stmt=con.createStatement();
               ResultSet rst=null;
               a1[1]="select pno from custreg where ano='"+a1[0]+"';";
               rst=stmt.executeQuery(a1[1]);
               if(rst.next())
               {
                  JOptionPane.showMessageDialog(null,"ID Registered"); 
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"ID Not Registered");
               }
           }
           catch(Exception e)
           {
               System.out.print(e.getMessage());
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Random rn=new Random();
        msg=rn.nextInt((100000));
        System.out.println(msg);
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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}