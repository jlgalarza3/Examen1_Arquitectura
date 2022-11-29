package com.examen.arquitectura.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.entity.GdcEspacioHistorial;

@Service
public class GdcEspacioHistorialServiceImpl implements GdcEspacioHistorialService {
	
	@Autowired
	GdcEspacioHistorialRepository gdcEspacioHistorialRepository;
	
	@Override
	public List<GdcEspacioHistorial> findByCodEspacio(Integer codEspacio) {
		return gdcEspacioHistorialRepository.findByCodEspacio(codEspacio);
	}
	
}