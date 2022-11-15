package com.example.Learnjpa.courses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "courses")
public class coursesjpa {

    @Id
    public int id;

    @Column( name = "name")
    public String name;
    public String author;

    public coursesjpa(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public coursesjpa(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "courses{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
