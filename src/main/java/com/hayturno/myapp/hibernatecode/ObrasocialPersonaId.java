package com.hayturno.myapp.hibernatecode;

// Generated 15-ago-2015 21:00:45 by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ObrasocialPersonaId generated by hbm2java
 */
@Embeddable
public class ObrasocialPersonaId implements java.io.Serializable {

	private int idobrasocial;
	private int idpersona;
	private String numAfiliado;

	public ObrasocialPersonaId() {
	}

	public ObrasocialPersonaId(int idobrasocial, int idpersona) {
		this.idobrasocial = idobrasocial;
		this.idpersona = idpersona;
	}

	public ObrasocialPersonaId(int idobrasocial, int idpersona,
			String numAfiliado) {
		this.idobrasocial = idobrasocial;
		this.idpersona = idpersona;
		this.numAfiliado = numAfiliado;
	}

	@Column(name = "idobrasocial", nullable = false)
	public int getIdobrasocial() {
		return this.idobrasocial;
	}

	public void setIdobrasocial(int idobrasocial) {
		this.idobrasocial = idobrasocial;
	}

	@Column(name = "idpersona", nullable = false)
	public int getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	@Column(name = "num_afiliado", length = 45)
	public String getNumAfiliado() {
		return this.numAfiliado;
	}

	public void setNumAfiliado(String numAfiliado) {
		this.numAfiliado = numAfiliado;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ObrasocialPersonaId))
			return false;
		ObrasocialPersonaId castOther = (ObrasocialPersonaId) other;

		return (this.getIdobrasocial() == castOther.getIdobrasocial())
				&& (this.getIdpersona() == castOther.getIdpersona())
				&& ((this.getNumAfiliado() == castOther.getNumAfiliado()) || (this
						.getNumAfiliado() != null
						&& castOther.getNumAfiliado() != null && this
						.getNumAfiliado().equals(castOther.getNumAfiliado())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdobrasocial();
		result = 37 * result + this.getIdpersona();
		result = 37
				* result
				+ (getNumAfiliado() == null ? 0 : this.getNumAfiliado()
						.hashCode());
		return result;
	}

}