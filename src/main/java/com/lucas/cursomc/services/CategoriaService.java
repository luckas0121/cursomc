package com.lucas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.cursomc.dao.CategoriaDao;
import com.lucas.cursomc.domain.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaDao categoriaDao;
	
	public Categoria find(Integer categoriaId) {
		Optional<Categoria> cat = categoriaDao.findById(categoriaId);
		return cat.orElse(null);
	}
	
}
