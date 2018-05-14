package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.mapper.PersonMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

import java.util.List;

/**
 * Created by enHui.Chen on 2018/5/14.
 */
@Service
@Slf4j
public class PersonService {

    @Autowired
    private PersonMapper personMapper;
    public List<Person> selectAll(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<Person> people = personMapper.selectAll();
        stopWatch.stop();

        return people;
    }
}
