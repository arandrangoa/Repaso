package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

public interface IEstudianteService {
	
	public void agregar(Estudiante estudiante);
	
	//Query
	public Estudiante buscarPorNombreQuery(String nombre);
	
	//Typed Query
	public Estudiante buscarPorNombreTypedQuery(String nombre);
	
	//Named Query
	public Estudiante buscarPorNombreNamedQuery(String nombre);
	
	//Native Query
	public Estudiante buscarPorNombreNativeQuery(String nombre);
	
	//Query List
	public List<Estudiante> buscarPorNombreQueryList(String nombre);
	
	//DTO
	public EstudianteDTO buscarPorNombreQueryTypedDTO(String nombre);

}
