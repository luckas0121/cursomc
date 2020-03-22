package com.lucas.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Endereco;

@Repository
public interface EnderecoDao extends JpaRepository<Endereco, Integer>{

	
	
}
