package com.SpringbootRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.Entity.UniversityApp;

public interface UniversityAppRepository extends JpaRepository<UniversityApp,Integer> {
      UniversityApp findByName(String name);
      
}
