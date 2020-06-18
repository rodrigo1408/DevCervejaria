package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.Localidade;

 

 

@Service
public class LocalDAO {

	
	@Autowired
	private LocalDAO localDAO;
	
	
	@Transactional(readOnly=true)
	public Localidade findLocal(Long id) {
		return localDAO.findLocal(id);
	}
	
}
