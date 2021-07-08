package com.floatme.floatme.controllers;

import com.floatme.floatme.repositories.PersonRepo;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {

    private final PersonRepo personDao;

    public PersonController(PersonRepo personDao) {
        this.personDao = personDao;
    }
}
