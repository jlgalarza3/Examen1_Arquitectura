package com.examen.arquitectura.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.arquitectura.user.entity.GdcEspacio;

@Service
public class GdcEspacioServiceImpl implements GdcEspacioService {
	@Autowired
	GdcEspacioRepository gdcEspacioRepository;
	@Override
	public List<GdcEspacio> findByCodEspacio(Integer codEspacio) {
		return gdcEspacioRepository.findByCodEspacio(codEspacio);
	}
}