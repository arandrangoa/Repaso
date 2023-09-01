package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaDto;

public interface IMatriculaRepo {
	
	public void insertar(Matricula matricula);
	
	public List<MatriculaDto> buscarTodosDTO();
	

}
