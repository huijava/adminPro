package com.java;

public class Product {

    private String name;
    private Long price;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public static void main(String[] args) {
        System.out.println("商品信息");
    }
}
