package com.example.demo.controllers;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by enHui.Chen on 2018/5/14.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<Person> selectAll() {
        return personService.selectAll();
    }

}
