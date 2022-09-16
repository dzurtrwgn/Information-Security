/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rsa;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 *
 * @author DzurTrwgn
 */
public class Skey_RSA {
    public static void main(String[] args) throws Exception{
        ///KeyPairGenerator: giusp tao ra cap Key
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        kpg.initialize(1024);
        // public/private keypairs duoc dung de khpoi tao phase cua 
        //qua trinh dang ky key
        KeyPair kp =kpg.genKeyPair();
        PublicKey pbkey = kp.getPublic();
        PrivateKey prkey = kp.getPrivate();
        //ghi flie public key
        FileOutputStream f1 = new FileOutputStream("D:\\Skey_RSA_pub.dat");
        ObjectOutputStream b1 = new ObjectOutputStream(f1);
        b1.writeObject(pbkey);
        //ghi flie private key
        FileOutputStream f2 = new FileOutputStream("D:\\Skey_RSA_priv.dat");
        ObjectOutputStream b2 = new ObjectOutputStream(f2);
        b2.writeObject(prkey);

    
    
    
    }
    
}
