package com.example.Learnjpa.jpa;

import com.example.Learnjpa.courses.coursesjpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class coursesJpaRepo {

    @Autowired
    private EntityManager entityManager;

    public void insert(coursesjpa coursesjpa){
        entityManager.merge(coursesjpa);
    }

    public void delete(int id){
        coursesjpa cj = entityManager.find(coursesjpa.class,id);
        entityManager.remove(cj);
    }

    public coursesjpa findbyId(int id){
      return entityManager.find(coursesjpa.class,id);
    }


}

