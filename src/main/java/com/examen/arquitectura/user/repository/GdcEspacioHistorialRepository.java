package com.examen.arquitectura.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.arquitectura.user.model.GdcEspacioHistorial;

@Repository
public interface GdcEspacioHistorialRepository extends JpaRepository<GdcEspacioHistorial, Integer> {
	List<GdcEspacioHistorial> findByCodEspacio(Integer codEspacio);
}
