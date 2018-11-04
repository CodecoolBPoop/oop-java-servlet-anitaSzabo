package com.codecool.servlet;


import java.util.ArrayList;
import java.util.List;

public class Itemstore {
    public static List<Item> itemList = new ArrayList<>();

    public static void add(String id) {
        itemList.add(itemList.get(Integer.valueOf(id)));
        System.out.println("LÓFASZ1000000");
        System.out.println(itemList);

    }
    public static void remove(String id) {
        itemList.remove(itemList.get(Integer.valueOf(id)));
    }
}