package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Cervejaria;
import com.example.demo.models.Localidade;
import com.example.demo.repository.CervejaRepository;


@RestController
@RequestMapping("/cervejaria")
public class CervejariaController {


	@Autowired
	private CervejaRepository cr;

	@CrossOrigin
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Cervejaria> listaCervejarias(){
		Iterable<Cervejaria> listaCervejarias = cr.findAll();
		return listaCervejarias;
	}

	@CrossOrigin
	@PostMapping("/add")
	public Cervejaria adicionarCervejaria(@RequestBody /*String code, String name, Integer localidade, 
			String phone,*/ Cervejaria cervejaria) {

		
		
		/*Cervejaria cv = new Cervejaria ();

		cv.setCode(code);
		cv.setName(name);
		cv.setLocalidade(localidade);
		cv.setPhone(phone);  */

		return cr.save(cervejaria);
	}

	@CrossOrigin
	@DeleteMapping("/delete")
	public Cervejaria deletarCervejaria(@RequestBody Cervejaria cervejaria) {
		cr.delete(cervejaria);
		return cervejaria;
	}

	@CrossOrigin
	@PutMapping("/edit")
	public Cervejaria atualizarCervejaria(@RequestBody Cervejaria cervejaria) {
		return cr.save(cervejaria);
	}

}
