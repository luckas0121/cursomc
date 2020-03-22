package com.lucas.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Produto;

@Repository
public interface ProdutoDao extends JpaRepository<Produto, Integer>{

	
	
}
