package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.DTO.ProductoDTO;
import com.example.demo.repository.IProductoRepo;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo iProductoRepo;
	
	
	@Override
	public Producto buscarProductoPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.buscarProductoPorCodigo(codigo);
	}
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.iProductoRepo.actualizar(producto);
	}
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void agregar(Producto producto) {
		// TODO Auto-generated method stub
		
		try {
			Producto pEncontrado=this.buscarProductoPorCodigo(producto.getCodigoBarras());
			Integer stockNuevo=producto.getStock();
			Integer stockActual=pEncontrado.getStock();
			Integer stockActualizado=stockActual+stockNuevo;
			pEncontrado.setStock(stockActualizado);
			this.iProductoRepo.actualizar(pEncontrado);
		
		
		} catch (Exception e){
			this.iProductoRepo.insertar(producto);
		}
	
	}

	@Override
	public ProductoDTO seleccionarProductoDTO(String codigo) {
		// TODO Auto-generated method stub
		return this.iProductoRepo.seleccionarProductoDTO(codigo);
	}



	



}
