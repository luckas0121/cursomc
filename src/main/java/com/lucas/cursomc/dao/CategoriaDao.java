package com.lucas.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Categoria;

@Repository
public interface CategoriaDao extends JpaRepository<Categoria, Integer>{

	
	
}
