package com.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1.创建spring的IOC容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-autowire.xml");
        //2.从IOC容器中获取bean实例
        Person person =(Person)ctx.getBean("person");
        System.out.println(person);
    }
}
