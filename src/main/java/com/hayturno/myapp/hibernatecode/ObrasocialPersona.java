package com.hayturno.myapp.hibernatecode;

// Generated 15-ago-2015 21:00:45 by Hibernate Tools 3.6.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ObrasocialPersona generated by hbm2java
 */
@Entity
@Table(name = "obrasocial_persona", catalog = "hayturno")
public class ObrasocialPersona implements java.io.Serializable {

	private ObrasocialPersonaId id;
	private Obrasocial obrasocial;
	private Persona persona;

	public ObrasocialPersona() {
	}

	public ObrasocialPersona(ObrasocialPersonaId id, Obrasocial obrasocial,
			Persona persona) {
		this.id = id;
		this.obrasocial = obrasocial;
		this.persona = persona;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idobrasocial", column = @Column(name = "idobrasocial", nullable = false)),
			@AttributeOverride(name = "idpersona", column = @Column(name = "idpersona", nullable = false)),
			@AttributeOverride(name = "numAfiliado", column = @Column(name = "num_afiliado", length = 45)) })
	public ObrasocialPersonaId getId() {
		return this.id;
	}

	public void setId(ObrasocialPersonaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idobrasocial", nullable = false, insertable = false, updatable = false)
	public Obrasocial getObrasocial() {
		return this.obrasocial;
	}

	public void setObrasocial(Obrasocial obrasocial) {
		this.obrasocial = obrasocial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpersona", nullable = false, insertable = false, updatable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
