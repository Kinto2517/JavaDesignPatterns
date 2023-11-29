package org.example;

import org.example.AdapterPattern.CodeXAdapter;
import org.example.CompatibleClasses.CryptA;
import org.example.CompatibleClasses.CryptB;
import org.example.IncompatibleClass.CodeX;
import org.example.Interface.Crypt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Using CryptA");
        Crypt crypt = new CryptA();
        crypt.encrypt("Hello World");
        crypt.decrypt("Hello World");

        System.out.println("Using CryptB");
        crypt = new CryptB();
        crypt.encrypt("Hello World");
        crypt.decrypt("Hello World");

        System.out.println("Using CodeXAdapter");
        crypt = new CodeXAdapter(new CodeX());
        crypt.encrypt("Hello World");
        crypt.decrypt("Hello World");

    }
}
