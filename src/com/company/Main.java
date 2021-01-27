package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Backpack> backpack1 = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            backpack1.add(new Apple("Apple"));
        }
        backpack1.add(new Book("Book"));
        backpack1.add(new CocaCola("Coca-Cola"));


        ArrayList<Backpack> backpack2 = new ArrayList<>();

        for (int i = 0; i < 50; i++){
            backpack2.add(new TennisBall("Tennis Ball"));
        }
        backpack2.add(new Folder("Folder"));
        backpack2.add(new BottleOfWater("Bottle of water"));

        ArrayList<Backpack> backpack3 = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            backpack3.add(new Apple("Apple"));
        }
        for (int i = 0; i < 3;i++){
            backpack3.add(new TennisBall("TennisBall"));
        }
        backpack3.add(new Folder("Folder"));
        backpack3.add(new CocaCola("Coca-Cola"));

        System.out.println(backpack1 + "\n");
        System.out.println(backpack2 + "\n");
        System.out.println(backpack3);
    }
}
