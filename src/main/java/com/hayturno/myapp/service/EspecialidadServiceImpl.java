package com.hayturno.myapp.service;

import java.util.List;

import com.hayturno.myapp.daogeneric.DaoGeneric;
import com.hayturno.myapp.daogeneric.DaoGenericImpl;
import com.hayturno.myapp.hibernatecode.Especialidad;


public class EspecialidadServiceImpl implements EspecialidadService {
	
	private DaoGeneric<Especialidad, Integer> dao = new DaoGenericImpl<Especialidad, Integer>(Especialidad.class);

	@Override
	public void saveEspecialidad(Especialidad Especialidad) {
		// TODO Auto-generated method stub
		dao.create(Especialidad);
	}

	@Override
	public void updateEspecialidad(Especialidad Especialidad) {
		// TODO Auto-generated method stub
		dao.update(Especialidad);
	}

	@Override
	public void deleteEspecialidad(Especialidad Especialidad) {
		// TODO Auto-generated method stub
		dao.delete(Especialidad);
	}

	@Override
	public Especialidad findEspecialidad(Integer id) {
		// TODO Auto-generated method stub
		Especialidad especialidad = dao.read(id);
		return especialidad;
	}

	@Override
	public List<Especialidad> getEspecialidades() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		dao.close();
	}

}
