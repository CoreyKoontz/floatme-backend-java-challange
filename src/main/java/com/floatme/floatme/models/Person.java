package com.floatme.floatme.models;

import com.mysql.cj.protocol.ColumnDefinition;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (columnDefinition = "INT UNSIGNED") // No
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private byte age;

    @Column(nullable = false)
    private String dateJoined;

    @Column(nullable = false)
    private String dateUpdated;

    @OneToOne
    private Job job;


    public Person() {
    }

    public Person(long id, String name, byte age, String dateJoined, String dateUpdated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateJoined = dateJoined;
        this.dateUpdated = dateUpdated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
}
