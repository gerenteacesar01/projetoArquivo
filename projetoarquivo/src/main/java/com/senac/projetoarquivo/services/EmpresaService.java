package com.senac.projetoarquivo.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.senac.projetoarquivo.entity.Empresa;
import com.senac.projetoarquivo.repository.EmpresaRepository;

import jakarta.transaction.Transactional;


@Service
public class EmpresaService {
	
	private final EmpresaRepository empresaRepository;
	
	public EmpresaService(EmpresaRepository _empresaRepository) {
		this.empresaRepository = _empresaRepository;
	}
	
	@Transactional
	public Optional<Empresa> getEmpresaById(long id){
		return empresaRepository.findById(id);
	}
	
	
	
	
	
	
	
}


