package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static  void  main(String[] args){
        //HelloWorld helloworld = new HelloWorld();
       // helloworld.setName("right here");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从IOC容器中获取bean实例
        HelloWorld helloworld=(HelloWorld) ctx.getBean("helloworld1");
        //HelloWorld helloworld = ctx.getBean(HelloWorld.class);
        helloworld.hello();
        Car car =ctx.getBean(Car.class);
        System.out.println(car);
    }
}

