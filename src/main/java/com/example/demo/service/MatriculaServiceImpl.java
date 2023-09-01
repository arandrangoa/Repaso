package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.Materia;
import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaDto;
import com.example.demo.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepo iMatriculaRepo;
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService iMateriaService;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		Estudiante e=this.estudianteService.buscarPorCedula(matricula.getEstudiante().getCedula());
		Materia m=this.iMateriaService.buscarPorCodigo(matricula.getMateria().getCodigo());
		
		int numeroEstuEnMateria=m.getNumeroEstudiantes();
		int nuevoNumero=numeroEstuEnMateria+1;
		
		m.setNumeroEstudiantes(nuevoNumero);
		this.iMateriaService.modificar(m);
		
		Matricula matri=new Matricula();
		matri.setEstudiante(e);
		matri.setMateria(m);
		this.iMatriculaRepo.insertar(matri);
	}

	@Override
	public List<MatriculaDto> buscarTodosDTO() {
		// TODO Auto-generated method stub
		return this.iMatriculaRepo.buscarTodosDTO();
	}

}
