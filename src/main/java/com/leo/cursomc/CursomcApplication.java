package com.leo.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leo.cursomc.domain.Categoria;
import com.leo.cursomc.domain.Produto;
import com.leo.cursomc.repositories.CategoriaRepository;
import com.leo.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{ //CommandLineRunner permite criar um metodo auxiliar que realiza operações na inicialização da aplicação
    
	@Autowired
	CategoriaRepository repoCategoria;
	
	@Autowired
	ProdutoRepository repoProduto;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override // metodo que realiza instanciações no momento de inicialização da aplicação
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria (null, "Informática");
		Categoria cat2 = new Categoria (null, "Escritório");
		
		Produto p1 = new Produto (null, "Computador", 2000.00);
		Produto p2 = new Produto (null, "Impressora", 800.00);
		Produto p3 = new Produto (null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		
		repoCategoria.saveAll(Arrays.asList(cat1, cat2)); //Arrays.asList serve para criar uma lista automática
		repoProduto.saveAll(Arrays.asList(p1, p2, p3));
	}
}
