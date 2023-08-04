package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Detalle;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DetalleRepoImpl implements IDetalleRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Detalle detalle) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalle);
	}

}
