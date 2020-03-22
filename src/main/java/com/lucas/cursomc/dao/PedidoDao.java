package com.lucas.cursomc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.cursomc.domain.Pedido;

@Repository
public interface PedidoDao extends JpaRepository<Pedido, Integer>{

	
	
}
