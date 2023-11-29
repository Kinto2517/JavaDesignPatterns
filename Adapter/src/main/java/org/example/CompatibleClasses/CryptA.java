package org.example.CompatibleClasses;

import org.example.Interface.Crypt;

public class CryptA implements Crypt {

    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message with CryptA");
    }

    @Override
    public void decrypt(String message) {
        System.out.println("Decrypting message with CryptA");
    }
}
