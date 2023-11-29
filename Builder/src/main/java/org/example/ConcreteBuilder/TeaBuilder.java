package org.example.ConcreteBuilder;

import org.example.Builder.StarbucksBuilder;

public class TeaBuilder extends StarbucksBuilder {
    @Override
    public void buildSize() {
        product.setSize("large");
        System.out.println("build large size");
    }

    @Override
    public void buildDrink() {
        product.setDrink("tea");
        System.out.println("build tea");
    }
}
