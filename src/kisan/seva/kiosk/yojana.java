/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisan.seva.kiosk;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author Prabhat
 */
public class yojana extends javax.swing.JFrame {
String a[]=new String[10];

    /**
     * Creates new form yojana
     */
    public yojana() {
        initComponents();
        int i;
        setExtendedState(profile.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        l1.setEditable(false);
        a[0]="Launch of Pradhan Mantri Fasal Bima Yojana";
        a[1]="After green, white, and golden, it’s time for blue";
        a[2]="Government to invest Rs 221 crore to improve milk productivity";
        a[3]="Energy-efficient irrigation to be implemented";
        a[4]="Launch of Paramparagat Krishi Vikas Yojana";
        a[5]="Govt approves short-term crop loans up to Rs 3 lakh at subsidised rate of 4 per cent";
        a[6]="USDA's Farm Service Agency (FSA) provides emergency loans to help farmers and ranchers "+"\n"+"who own or operate a farm/ranch located in a county declared by the President or designated "+"\n"+"by the Secretary of Agriculture as a primary disaster area or quarantine area.";
        a[7]="Farm Storage Facility Loans (FSFL) are provided to encourage the construction of on-farm "+"\n"+"storage and handling facilities for eligible commodities. Eligible commodities include: corn, grain "+"\n"+"sorghum, oats, wheat, barley, rice, soybeans, peanuts, minor oilseeds, lentils, chickpeas,"+"\n"+" dry peas, hay, renewable biomass and cold storage facilities for fruits and vegetables";
        a[8]="Farm Ownership Loans will help you purchase or enlarge a farm or ranch, construct a new or"+"\n"+" improve an existing farm or ranch building, pay closing costs, and pay for soil and water conservation and protection.";
        a[9]="Rural Housing: Farm Labor Housing Loans and Grants";
    for (i = 0; i < 10; i++) {
        l1.append(a[i] + "\n");
        l1.append("------------------------\n\n");
    }
       /* for(i=0;i<5;i++){
l1.append(a[i]);
         DefaultCaret caret = (DefaultCaret)l1.getCaret();
caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        JScrollPane scrollPane = new JScrollPane();
scrollPane.add(l1);
scrollPane.setViewportView(l1);
        }*/

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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        l1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/Header.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 140));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setColumns(20);
        l1.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        l1.setLineWrap(true);
        l1.setRows(5);
        jScrollPane1.setViewportView(l1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 810, 530));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kisan/seva/kiosk/rsz_1rsz_1rsz_1rsz_53567.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 70));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1340, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new mainpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(yojana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yojana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yojana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yojana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yojana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea l1;
    // End of variables declaration//GEN-END:variables
}