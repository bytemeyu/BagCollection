package com.bytemeyu.bagcollection;

import com.bytemeyu.bagcollection.bag.Bag;

public class BagCollection {
    public static void main(String[] args) {
        Bag bag1 = new Bag("Catarina Mina", "palha", 5);
        bag1.currentStatus();
        bag1.displayItems();
        bag1.addItem("carteira");
        bag1.addItem("celular");
        bag1.currentStatus();
        bag1.displayItems();
        bag1.removeItem("chaves");
        bag1.currentStatus();
        bag1.displayItems();
        bag1.removeItem("carteira");
        bag1.currentStatus();
        bag1.displayItems();
        bag1.addItem("carteira");
        bag1.addItem("chaves");
        bag1.addItem("alcool em gel");
        bag1.addItem("fones de ouvido");
        bag1.currentStatus();
        bag1.addItem("lip mousse");
        bag1.currentStatus();
        bag1.displayItems();
        bag1.removeItem("fones de ouvido");
        bag1.displayItems();
        bag1.addItem("lip mousse");
        bag1.displayItems();
        bag1.currentStatus();
    }
}
