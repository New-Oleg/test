package com.example.forgit.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.forgit.obg.enimal;

@Repository
public interface animalRepos extends JpaRepository<enimal, Integer>{
}
