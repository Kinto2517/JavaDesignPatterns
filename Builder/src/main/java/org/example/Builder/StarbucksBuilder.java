package org.example.Builder;

import org.example.Product;

public abstract class StarbucksBuilder {

    protected Product product;

    public Product getProduct() {
        return product;
    }

    public void createNewProduct() {
        product = new Product();
        System.out.println("A new product is created.");
    }

    public abstract void buildSize();
    public abstract void buildDrink();


}

