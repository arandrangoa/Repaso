package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.DTO.ProductoDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class ProductoRepoImpl implements IProductoRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}
	
	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Producto buscarProductoPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> query=this.entityManager.createQuery("select p from Producto p where p.codigoBarras = :datoCodigo", Producto.class);
		query.setParameter("datoCodigo", codigo);
		return query.getSingleResult();
	}



	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public ProductoDTO seleccionarProductoDTO(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<ProductoDTO> myquery=this.entityManager.createQuery("select new com.example.demo.modelo.DTO.ProductoDTO(p.codigoBarras) from Producto p where p.codigoBarras = :datoCodigo", ProductoDTO.class);
		myquery.setParameter("datoCodigo", codigo);
		return myquery.getSingleResult();
	}

	

}
