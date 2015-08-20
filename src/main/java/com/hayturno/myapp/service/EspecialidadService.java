package com.hayturno.myapp.service;

import java.util.List;

import com.hayturno.myapp.hibernatecode.Especialidad;

public interface EspecialidadService {
	public void saveEspecialidad(Especialidad Especialidad);
	
	public void updateEspecialidad(Especialidad Especialidad);

	public void deleteEspecialidad(Especialidad Especialidad);

	public Especialidad findEspecialidad(Integer id);

	public List<Especialidad> getEspecialidades();

	public void close();
}
