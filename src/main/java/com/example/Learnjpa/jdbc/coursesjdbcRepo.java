package com.example.Learnjpa.jdbc;

import com.example.Learnjpa.courses.courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class coursesjdbcRepo {
    @Autowired
    private JdbcTemplate springjdbctemplate;
    private String insert_query =
            """
                    insert into courses(id,name,author)
                    values (?,?,?);
                    """;
    private String delete_query =
            """
                    delete from courses where id=?
                    """;
    private String select_query =
            """
                    select * from courses where id =?;
                    """;

    public void insert(courses courses){
        springjdbctemplate.update(insert_query,courses.getId(),courses.getName(),courses.getAuthor());

    }
    public void delete(int id){
        springjdbctemplate.update(delete_query,id);

    }
    public courses findbyId(int id){

        return springjdbctemplate.queryForObject(select_query,
                new BeanPropertyRowMapper<>(courses.class),id);

    }
}
