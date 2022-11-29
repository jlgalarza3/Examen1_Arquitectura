package com.examen.arquitectura.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface SegUsuarioEspacio extends JpaRepository<SegUsuarioEspacio, SegUsuarioEspacioPK> {
	List<SegUsuarioEspacio> findByCodeUser(Integer codeUser);
	List<SegUsuarioEspacio> findByCodEspacio(Integer codEspacio);
}
