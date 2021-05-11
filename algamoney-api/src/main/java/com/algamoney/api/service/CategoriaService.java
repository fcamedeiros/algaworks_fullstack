package com.algamoney.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algamoney.api.model.Categoria;
import com.algamoney.api.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired CategoriaRepository categoriaRepository;
	
	public Categoria atualizar(Long codigo, Categoria categoria) {
		Categoria categoriaSalva = this.categoriaRepository.findById(codigo)
			      .orElseThrow(() -> new EmptyResultDataAccessException(1));

		BeanUtils.copyProperties(categoria, categoriaSalva, "codigo");
			
		return categoriaRepository.save(categoriaSalva);
	}		
	
}
