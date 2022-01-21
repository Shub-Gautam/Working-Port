package org.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springorm.dao.StudentDao;
import org.springorm.entity.Student;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ConfigFilesOrm/config.xml");
        StudentDao s = ac.getBean("studentDao",StudentDao.class);

        Student stu = new Student(1,"Shubham","yoho");

        int result = s.insert(stu);
        System.out.println("Inserted : "+result);
    }
}
