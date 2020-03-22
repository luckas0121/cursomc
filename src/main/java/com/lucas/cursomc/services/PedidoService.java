package com.lucas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.cursomc.dao.PedidoDao;
import com.lucas.cursomc.domain.Pedido;
import com.lucas.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoDao pedidoDao;
	
	public Pedido find(Integer pedidoId){
		Optional<Pedido> pedido = pedidoDao.findById(pedidoId);
		return pedido.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+ pedidoId+", Tipo: "+Pedido.class.getName()));
	}
	
}
