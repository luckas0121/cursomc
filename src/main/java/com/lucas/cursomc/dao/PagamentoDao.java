package com.lucas.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Pagamento;

@Repository
public interface PagamentoDao extends JpaRepository<Pagamento, Integer>{

	
	
}
