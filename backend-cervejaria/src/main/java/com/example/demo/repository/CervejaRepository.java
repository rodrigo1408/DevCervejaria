package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 
import com.example.demo.models.Cervejaria;

public interface CervejaRepository extends JpaRepository<Cervejaria, String>{	
	Cervejaria findById(Long id);
}
