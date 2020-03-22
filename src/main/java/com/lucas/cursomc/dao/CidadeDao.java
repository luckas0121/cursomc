package com.lucas.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Cidade;

@Repository
public interface CidadeDao extends JpaRepository<Cidade, Integer>{

	
	
}
