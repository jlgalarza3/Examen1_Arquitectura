package com.examen.arquitectura.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.arquitectura.user.model.GdcEspacio;

@Repository
public interface GdcEspacioRepository extends JpaRepository<GdcEspacio, Integer> {
	List<GdcEspacio> findAll();
}
