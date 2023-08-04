package com.example.demo.service;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.DTO.ProductoDTO;

public interface IProductoService {
	
	public void agregar(Producto producto);
	
	public void actualizar(Producto producto);
	
	public Producto buscarProductoPorCodigo(String codigo);
	
	public ProductoDTO seleccionarProductoDTO(String codigo);

}
