package com.examen.arquitectura.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.arquitectura.user.model.SegUsuarioEspacio;

@Repository
public interface SegUsuarioEspacioRepository extends JpaRepository<SegUsuarioEspacio, Integer> {
	List<SegUsuarioEspacio> findAll();
}