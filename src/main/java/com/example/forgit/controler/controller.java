package com.example.forgit.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.forgit.obg.enimal;
import com.example.forgit.repos.animalRepos;






@RestController
public class controller {
    
    @Autowired
    private animalRepos ar;
    

    @GetMapping("/get")
    public List<enimal> getMethodName() {
             return ar.findAll();
           
    }
    
    @PostMapping("/post")
    public ResponseEntity<enimal> postMethodName(@RequestBody enimal entity) {
        
        enimal e = ar.save(entity);
        return ResponseEntity.ok(e);
    }

    @DeleteMapping("/del/{id}")
    public void  delit(@PathVariable Integer id) {
        
        ar.deleteById(id);
    }
    
  @PutMapping("/{id}")
public ResponseEntity<enimal> updateEnimal(@PathVariable int id, @RequestBody enimal updatedAnimal) {
    enimal animal = ar.findById(id).orElse(null);
    
    if(animal == null) {
        return ResponseEntity.notFound().build();
    }
    
    animal.setAge(updatedAnimal.getAge());
    animal.setName(updatedAnimal.getName());
    animal.setType(updatedAnimal.getType());
    
    enimal updated = ar.save(animal);
    return ResponseEntity.ok(updated);
}

}


