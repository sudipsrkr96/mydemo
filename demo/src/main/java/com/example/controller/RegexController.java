package com.example.controller;


import com.example.entities.Example;
import com.example.service.RegularExpressionService;

import com.example.entities.Dto;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class RegexController {
hello
    hello new world
    @Autowired
    private RegularExpressionService regularExpressionService;

//    @PostMapping("/post")
//    public ResponseEntity<Example> saveOneId(@RequestBody @Valid Dto regex){
//        Example regex1 = regularExpressionService.saveOneId(regex);
//        return new ResponseEntity<>(regex1, HttpStatus.CREATED);
//    }
    @PostMapping("/post")
    public ResponseEntity<Example> saveOneId(@RequestBody @Valid Dto regex) throws Exception{
        try{
            Example regex1 = regularExpressionService.saveOneId(regex);
            return new ResponseEntity<>(regex1, HttpStatus.CREATED);

        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }

    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Dto> getOneId(@PathVariable int id){
        Dto oneId = regularExpressionService.getOneId(id);
        return new ResponseEntity<>(oneId,HttpStatus.FOUND);
    }
    @GetMapping("/all")
    public ResponseEntity<Dto> getAllEmployee(){
        Dto allEmp = regularExpressionService.getAllEmp();
        return new ResponseEntity<>(allEmp,HttpStatus.FOUND);
    }

//    @GetMapping("/get")
//    public ResponseEntity<String> saveOneId() throws Exception{
//     return new ResponseEntity<>("Hii this is my first deployment in aws EC2 instance",HttpStatus.ACCEPTED);
//    }

}
