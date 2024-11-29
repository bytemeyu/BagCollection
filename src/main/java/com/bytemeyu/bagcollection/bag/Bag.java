package com.bytemeyu.bagcollection.bag;

import java.util.ArrayList;

public class Bag implements BagInterface {

    private String brand;
    private String color;
    private int capacityItems;
    private ArrayList<String> items;

    public Bag(String brand, String color, int capacityItems) {
        this.brand = brand;
        this.color = color;
        this.capacityItems = capacityItems;

        this.items = new ArrayList<>(capacityItems);
    }

    public void currentStatus() {
        System.out.println("_____________");
        System.out.println(this.getBrand());
        System.out.println(this.getColor());
        System.out.println(this.getCapacityItems());
        System.out.println(this.getItems());
        System.out.println("_________");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacityItems() {
        return capacityItems;
    }

    public void setCapacityItems(int capacityItems) {
        this.capacityItems = capacityItems;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean addItem(String item) {
        if(this.getItems().size() >= this.getCapacityItems()) {
            System.out.println("Your bag is full! Maximum capacity is " + this.getCapacityItems() + " items.");
            return false;
        } else {
            this.getItems().add(item);
            System.out.println("You add " + item + " to your bag.");
            return true;
        }
    }

    @Override
    public boolean removeItem(String item) {
        if(!this.getItems().contains(item)){
            System.out.println(item + " not found.");
            return false;
        } else {
            this.items.remove(item);
            System.out.println(item + " was removed.");
            return true;
        }
    }

    @Override
    public ArrayList displayItems() {
        if(this.getItems().size() <= 0){
            System.out.println("There are no items in your bag!");
        } else {
            System.out.print("The items in your bag are: ");
            for(int c = 0; c < this.items.size(); c++){
                if(c == this.items.size() - 1) {
                    System.out.println(this.items.get(c) + ".");
                } else {
                    System.out.print(this.items.get(c) + ", ");
                }

            }
        }

        return this.getItems();
    }
}
