package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Detalle;
import com.example.demo.modelo.Producto;
import com.example.demo.modelo.Venta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class VentaRepoImpl implements IVentaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Venta venta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(venta);
	}

	@Override
	public void realizarVenta(List<Producto> productos, String cedula, String numeroVenta,Integer cantidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Venta> reporte(LocalDateTime fechaVenta) {
		// TODO Auto-generated method stub
		TypedQuery<Venta> query=this.entityManager.createQuery("select v from Venta v where v.fecha= :datoFecha", Venta.class);
		query.setParameter("datoFecha", fechaVenta);
		return query.getResultList();
	}

}
