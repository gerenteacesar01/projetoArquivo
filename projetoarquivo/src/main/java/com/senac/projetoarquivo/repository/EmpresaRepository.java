package com.senac.projetoarquivo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.projetoarquivo.entity.Empresa;
@Repository
public interface EmpresaRepository extends JpaRepository <Empresa,Long> {
	Optional<Empresa> findById(long id);	
}
