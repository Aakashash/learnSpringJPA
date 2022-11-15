package com.example.Learnjpa.springdatajpa;

import com.example.Learnjpa.courses.coursesjpa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface coursesspringdatajpaRepo extends JpaRepository<coursesjpa, Integer> {

    List<coursesjpa> findByAuthor(String author);
    List<coursesjpa> findByName(String name);
}
