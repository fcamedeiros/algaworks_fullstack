package com.algamoney.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algamoney.api.model.Pessoa;
import com.algamoney.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);

		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
			
		return pessoaRepository.save(pessoaSalva);
	}

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
		
		pessoaSalva.setAtivo(ativo);
		
		pessoaRepository.save(pessoaSalva);
	}

	private Pessoa buscarPessoaPeloCodigo(Long codigo) {
		Pessoa pessoaSalva = this.pessoaRepository.findById(codigo)
			      .orElseThrow(() -> new EmptyResultDataAccessException(1));
		return pessoaSalva;
	}
}