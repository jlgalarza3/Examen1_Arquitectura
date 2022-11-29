package com.examen.arquitectura.user.model;

import jakarta.persistence.*;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gdc_espacio_historial")
@Data
@NoArgsConstructor
public class GdcEspacioHistorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codEspacioHistorial;

	@ManyToOne
	@JoinColumn(name = "cod_espacio", nullable = false)
	private GdcEspacio codEspacio;

	@Column(name = "fecha", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@Column(name = "accion", length = 8, nullable = false)
	private String accion;

	@Column(name = "username", length = 32, nullable = false)
	private String username;

	@Column(name = "descripcion", length = 128, nullable = false)
	private String descripcion;

	public GdcEspacioHistorial(Integer codEspacioHistorial) {
		this.codEspacioHistorial = codEspacioHistorial;
	}

}
