package org.example.CompatibleClasses;

import org.example.Interface.Crypt;

public class CryptB implements Crypt {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting message with CryptB");
    }

    @Override
    public void decrypt(String message) {
        System.out.println("Decrypting message with CryptB");
    }
}
