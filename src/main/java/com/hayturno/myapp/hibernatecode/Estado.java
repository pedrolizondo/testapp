package com.hayturno.myapp.hibernatecode;

// Generated 15-ago-2015 21:00:45 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Estado generated by hbm2java
 */
@Entity
@Table(name = "estado", catalog = "hayturno")
public class Estado implements java.io.Serializable {

	private int idestado;
	private String descripcion;
	private String tipoEstado;
	private Set<Persona> personas = new HashSet<Persona>(0);
	private Set<Turno> turnos = new HashSet<Turno>(0);

	public Estado() {
	}

	public Estado(int idestado) {
		this.idestado = idestado;
	}

	public Estado(int idestado, String descripcion, String tipoEstado,
			Set<Persona> personas, Set<Turno> turnos) {
		this.idestado = idestado;
		this.descripcion = descripcion;
		this.tipoEstado = tipoEstado;
		this.personas = personas;
		this.turnos = turnos;
	}

	@Id
	@Column(name = "idestado", unique = true, nullable = false)
	public int getIdestado() {
		return this.idestado;
	}

	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}

	@Column(name = "descripcion", length = 45)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "tipo_estado", length = 45)
	public String getTipoEstado() {
		return this.tipoEstado;
	}

	public void setTipoEstado(String tipoEstado) {
		this.tipoEstado = tipoEstado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
	public Set<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estado")
	public Set<Turno> getTurnos() {
		return this.turnos;
	}

	public void setTurnos(Set<Turno> turnos) {
		this.turnos = turnos;
	}

}
