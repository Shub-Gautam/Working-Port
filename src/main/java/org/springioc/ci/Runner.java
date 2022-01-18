package org.springioc.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ConfigFiles/configci.xml");
        Person p = (Person) ac.getBean("person");
        System.out.println(p);
    }
}
