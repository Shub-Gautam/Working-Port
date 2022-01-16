package org.springioc.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("/ConfigFiles/configemp.xml");
        Emp e = (Emp) ct.getBean("emp1");
        System.out.println(e);

    }
}
