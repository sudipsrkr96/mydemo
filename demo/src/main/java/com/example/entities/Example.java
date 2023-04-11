package com.example.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Data


@Entity
@Table(name = "regex")
public class Example {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private String email;
    private String phoneNumber;
}
