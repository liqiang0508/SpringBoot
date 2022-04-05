package com.example.springbootstudy.mapper;

import com.example.springbootstudy.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PersonMapper {
    @Select("select * from person")
    public List<Person> findAll();
}
