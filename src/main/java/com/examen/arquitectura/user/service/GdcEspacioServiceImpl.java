package com.examen.arquitectura.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.model.GdcEspacio;
import com.examen.arquitectura.user.repository.GdcEspacioRepository;

@Service
public class GdcEspacioServiceImpl implements GdcEspacioService {
	@Autowired
	GdcEspacioRepository gdcEspacioRepository;

	@Override
	public List<GdcEspacio> getAllGdcEspacios() {
		return gdcEspacioRepository.findAll();
	}
}