package com.floatme.floatme.controllers;

import com.floatme.floatme.models.Person;
import com.floatme.floatme.repositories.PersonRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PersonController {

    private final PersonRepo personDao;

    public PersonController(PersonRepo personDao) {
        this.personDao = personDao;
    }

    @GetMapping("/people.json")
    public @ResponseBody List<Person> viewAllPeopleInJSONFormat() {
        return personDao.findAll();
    }

}
