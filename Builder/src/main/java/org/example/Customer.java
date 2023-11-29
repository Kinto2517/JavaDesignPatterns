package org.example;

import org.example.Builder.StarbucksBuilder;
import org.example.ConcreteBuilder.CoffeeBuilder;
import org.example.ConcreteBuilder.TeaBuilder;

public class Customer {
    public static void main(String[] args) {

        Waiter waiter = new Waiter();

        StarbucksBuilder coffeBuilder = new CoffeeBuilder();
        StarbucksBuilder teaBuilder = new TeaBuilder();

        waiter.setStarbucksBuilder(coffeBuilder);
        waiter.constructStarbucks();
        Product product = waiter.getProduct();
        System.out.println(product.toString());

        waiter.setStarbucksBuilder(teaBuilder);
        waiter.constructStarbucks();
        product = waiter.getProduct();
        System.out.println(product.toString());

    }
}
