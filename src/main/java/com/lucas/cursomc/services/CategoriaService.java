package com.lucas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.cursomc.dao.CategoriaDao;
import com.lucas.cursomc.domain.Categoria;
import com.lucas.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaDao categoriaDao;
	
	public Categoria find(Integer categoriaId){
		Optional<Categoria> cat = categoriaDao.findById(categoriaId);
		return cat.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+ categoriaId+", Tipo: "+Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria cat) {
		cat.setId(null);
		return categoriaDao.save(cat);
	}
	
}
