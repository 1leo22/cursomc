package com.leo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.cursomc.domain.Categoria;
import com.leo.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
		
		@Autowired //Anotação que faz a dependencia abaixo ser automaticamente instanciada pelo spring
		private CategoriaRepository repo;
		
		public Categoria buscar(Integer id) {
			
			Optional<Categoria> obj = repo.findById(id);
			
			return obj.orElse(null);
			
		}
}
