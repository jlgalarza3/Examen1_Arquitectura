package com.examen.arquitectura.user.model;

import jakarta.persistence.*;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gdc_espacio")
@Data
@NoArgsConstructor
public class GdcEspacio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codEspacio;

	@Column(name = "nombre", length = 128, nullable = false)
	private String nombre;

	@Column(name = "descripcion", length = 500, nullable = false)
	private String descripcion;

	@Column(name = "fecha_creacion", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaCreacion;

	@Column(name = "visibilidad", length = 3, nullable = false)
	private String visibilidad;

	public GdcEspacio(Integer codEspacio) {
		this.codEspacio = codEspacio;
	}

}
