package com.daonguyen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Beans.xml");
        HelloParent parent = (HelloParent) context.getBean("helloParent");
        parent.getMessage1();
        parent.getMessage2();

        HelloChildren children = (HelloChildren) context.getBean("helloChildren");
        children.getMessage1();
        children.getMessage2();
        children.getMessage3();
    }
}
