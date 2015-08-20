package com.hayturno.myapp.hibernatecode;

// Generated 15-ago-2015 21:00:45 by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ControlId generated by hbm2java
 */
@Embeddable
public class ControlId implements java.io.Serializable {

	private Date fecha;
	private Float peso;
	private Float imc;
	private String observacion;
	private String talla;
	private int idpersona;

	public ControlId() {
	}

	public ControlId(int idpersona) {
		this.idpersona = idpersona;
	}

	public ControlId(Date fecha, Float peso, Float imc, String observacion,
			String talla, int idpersona) {
		this.fecha = fecha;
		this.peso = peso;
		this.imc = imc;
		this.observacion = observacion;
		this.talla = talla;
		this.idpersona = idpersona;
	}

	@Column(name = "fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "peso", precision = 12, scale = 0)
	public Float getPeso() {
		return this.peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	@Column(name = "imc", precision = 12, scale = 0)
	public Float getImc() {
		return this.imc;
	}

	public void setImc(Float imc) {
		this.imc = imc;
	}

	@Column(name = "observacion", length = 200)
	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	@Column(name = "talla", length = 20)
	public String getTalla() {
		return this.talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	@Column(name = "idpersona", nullable = false)
	public int getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ControlId))
			return false;
		ControlId castOther = (ControlId) other;

		return ((this.getFecha() == castOther.getFecha()) || (this.getFecha() != null
				&& castOther.getFecha() != null && this.getFecha().equals(
				castOther.getFecha())))
				&& ((this.getPeso() == castOther.getPeso()) || (this.getPeso() != null
						&& castOther.getPeso() != null && this.getPeso()
						.equals(castOther.getPeso())))
				&& ((this.getImc() == castOther.getImc()) || (this.getImc() != null
						&& castOther.getImc() != null && this.getImc().equals(
						castOther.getImc())))
				&& ((this.getObservacion() == castOther.getObservacion()) || (this
						.getObservacion() != null
						&& castOther.getObservacion() != null && this
						.getObservacion().equals(castOther.getObservacion())))
				&& ((this.getTalla() == castOther.getTalla()) || (this
						.getTalla() != null && castOther.getTalla() != null && this
						.getTalla().equals(castOther.getTalla())))
				&& (this.getIdpersona() == castOther.getIdpersona());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFecha() == null ? 0 : this.getFecha().hashCode());
		result = 37 * result
				+ (getPeso() == null ? 0 : this.getPeso().hashCode());
		result = 37 * result
				+ (getImc() == null ? 0 : this.getImc().hashCode());
		result = 37
				* result
				+ (getObservacion() == null ? 0 : this.getObservacion()
						.hashCode());
		result = 37 * result
				+ (getTalla() == null ? 0 : this.getTalla().hashCode());
		result = 37 * result + this.getIdpersona();
		return result;
	}

}