package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Producto;
import com.example.demo.modelo.DTO.ProductoDTO;
import com.example.demo.service.IProductoService;
import com.example.demo.service.IVentaService;

@SpringBootApplication
public class RepasoEjercicioViernesApplication implements CommandLineRunner{

	private static final Logger LOG=LoggerFactory.getLogger(RepasoEjercicioViernesApplication.class);
	
	@Autowired
	private IProductoService iProductoService;
	
	@Autowired
	private IVentaService iVentaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoEjercicioViernesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Producto p=new Producto();
		p.setCategoria("Fruta");
		p.setCodigoBarras("SA1");
		p.setNombre("Sandia");
		p.setPrecio(new BigDecimal(10));
		p.setStock(10);
		
		//this.iProductoService.agregar(p);
		
		ProductoDTO pDTO=new ProductoDTO();
		pDTO.setCantidad(2);
		pDTO.setCodigoBarras("SA1");
		
		List<ProductoDTO> carrito=new ArrayList<>();
		carrito.add(pDTO);
		
		this.iVentaService.realizarVenta(carrito, "V-1", "1727193847");
		
		
//		Producto pConsultado=this.iProductoService.buscarProductoPorCodigo("TV1");
//		LOG.info("Producto consultado: "+pConsultado);
//		
//		ProductoDTO pConsultado2=this.iProductoService.seleccionarProductoDTO("RF1");
//		LOG.info("Producto DTO"+pConsultado2);
		
	}

}
