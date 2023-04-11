package com.example.repositories;

//import com.glomart.entities.Regex;
import com.example.entities.Dto;
import com.example.entities.Example;
//import com.example.entities.Regex;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegularExpressionRepository extends JpaRepository<Example,Integer> {
}
