package com.floatme.floatme.controllers;

import com.floatme.floatme.models.Job;
import com.floatme.floatme.repositories.JobRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobController {

    private final JobRepo jobDao;

    public JobController(JobRepo jobDao) {
        this.jobDao = jobDao;
    }

    @GetMapping("/jobs.json")
    public @ResponseBody List<Job> viewAllJobsInJSONFormat() {
        return jobDao.findAll();
    }

    @GetMapping("/jobs/ajax")
    public String viewAllJobsWithAjax(){
        return "/people/home";
    }
}
