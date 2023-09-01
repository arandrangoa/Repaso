package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService{
	
	public void agregar(Estudiante estudiante);
	
	public List<Estudiante> encontrarTodos();
	
	public Estudiante encontrarPorId(Integer id);
	
	public void borrar(Integer id);
	
	public Estudiante buscarPorCedula(String cedula);

}
