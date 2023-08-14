package com.app.web.servicio;

import java.util.List;

import com.app.web.Entidades.Estudiante;

public interface EstudianteServicio {

	public List<Estudiante> listarEstudiantes();

	public Estudiante guardarEstudiante(Estudiante estdiante);

	public Estudiante obtenerEstudianteId(Long id);

	public Estudiante actualizarEstudiannte(Estudiante estudiante);

	public void eliminarEstudiante(Long id);

}
