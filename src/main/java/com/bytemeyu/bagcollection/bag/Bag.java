package com.bytemeyu.bagcollection.bag;

import java.util.ArrayList;

public class Bag implements BagInterface {

    private String brand;
    private String color;
    private int capacityItens;
    private ArrayList itens;

    public Bag(String brand, String color, int capacityItens) {
        this.brand = brand;
        this.color = color;
        this.capacityItens = capacityItens;

        ArrayList<String> list = new ArrayList<>(capacityItens);
        this.itens = list;
    }

    public void currentStatus() {
        System.out.println("_____________");
        System.out.println(this.getBrand());
        System.out.println(this.getColor());
        System.out.println(this.getCapacityItens());
        System.out.println(this.getItens());
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

    public int getCapacityItens() {
        return capacityItens;
    }

    public void setCapacityItens(int capacityItens) {
        this.capacityItens = capacityItens;
    }

    public ArrayList getItens() {
        return itens;
    }

    public void setItens(ArrayList itens) {
        this.itens = itens;
    }

    @Override
    public boolean addItem(String item) {
        if(this.getItens().size() >= this.getCapacityItens()) {
            System.out.println("Your bag is full, you cannot add itens!");
            return false;
        } else {
            this.getItens().add(item);
            System.out.println("You add " + item + ".");
            return true;
        }
    }

    @Override
    public boolean removeItem(String item) {
        ArrayList itensList = this.getItens();
        if(!itensList.contains(item)){
            System.out.println(item + " not found.");
            return false;
        } else {
            itensList.remove(item);
            this.setItens(itensList);
            System.out.println(item + " was removed.");
            return true;
        }
    }

    @Override
    public ArrayList showItens() {
        if(this.getItens().size() <= 0){
            System.out.println("There are no items in your bag!");
            return null;
        } else {
            ArrayList itensList = this.getItens();
            System.out.print("The items in your bag are: ");
            for(int c = 0; c < itensList.size(); c++){
                if(c == itensList.size() - 1) {
                    System.out.println(itensList.get(c) + ".");
                } else {
                    System.out.print(itensList.get(c) + ", ");
                }

            }
            return this.getItens();
        }
    }
}
