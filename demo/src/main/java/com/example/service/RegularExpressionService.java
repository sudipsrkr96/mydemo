package com.example.service;



import com.example.entities.Dto;
import com.example.entities.Example;


public interface RegularExpressionService {


    public Example saveOneId(Dto regex);

    Dto getOneId(int id);

    Dto getAllEmp();
}
