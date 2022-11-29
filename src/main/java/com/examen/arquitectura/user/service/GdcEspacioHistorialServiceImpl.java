package com.examen.arquitectura.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.model.GdcEspacioHistorial;
import com.examen.arquitectura.user.repository.GdcEspacioHistorialRepository;

@Service
public class GdcEspacioHistorialServiceImpl implements GdcEspacioHistorialService {

	@Autowired
	GdcEspacioHistorialRepository gdcEspacioHistorialRepository;

	@Override
	public List<GdcEspacioHistorial> getAllGdcEspacioHistorials() {
		return gdcEspacioHistorialRepository.findAll();
	}

}