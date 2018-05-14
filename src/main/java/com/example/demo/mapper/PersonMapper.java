package com.example.demo.mapper;

import com.example.demo.domain.Person;

import java.util.List;

/**
 * Created by enHui.Chen on 2018/5/14.
 */
public interface PersonMapper  {
    List<Person> selectAll();
}
