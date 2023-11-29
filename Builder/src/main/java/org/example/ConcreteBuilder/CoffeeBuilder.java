package org.example.ConcreteBuilder;

import org.example.Builder.StarbucksBuilder;

public class CoffeeBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        product.setSize("medium");
        System.out.println("build medium size");
    }

    @Override
    public void buildDrink() {
        product.setDrink("coffee");
        System.out.println("build coffee");
    }
}
