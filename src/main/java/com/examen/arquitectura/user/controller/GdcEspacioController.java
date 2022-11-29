package com.examen.arquitectura.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.examen.arquitectura.user.model.GdcEspacio;
import com.examen.arquitectura.user.service.GdcEspacioService;

@RestController
@RequestMapping("/api")
public class GdcEspacioController {

	@Autowired
	GdcEspacioService gdcEspacioService;

	@RequestMapping("/gdcEspacios")
	public List<GdcEspacio> getAllGdcEspacios() {
		return gdcEspacioService.getAllGdcEspacios();
	}

}