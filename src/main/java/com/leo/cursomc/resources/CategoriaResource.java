package com.leo.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //Anotação para dizer que esta classe é um controlador
@RequestMapping(value="/categorias") //Atribui a URI a classe
public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET) //Informa que tipo de operação HTTP está sendo utilizada
	 	public String listar() {			  //GET = Pegar as informações da classe
		return "REST está funcionando";
	}
	
}
