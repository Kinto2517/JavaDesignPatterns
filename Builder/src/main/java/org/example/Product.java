package org.example;

public class Product {

    private String size;
    private String drink;

    public void setSize(String size) {
        this.size = size;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Product{" +
                "size='" + size + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
