package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.MatriculaDto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.entityManager.persist(matricula);
	}

	@Override
	public List<MatriculaDto> buscarTodosDTO() {
		// TODO Auto-generated method stub
		TypedQuery<MatriculaDto> query=this.entityManager.createQuery("select new com.example.demo.modelo.MatriculaDto(m.estudiante.cedula, m.estudiante.nombre, m.estudiante.apellido, m.materia.nombre, m.materia.codigo) from Matricula m", MatriculaDto.class);
		return query.getResultList();
	}

}
