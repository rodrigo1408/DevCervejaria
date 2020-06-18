package com.example.demo.custom;

import java.util.List;

import com.example.demo.models.Localidade;

 
 
public interface LocalDAOCustom {

	
	
	List<Localidade> findAllLocalidade();
	
	
	Localidade findLocal(Long id);


}
