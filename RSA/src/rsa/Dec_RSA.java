/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rsa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 *
 * @author DzurTrwgn
 */
public class Dec_RSA {
    
    
    public static void main(String[] args) throws Exception{
        // doc van ban da  ma hoa
        BufferedReader in = new BufferedReader(new InputStreamReader(
            new FileInputStream("D:\\Enc_RSA.dat")));
        String ctext = in.readLine();
        //chuyen sang kieu biginteger
        BigInteger c = new BigInteger(ctext);
        
       
        //doc khoa private key
        
        FileInputStream f = new FileInputStream("D:\\Skey_RSA_priv.dat");
       
        
        // use ham readObject cua ObjectOutputStream
        // de doc data tu tap tin nhi phan len
        // thu tu doc can dam bao dung thu tu ghi
        
        ObjectInputStream b = new ObjectInputStream(f);
        
        RSAPrivateKey prk = (RSAPrivateKey)b.readObject();
        BigInteger d = prk.getPrivateExponent();
        BigInteger n = prk.getModulus();
        System.out.println("d= " +d);
        System.out.println("n= " +n);
        BigInteger m = c.modPow(d, n);
        System.out.println("m= " +m);
        byte[] mt  = m.toByteArray();
     
  
        System.out.println("Plain Text is: ");
        for (int i = 0; i < mt.length; i++ )
        {
            System.out.println((char) mt[i]);
        }
       
        
        
    }
    
}
