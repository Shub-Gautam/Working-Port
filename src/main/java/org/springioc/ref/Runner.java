package org.springioc.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {

        ApplicationContext a = new ClassPathXmlApplicationContext("ConfigFiles/configref.xml");

        A aref = (A) a.getBean("a");
        System.out.println(aref);
    }
}
