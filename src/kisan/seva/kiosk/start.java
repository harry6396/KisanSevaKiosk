/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisan.seva.kiosk;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Prabhat
 */
public class start extends javax.swing.JFrame {
String a[]=new String[20];
String b[]=new String[30];
int msg;
    /**
     * Creates new form start
     */
    public start() {
        initComponents();
        int i;
        setExtendedState(profile.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        for(i=0;i<20;i++)
            a[i]="i";
    }
    static final String _url = "https://www.smsgatewayhub.com/api/mt/SendSMS?APIKey=SUhZavV4NEaz07ZEuZNk5Q&senderid=DIGLIB&channel=2&DCS=0&flashsms=0&";
    
    static final String charset = "UTF-8";
    private static String buildRequestString(String targetPhoneNo, String message)
    {
    	String query = null;
    	try
    	{
        String [] params = new String [3];
        params[0] = targetPhoneNo;
        params[1] = message;
        params[2] = "default";
        query = String.format("number=%s&text=%s&route=%s",
        URLEncoder.encode(params[0],charset),
        URLEncoder.encode(params[1],charset),
        URLEncoder.encode(params[2],charset)
        );
    	}
    	catch(Exception e){
    		System.out.println(e);
    		
    	}
    return query;
    }
    public static void sendMessage(String reciever, String message)
    {
    	try
    	{
        URLConnection connection = new URL(_url + buildRequestString(reciever,message)).openConnection();
        InputStream response = connection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(response));
    	}
    	catch(Exception e)
    	{
    	}
    	
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
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lao Sangam MN", 0, 14)); // NOI18N
        jLabel1.setText("ADHAR ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 220, 30));

        jButton1.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lao Sangam MN", 0, 14)); // NOI18N
        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 20));
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 220, 30));

        jLabel3.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jLabel3.setText("OR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 20, 20));

        jLabel5.setFont(new java.awt.Font("Lao Sangam MN", 0, 14)); // NOI18N
        jLabel5.setText("THUMB IMPRESSION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, 20));

        jButton3.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 100, 30));

        jButton2.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton2.setText("SCAN");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/Header.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1480, 120));

        jButton4.setFont(new java.awt.Font("Lao Sangam MN", 0, 13)); // NOI18N
        jButton4.setText("REGISTER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 100, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/rsz_1rsz_1rsz_61972.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 50, -1));

        jButton5.setText("OTP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new register().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int a3=0,i;
        a[3]=new String(t2.getPassword());
        for(i=0;i<a[3].length();i++)
            a3=a3*10+a[3].charAt(i)-48;
        if(a3==msg){
           String b1;
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://kisanseva.c8qvdaiyevh5.us-east-2.rds.amazonaws.com/kisansevakiosk", "harry6396", "prabhat1");
           Statement stmt=con.createStatement();
           ResultSet rst=null;
           b1="select fname,mars,cat,pno,address,state,dist,vill,pincode from reg1 where pno='"+a[2]+"';";
           rst=stmt.executeQuery(b1);
           while(rst.next())
           {
               b[0]=rst.getString(1);
               b[1]=rst.getString(2);
               b[2]=rst.getString(3);
               b[3]=rst.getString(4);
               b[4]=rst.getString(5);
               b[5]=rst.getString(6);
               b[6]=rst.getString(7);
               b[7]=rst.getString(8);
               b[8]=a[0];
           }
           b1="select acc,nob,branchname,IFSC,pan,voter,lpg from reg2 where ano='"+a[0]+"';";
           rst=stmt.executeQuery(b1);
           while(rst.next()){
               b[9]=rst.getString(1);
               b[10]=rst.getString(2);
               b[11]=rst.getString(3);
               b[12]=rst.getString(4);
               b[13]=rst.getString(5);
               b[14]=rst.getString(6);
               b[15]=rst.getString(7);
           }
           b1="select whname,familymemebers,boy,girl,Nominee,ano,relationtype,education from reg3 where ano1='"+a[0]+"';";
           rst=stmt.executeQuery(b1);
           while(rst.next())
           {
               b[16]=rst.getString(1);
               b[17]=rst.getString(2);
               b[18]=rst.getString(3);
               b[19]=rst.getString(4);
               b[20]=rst.getString(5);
               b[21]=rst.getString(6);
               b[22]=rst.getString(7);
               b[23]=rst.getString(8);
               
           }
           b1="select owner,regnumber,area,phvalue,Nominee from reg4 where ano1='"+a[0]+"';";
           rst=stmt.executeQuery(b1);
           while(rst.next())
           {
               b[24]=rst.getString(1);
               b[25]=rst.getString(2);
               b[26]=rst.getString(3);
               b[27]=rst.getString(4);
               b[28]=rst.getString(5);
           }
       }
       catch(Exception e){}
        new profile(a,b).setVisible(true);
        this.setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(null, "Enter correct password");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new mainpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       a[0]=t1.getText();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://kisanseva.c8qvdaiyevh5.us-east-2.rds.amazonaws.com/kisansevakiosk", "harry6396", "prabhat1");
            Statement stmt=con.createStatement();
            ResultSet rst=null;
                 a[1]="select pno from login where ano='"+a[0]+"';";
                 rst=stmt.executeQuery(a[1]);
                 if(rst.next()){
                     a[2]=rst.getString(1);
                 JOptionPane.showMessageDialog(null,"Valid Aadhar ID");
                 }
                 else
                 JOptionPane.showMessageDialog(null,"Not a Valid Aadhar ID");   
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Random rn = new Random();
        msg=rn.nextInt((1000000));
        System.out.println(msg);
        String a1="Your OTP is "+msg+". Do not share your OTP with anyone.";
        try
    	{
	        String testPhoneNo ="91"+a[2];          
	        String testMessage=a1;
	        sendMessage(testPhoneNo,testMessage);
    	}
    	catch(Exception e)
    	{
    	}
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
