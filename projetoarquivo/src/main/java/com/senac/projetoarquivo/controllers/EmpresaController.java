package com.senac.projetoarquivo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.projetoarquivo.entity.Empresa;
import com.senac.projetoarquivo.services.EmpresaService;

import projetoarquivo_projetoarquivo.dto.response.EmpresaDtoResponse;

@RestController
@RequestMapping("api/empresa")
public class EmpresaController {
	private final EmpresaService empresaService;
	
	public EmpresaController(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}
	
	
	
	@GetMapping
	public ResponseEntity<Optional<Empresa>> getEmpresa(){
		Optional<Empresa> empresa = empresaService.getEmpresaById(1);
		if(empresa.isEmpty())
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(empresa);
		
	}
	
	
	/*
	 * @GetMapping(value = "getEmpresaById") public
	 * ResponseEntity<Optional<Empresa>> getEmpresa(){ Optional<Empresa> empresa =
	 * empresaService.getEmpresaById(1); if(empresa.isEmpty()) return
	 * ResponseEntity.notFound().build(); return ResponseEntity.ok(empresa);
	 * 
	 * }
	 */
	
	
	/*@GetMapping
	public ResponseEntity <Empresa> obtemEmpresas(){
		Empresa empresa = new Empresa();
		empresa.setId(0);
		empresa.setNome("Senac");
		
		return new ResponseEntity<>(empresa, HttpStatus.OK);
	}

	*/
	
}
