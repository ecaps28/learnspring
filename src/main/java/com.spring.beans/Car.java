package com.spring.beans;

public class Car {
    private String brand;
    private String corp;
    private int price;
    private int maxspeed;

    public Car(String brand,String corp,int price){
        super();
        this.brand=brand;
        this.corp=corp;
        this.price=price;
    }
    public String toString(){
        return "Car [brand="+brand+",corp="+corp+",price="+price+"]";
    }
}
