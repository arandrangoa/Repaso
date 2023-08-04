package com.example.demo.modelo.DTO;

import java.math.BigDecimal;

public class ReporteDTO {
	
	private String codigoBarras;
	
	private String categoria;
	
	private Integer Cantidad;
	
	private BigDecimal precioUnitario;
	
	private BigDecimal subtotal;

	public ReporteDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReporteDTO(String codigoBarras, String categoria, Integer cantidad, BigDecimal precioUnitario,
			BigDecimal subtotal) {
		super();
		this.codigoBarras = codigoBarras;
		this.categoria = categoria;
		Cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "ReporteDTO [codigoBarras=" + codigoBarras + ", categoria=" + categoria + ", Cantidad=" + Cantidad
				+ ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + "]";
	}
	
	

}
