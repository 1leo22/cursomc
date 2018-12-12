package com.leo.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leo.cursomc.domain.Categoria;

@RestController //Anotação para dizer que esta classe é um controlador
@RequestMapping(value="/categorias") //Atribui a URI a classe
public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET) //Informa que tipo de operação HTTP está sendo utilizada
	 	public List<Categoria> listar() {//GET = Pegar as informações da classe
		
		Categoria cat1 = new Categoria (1, "Informática");
		Categoria cat2 = new Categoria (2, "Escritório");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
	
}
