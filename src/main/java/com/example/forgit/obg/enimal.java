package com.example.forgit.obg;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class enimal {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    int age;

    String name;
    String type;
}
