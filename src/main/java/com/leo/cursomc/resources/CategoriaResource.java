package com.leo.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leo.cursomc.domain.Categoria;
import com.leo.cursomc.services.CategoriaService;

@RestController //Anotação para dizer que esta classe é um controlador
@RequestMapping(value="/categorias") //Atribui a URI a classe

public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET) //Informa que tipo de operação HTTP está sendo utilizada
	 	public ResponseEntity<?> find(@PathVariable Integer id ) {//GET = Pegar as informações da classe
			
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
		
	}
	
}
