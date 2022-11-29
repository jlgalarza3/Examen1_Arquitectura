package com.examen.arquitectura.user.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.model.SegUsuarioEspacio;
import com.examen.arquitectura.user.repository.SegUsuarioEspacioRepository;

@Service
public class SegUsuarioEspacioServiceImpl implements SegUsuarioEspacioService {
	@Autowired
	SegUsuarioEspacioRepository segUsuarioEspacioRepository;

	@Override
	public List<SegUsuarioEspacio> getAllSegUsuarioEspacios() {
		return segUsuarioEspacioRepository.findAll();
	}
}