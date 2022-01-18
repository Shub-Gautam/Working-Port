package org.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springjdbc.dao.StudentDao;
import org.springjdbc.dao.StudentDaoimpl;
import org.springjdbc.entities.Student;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Program Started ............... \n");


        ApplicationContext ac = new ClassPathXmlApplicationContext("ConfigFilesJdbc/config.xml");
//      Saving st as a interface (Parent class)
        StudentDao st = (StudentDao) ac.getBean("studentDaoimpl");

        Student s = new Student();
        s.setId(1);
        s.setName("Shubham");
        s.setAddress("Delhi");

        int result = st.insert(s);

        System.out.println("Number of rows affected " + result);

    }
}
