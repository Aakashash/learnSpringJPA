package com.example.Learnjpa;

import com.example.Learnjpa.courses.courses;
import com.example.Learnjpa.courses.coursesjpa;
import com.example.Learnjpa.jpa.coursesJpaRepo;
import com.example.Learnjpa.springdatajpa.coursesspringdatajpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class coursescommandline implements CommandLineRunner {

//    @Autowired
//    private com.example.Learnjpa.jdbc.coursesRepo repository;

//    @Autowired
//    private coursesJpaRepo repository;

    @Autowired
    private coursesspringdatajpaRepo repository;

    @Override
    public void run(String... args) throws Exception {

// this is for spring jdbc

//        repository.insert(new courses(2,"A subtle art","Austin"));
//        repository.insert(new courses(3,"A boogie man","Charlie"));
//        repository.insert(new courses(4,"A Super boy","Ramesh"));

//        coursesRepo.delete(2);
//
//        coursesRepo.findbyId(3);
//       System.out.println(coursesRepo.findbyId(3));

// this is for JPA
//        repository.insert(new coursesjpa(2,"A subtle art","Austin"));
//        repository.insert(new coursesjpa(3,"A boogie man","Charlie"));
//        repository.insert(new coursesjpa(4,"A Super boy","Ramesh"));
//
//        coursesjpa coursesjpa = repository.findbyId(12);
//        System.out.println(coursesjpa);
//
//        repository.delete(12);

// this is for Spring data JPA. We should use the same course JPA and its annotation

        repository.save(new coursesjpa(2,"A subtle art","Austin"));
        repository.save(new coursesjpa(3,"A boogie man","Charlie"));
        repository.save(new coursesjpa(4,"A Super boy","Austin"));
        repository.save(new coursesjpa(5,"Wonder women","Diana"));

        //repository.deleteById(2);
        //repository.findAll();
        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("Austin"));
        System.out.println(repository.findByName("Wonder women"));





    }
}
