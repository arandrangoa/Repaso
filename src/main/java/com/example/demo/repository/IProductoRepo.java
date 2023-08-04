package com.example.demo.repository;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.DTO.ProductoDTO;

public interface IProductoRepo {
	
	public void insertar(Producto producto);
	
	public void actualizar(Producto producto);
	
	public Producto buscarProductoPorCodigo(String codigo);
	
	public ProductoDTO seleccionarProductoDTO(String codigo);

}
