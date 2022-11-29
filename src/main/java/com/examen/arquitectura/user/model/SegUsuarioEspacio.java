package com.examen.arquitectura.user.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "seg_usuario_espacio")
@Data
@NoArgsConstructor
public class SegUsuarioEspacio {

	@EmbeddedId
	private SegUsuarioEspacioPK id;

	@Column(name = "rol", length = 3, nullable = false)
	private String rol;

	@Column(name = "estado", length = 3, nullable = false)
	private String estado;

	@ManyToOne
	@JoinColumn(name = "cod_espacio", nullable = false, insertable = false, updatable = false)
	private GdcEspacio codEspacio;

	@ManyToOne
	@JoinColumn(name = "code_user", nullable = false, insertable = false, updatable = false)
	private SegUser codeUser;

	public SegUsuarioEspacio(SegUsuarioEspacioPK id){
		this.id = id;
	}
}
