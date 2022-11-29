package com.examen.arquitectura.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.entity.GdcEspacio;

public interface GdcEspacioHistorialService {
	List<GdcEspacioHistorial> findByCodEspacio(Integer codEspacio);
}
