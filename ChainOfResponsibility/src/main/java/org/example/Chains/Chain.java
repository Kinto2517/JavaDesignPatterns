package org.example.Chains;

import org.example.Numbers;

public interface Chain {

    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);

}
