package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaDto;

public interface IMatriculaService {
	
	public void insertar(Matricula matricula);
	
	public List<MatriculaDto> buscarTodosDTO();

}
