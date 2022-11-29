package com.examen.arquitectura.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.arquitectura.user.service.GdcEspacioHistorialService;
import com.examen.arquitectura.user.model.GdcEspacioHistorial;

@RestController
@RequestMapping("/api")
public class GdcEspacioHistorialController {

	@Autowired
	GdcEspacioHistorialService gdcEspacioHistorialService;

	@GetMapping("/gdcEspacioHistorials")

	public List<GdcEspacioHistorial> getAllGdcEspacioHistorials() {
		return gdcEspacioHistorialService.getAllGdcEspacioHistorials();
	}

}
