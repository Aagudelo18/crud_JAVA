package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.Entidades.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicioImpl implements EstudianteServicio {

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public List<Estudiante> listarEstudiantes() {
		return repositorio.findAll();
	}

	@Override
	public Estudiante guardarEstudiante(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public Estudiante obtenerEstudianteId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Estudiante actualizarEstudiannte(Estudiante estudiante) {
		return repositorio.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(Long id) {
		repositorio.deleteById(id);
	}

}
