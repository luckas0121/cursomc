package com.lucas.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Estado;

@Repository
public interface EstadoDao extends JpaRepository<Estado, Integer>{

	
	
}
