package org.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Program Started ............... \n");
        ApplicationContext ac = new ClassPathXmlApplicationContext("ConfigFilesJdbc/config.xml");

        JdbcTemplate temp = (JdbcTemplate) ac.getBean("jdbcTemplate");

//      Query using argumnts
        String query = "INSERT INTO student values (?,?,?)";
        int result = temp.update(query,1,"Shubham Gautam","Delhi");

//      Query using manual string
        String query1 = "INSERT INTO student values (2,\"Aditya\",\"Amroha\")";
        int res = temp.update(query1);

        System.out.println("Number of rows affected " + result+" "+res);

    }
}
