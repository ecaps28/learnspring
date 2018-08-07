package com.spring.beans;

public class HelloWorld {
    private String name;
    public void setName(String name){
        System.out.println("setName"+name);
        this.name=name;
    }
    public void hello(){
        System.out.println("Hello:"+ name);
        System.out.println("Aha!:"+ name);
    }
    public HelloWorld(){
        System.out.println("HelloWorld'constructor");
    }
}
