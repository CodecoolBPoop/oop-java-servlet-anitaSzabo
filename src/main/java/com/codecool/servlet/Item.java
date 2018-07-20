package com.codecool.servlet;

public class Item {

    private int id;
    private static int uniqueId = 0;
    private String name;
    private float price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public Item(String name, float price) {
        this.id = uniqueId++;
        this.name = name;
        this.price = price;
    }
}

