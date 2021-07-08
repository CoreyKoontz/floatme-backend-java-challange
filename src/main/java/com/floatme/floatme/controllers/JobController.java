package com.floatme.floatme.controllers;

import com.floatme.floatme.repositories.JobRepo;
import org.springframework.stereotype.Controller;

@Controller
public class JobController {

    private final JobRepo jobDao;

    public JobController(JobRepo jobDao) {
        this.jobDao = jobDao;
    }
}
