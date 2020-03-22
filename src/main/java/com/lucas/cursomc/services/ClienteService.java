package com.lucas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.cursomc.dao.ClienteDao;
import com.lucas.cursomc.domain.Cliente;
import com.lucas.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	public Cliente find(Integer clienteId){
		Optional<Cliente> cliente = clienteDao.findById(clienteId);
		return cliente.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+ clienteId+", Tipo: "+Cliente.class.getName()));
	}
	
}
