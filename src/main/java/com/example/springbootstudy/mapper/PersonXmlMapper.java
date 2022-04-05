package com.example.springbootstudy.mapper;

import com.example.springbootstudy.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonXmlMapper {

    public List<Person> findAll();
}
