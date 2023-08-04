package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Detalle;
import com.example.demo.modelo.Producto;
import com.example.demo.modelo.Venta;
import com.example.demo.modelo.DTO.ProductoDTO;
import com.example.demo.modelo.DTO.ReporteDTO;
import com.example.demo.repository.IVentaRepo;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepo iVentaRepo;
	
	@Autowired
	private IProductoService iProductoService;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void agregar(Venta venta) {
		// TODO Auto-generated method stub
		this.iVentaRepo.insertar(venta);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void realizarVenta(List<ProductoDTO> productos, String cedula, String numeroVenta) {
		// TODO Auto-generated method stub
		Venta v=new Venta();
		v.setCedulaCliente(cedula);
		v.setFecha(LocalDate.now());
		v.setNumero(numeroVenta);
		
		List<Detalle> detalles=new ArrayList<>();
		BigDecimal valorTotalVenta=new BigDecimal(0);
		
		
		for(ProductoDTO codPro:productos) {
			Producto p=this.iProductoService.buscarProductoPorCodigo(codPro.getCodigoBarras());
			
			Detalle d=new Detalle();
			d.setCantidad(codPro.getCantidad());
			d.setPrecioUnitario(p.getPrecio());
			d.setProducto(p);
			d.setSubtotal(p.getPrecio().multiply(new BigDecimal(codPro.getCantidad())));
			d.setVenta(v);
			
			if(p.getStock()>=codPro.getCantidad()) {
				valorTotalVenta=valorTotalVenta.add(d.getSubtotal());
				p.setStock(p.getStock()-d.getCantidad());
				this.iProductoService.actualizar(p);
				
				detalles.add(d);
			}else {
				throw new RuntimeException();
			}
			
			v.setDetalles(detalles);
			v.setTotalVenta(valorTotalVenta);
			this.iVentaRepo.insertar(v);	
			
		}
		
		
	}


	@Override
	public List<Venta> reporte(LocalDateTime fechaVenta) {
		// TODO Auto-generated method stub
		return this.iVentaRepo.reporte(fechaVenta);
	}
	
	
	@Override
	public List<ReporteDTO> reporteVentas(LocalDate fecha, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

}
