package com.examen.arquitectura.user.model;

import lombok.Data;

import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class SegUsuarioEspacioPK extends Serializable {

	@Column(name = "cod_espacio", nullable = false)
	private Integer codEspacio;

	@Column(name = "code_user", nullable = false)
	private Integer codeUser;

}
