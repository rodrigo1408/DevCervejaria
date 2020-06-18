package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.custom.LocalDAOCustom;
import com.example.demo.models.Localidade;

public interface LocalRepository extends CrudRepository<Localidade, Long>, LocalDAOCustom{	

}
