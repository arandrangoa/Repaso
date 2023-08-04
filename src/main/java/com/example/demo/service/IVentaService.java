package com.example.demo.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.modelo.Venta;
import com.example.demo.modelo.DTO.ProductoDTO;
import com.example.demo.modelo.DTO.ReporteDTO;

public interface IVentaService {
	
	public void agregar(Venta venta);
	
	public void realizarVenta(List<ProductoDTO> productos,String cedula,String numeroVenta);

	public List<ReporteDTO> reporteVentas(LocalDate fecha,String categoria,Integer cantidad );
	
	public List<Venta> reporte(LocalDateTime fechaVenta);
	
}
