package org.example.AdapterPattern;

import org.example.IncompatibleClass.CodeX;
import org.example.Interface.Crypt;

public class CodeXAdapter implements Crypt {

    private CodeX codeX;

    public CodeXAdapter(CodeX codeX) {
        this.codeX = codeX;
    }

    @Override
    public void encrypt(String message) {
        codeX.textToCode(message);
    }

    @Override
    public void decrypt(String message) {
        codeX.codeToText(message);
    }
}
