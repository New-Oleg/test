package com.example.forgit.controler;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.forgit.obg.enimal;
import com.example.forgit.repos.animalRepos;





@RestController
public class controller {
    
    private animalRepos ar;

    @GetMapping("/get")
    public List<enimal> getMethodName() {
            return ar.findAll();
    }
    
    @PostMapping("/post")
    public String postMethodName(@RequestBody enimal entity) {
        
        enimal e = entity;
        return e.toString() + " - сохранен";
    }

}
