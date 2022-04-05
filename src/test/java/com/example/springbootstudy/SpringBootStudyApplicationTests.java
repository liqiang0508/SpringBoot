package com.example.springbootstudy;

import com.example.springbootstudy.entity.Person;
import com.example.springbootstudy.mapper.PersonMapper;
import com.example.springbootstudy.mapper.PersonXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootStudyApplicationTests {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private PersonXmlMapper personXMlMapper;

    @Test
    void findAll() {
        List<Person> person =  personMapper.findAll();
        System.out.println(person);
    }

    @Test
    void findAll2() {
        List<Person> person =  personXMlMapper.findAll();
        System.out.println(person);
    }



}
