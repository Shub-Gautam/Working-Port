package org.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springjdbc.entities.Student;

public class StudentDaoimpl implements StudentDao {

    private JdbcTemplate jdbcTemplate ;

    @Override
    public int insert(Student student) {
        String query = "INSERT INTO student values (?,?,?)";
        int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
        return result ;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
