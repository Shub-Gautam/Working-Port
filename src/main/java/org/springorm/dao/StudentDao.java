package org.springorm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springorm.entity.Student;


public class StudentDao {
    private HibernateTemplate hibernateTemplate ;

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public StudentDao() {
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

//    Working Functions
    @Transactional
    public int insert(Student student){
        int result = (int) hibernateTemplate.save(student);
        return result ;
    }
}
