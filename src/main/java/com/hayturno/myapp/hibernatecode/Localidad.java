package com.hayturno.myapp.hibernatecode;

// Generated 15-ago-2015 21:00:45 by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Localidad generated by hbm2java
 */
@Entity
@Table(name = "localidad", catalog = "hayturno")
public class Localidad implements java.io.Serializable {

	private Integer idlocalidad;
	private Provincia provincia;
	private String localidad;
	private Set<Persona> personas = new HashSet<Persona>(0);

	public Localidad() {
	}

	public Localidad(Provincia provincia) {
		this.provincia = provincia;
	}

	public Localidad(Provincia provincia, String localidad,
			Set<Persona> personas) {
		this.provincia = provincia;
		this.localidad = localidad;
		this.personas = personas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idlocalidad", unique = true, nullable = false)
	public Integer getIdlocalidad() {
		return this.idlocalidad;
	}

	public void setIdlocalidad(Integer idlocalidad) {
		this.idlocalidad = idlocalidad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idprovincia", nullable = false)
	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	@Column(name = "localidad", length = 100)
	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "localidad")
	public Set<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

}
