package com.example.service;

//import com.glomart.entities.Regex;

import com.example.entities.Dto;

import com.example.entities.Example;
import com.example.exception.IdNotFoundException;
import com.example.repositories.RegularExpressionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegularExpressionServiceImpl implements RegularExpressionService {

    @Autowired
    private RegularExpressionRepository regularExpressionRepository;

    @Override
    public Example saveOneId(Dto regex) {
        Example e = new Example();
        e.setId(regex.getId());
        e.setEmail(regex.getEmail());
        e.setPhoneNumber(regex.getPhoneNumber());
        Example save = regularExpressionRepository.save(e);
        return save;
    }

    @Override
    public Dto getOneId(int id) {
        Optional<Example> byId = regularExpressionRepository.findById(id);
        if (byId.isPresent()) {
            Dto d = new Dto();
            Example example = byId.get();
            d.setId(example.getId());
            d.setEmail(example.getEmail());
            d.setPhoneNumber(example.getPhoneNumber());
            return d;
        } else {
            throw new IdNotFoundException();
        }
    }

    @Override
    public Dto getAllEmp() {
        List<Example> all = regularExpressionRepository.findAll();
        Dto d = new Dto();
        for (Example e : all) {
            d.setId(e.getId());
            d.setEmail(e.getEmail());
            d.setPhoneNumber(e.getPhoneNumber());
        }
        return d;
        }
    }


}
