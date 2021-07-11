package com.floatme.floatme.controllers;

import com.floatme.floatme.models.Job;
import com.floatme.floatme.models.Person;
import com.floatme.floatme.repositories.JobRepo;
import com.floatme.floatme.repositories.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

@Controller
public class PersonController {

    private final PersonRepo personDao;
    private final JobRepo jobDao;


    public PersonController(PersonRepo personDao, JobRepo jobDao) {
        this.personDao = personDao;
        this.jobDao = jobDao;
    }

    @GetMapping("/people.json")
    public @ResponseBody List<Person> viewAllPeopleInJSONFormat() {
        return personDao.findAll();
    }

    @GetMapping("/people/ajax")
    public String viewAllPeopleWithAjax(){
        return "/people/home";
    }

    // ---------------------------------------------- CREATE:

    @GetMapping("/person/create")
    public String createPersonForm(Model model) {
//        model.addAttribute("post", new Post()); // added this for form model binding
        model.addAttribute("person", new Person());
        return "person/create";
    }

    // Most user form model binding for this to work
    @PostMapping("/person/create")
    public String createPerson(@ModelAttribute Person person) {
        personDao.save(person);
        HashSet<Integer> socks = new HashSet<>();
        return "redirect:/";
    }

    // ---------------------------------------------- DELETE:
    // trying to delete from the floatme.js but having issues with referencing
    @PostMapping("/person/{id}/delete")
    public String deletePerson(@PathVariable("id") Long id) {
        System.out.println("TEST TEST TEST" + id);
//        personDao.deleteById(id);
        return "redirect:/";
    }

    // ---------------------------------------------- Update:

    @GetMapping("person/{id}/edit")
    public String edit(@PathVariable("id") long id, Model model) {
        Person personToEdit = personDao.getById(id);
        List<Job> jobList = jobDao.findAll();
        model.addAttribute("person", personToEdit);
        model.addAttribute("jobList", jobList);
        return "people/edit";
    }

    @PostMapping("/person/{id}/edit")
    public String saveEdit(@ModelAttribute Person personToEdit){
//        System.out.println(personToEdit.getDateJoined());
        personToEdit.setDateJoined(personToEdit.getDateJoined().toString());
        personToEdit.setDateUpdated(dateFormatter(new Date()));
        personDao.save(personToEdit);
        return "redirect:/";
    }

    public String dateFormatter(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
        return dateFormat.format(date);
    }
}
