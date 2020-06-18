package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Localidade;
import com.example.demo.repository.LocalRepository;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {

	@Autowired
	private LocalRepository lr;

	@CrossOrigin
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Localidade> listaLocalidades(){
		Iterable<Localidade> listaLocalidades = lr.findAll();
		return listaLocalidades;
	}

	@CrossOrigin
	@PostMapping("/add")
	public Localidade adicionarLocalidade(@RequestBody @Valid Localidade localidade) {
		return lr.save(localidade);
	}

}

