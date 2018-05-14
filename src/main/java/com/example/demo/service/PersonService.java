package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by enHui.Chen on 2018/5/14.
 */
@Service
public class PersonService {
    @Autowired
    private PersonMapper personMapper;
    public List<Person> selectAll(){
        return personMapper.selectAll();
    }
}
