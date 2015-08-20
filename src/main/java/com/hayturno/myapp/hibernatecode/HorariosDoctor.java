package com.hayturno.myapp.hibernatecode;

// Generated 15-ago-2015 21:00:45 by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * HorariosDoctor generated by hbm2java
 */
@Entity
@Table(name = "horarios_doctor", catalog = "hayturno")
public class HorariosDoctor implements java.io.Serializable {

	private int idhorariosDoctor;
	private Doctor doctor;
	private Date fecha;
	private Date horaInicio;
	private Date horaFin;

	public HorariosDoctor() {
	}

	public HorariosDoctor(int idhorariosDoctor, Doctor doctor) {
		this.idhorariosDoctor = idhorariosDoctor;
		this.doctor = doctor;
	}

	public HorariosDoctor(int idhorariosDoctor, Doctor doctor, Date fecha,
			Date horaInicio, Date horaFin) {
		this.idhorariosDoctor = idhorariosDoctor;
		this.doctor = doctor;
		this.fecha = fecha;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	@Id
	@Column(name = "idhorarios_doctor", unique = true, nullable = false)
	public int getIdhorariosDoctor() {
		return this.idhorariosDoctor;
	}

	public void setIdhorariosDoctor(int idhorariosDoctor) {
		this.idhorariosDoctor = idhorariosDoctor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iddoctor", nullable = false)
	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", length = 10)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_inicio", length = 8)
	public Date getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora_fin", length = 8)
	public Date getHoraFin() {
		return this.horaFin;
	}

	public void setHoraFin(Date horaFin) {
		this.horaFin = horaFin;
	}

}
