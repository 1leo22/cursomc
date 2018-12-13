package com.leo.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leo.cursomc.domain.Categoria;
import com.leo.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{ //CommandLineRunner permite criar um metodo auxiliar que realiza operações na inicialização da aplicação
    
	@Autowired
	CategoriaRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override // metodo que realiza instanciações no momento de inicialização da aplicação
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria (null, "Informática");
		Categoria cat2 = new Categoria (null, "Escritório");
		
		repo.saveAll(Arrays.asList(cat1, cat2)); //Arrays.asList serve para criar uma lista automática
	}
}
