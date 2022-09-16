/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rsa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 *
 * @author DzurTrwgn
 */
public class RSA_Form extends javax.swing.JFrame {

    /**
     * Creates new form RSA_Form
     */
    public RSA_Form() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPlainText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCipherText = new javax.swing.JTextField();
        btnEnc = new javax.swing.JButton();
        btnDec = new javax.swing.JButton();
        btnCreateKey = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText(" RSA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("PlainText:");

        txtKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeyActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Key:");

        txtPlainText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlainTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Cipher Text:");

        txtCipherText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCipherTextActionPerformed(evt);
            }
        });

        btnEnc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnc.setText("Encryption");
        btnEnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncActionPerformed(evt);
            }
        });

        btnDec.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDec.setText("Decryption");
        btnDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecActionPerformed(evt);
            }
        });

        btnCreateKey.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnCreateKey.setText("Create Key");
        btnCreateKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateKeyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addComponent(txtCipherText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPlainText, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreateKey)
                .addGap(28, 28, 28)
                .addComponent(btnEnc)
                .addGap(18, 18, 18)
                .addComponent(btnDec)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(txtPlainText, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCipherText, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnc)
                    .addComponent(btnDec)
                    .addComponent(btnCreateKey))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeyActionPerformed

    private void txtPlainTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlainTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlainTextActionPerformed

    private void txtCipherTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCipherTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCipherTextActionPerformed

    private void btnEncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncActionPerformed
        // TODO add your handling code here:
        try {
            String s=txtPlainText.getText();
            FileInputStream f=new FileInputStream("D:\\Skey_RSA_pub.dat");
            ObjectInputStream b=new ObjectInputStream(f);
            RSAPublicKey pbk=(RSAPublicKey)b.readObject();
            BigInteger e=pbk.getPublicExponent();
            BigInteger n=pbk.getModulus();
            System.out.println("e= "+e);
            System.out.println("n= "+n);
            byte ptext[]=s.getBytes();
            BigInteger m =new BigInteger(ptext);
            BigInteger c=m.modPow(e, n);
            System.out.println("c= "+c);
            String cs= c.toString();
            BufferedWriter out= new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Enc_RSA.dat")));
            out.write(cs,0,cs.length());
            out.close();
            txtCipherText.setText(cs);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEncActionPerformed

    private void btnDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecActionPerformed
        // TODO add your handling code here:
         try {
            BufferedReader in =new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Enc_RSA.dat")));
            String ctext=txtCipherText.getText();
            BigInteger c=new BigInteger(ctext);
            FileInputStream f=new FileInputStream("D:\\Skey_RSA_priv.dat");
            ObjectInputStream b= new ObjectInputStream(f);
            RSAPrivateKey prk=(RSAPrivateKey)b.readObject();
            BigInteger d=prk.getPrivateExponent();
            BigInteger n=prk.getModulus();
            System.out.println("d= "+d);
            System.out.println("n= "+n);
            BigInteger m=c.modPow(d, n);
            System.out.println("m= "+m);
            byte[]  mt=m.toByteArray();
            String r = new String(mt, StandardCharsets.UTF_8);
            System.out.println("PlainText is ");
            for(int i=0;i<mt.length;i++){
                txtPlainText.setText(r);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnDecActionPerformed

    private void btnCreateKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateKeyActionPerformed
        // TODO add your handling code here:
        try {
            KeyPairGenerator kpg=KeyPairGenerator.getInstance("RSA");
            kpg.initialize(1024);
            KeyPair kp=kpg.genKeyPair();
            PublicKey pbkey=kp.getPublic();
            PrivateKey prkey=kp.getPrivate();
            FileOutputStream f1=new FileOutputStream("D:\\Skey_RSA_pub.dat");
            ObjectOutputStream b1=new ObjectOutputStream(f1);
            b1.writeObject(pbkey);
            FileOutputStream f2=new FileOutputStream("D:\\Skey_RSA_priv.dat");
            ObjectOutputStream b2=new ObjectOutputStream(f2);
            b2.writeObject(prkey);
            txtKey.setText(pbkey.toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnCreateKeyActionPerformed

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
            java.util.logging.Logger.getLogger(RSA_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RSA_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RSA_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RSA_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RSA_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateKey;
    private javax.swing.JButton btnDec;
    private javax.swing.JButton btnEnc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCipherText;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtPlainText;
    // End of variables declaration//GEN-END:variables
}