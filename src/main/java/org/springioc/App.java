package org.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cnt = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student) cnt.getBean("student1");

        Student s1 = (Student) cnt.getBean("student2");

        System.out.println(s);
        System.out.println(s1);
    }
}
