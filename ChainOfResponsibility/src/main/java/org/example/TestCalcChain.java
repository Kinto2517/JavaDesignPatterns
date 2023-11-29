package org.example;

import org.example.Chains.*;


public class TestCalcChain {
    public static void main(String[] args) {

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubstractNumbers();
        Chain chainCalc3 = new DivideNumbers();
        Chain chainCalc4 = new MultipleNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4, 2, "multiple");

        chainCalc1.calculate(request);

        Numbers request2 = new Numbers(4, 2, "substract");

        chainCalc1.calculate(request2);


    }
}
