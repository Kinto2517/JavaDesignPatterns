package org.example;

import org.example.Builder.StarbucksBuilder;

public class Waiter {

    private StarbucksBuilder starbucksBuilder;

    public void setStarbucksBuilder(StarbucksBuilder builder) {
        starbucksBuilder = builder;
    }

    public Product getProduct() {
        return starbucksBuilder.getProduct();
    }

    public void constructStarbucks() {
        starbucksBuilder.createNewProduct();
        starbucksBuilder.buildSize();
        starbucksBuilder.buildDrink();
    }

}
