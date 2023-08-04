package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.Venta;

public interface IVentaRepo {
	
	public void insertar(Venta venta);
	
	public void realizarVenta(List<Producto> productos,String cedula,String numeroVenta,Integer cantidad);

	public List<Venta> reporte(LocalDateTime fechaVenta);
	
}
