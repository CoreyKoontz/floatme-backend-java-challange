package com.floatme.floatme.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String jobTitle;

    @Column(nullable = false)
    private int salary;

    @OneToMany(mappedBy = "name")
    @JsonBackReference
    private List<Person> people;

    public Job() {
    }

    public Job(long id, String jobTitle, int salary) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
