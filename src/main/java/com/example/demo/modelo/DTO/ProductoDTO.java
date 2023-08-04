package com.example.demo.modelo.DTO;

public class ProductoDTO {
	
	private String codigoBarras;
	private Integer cantidad;
	
	
	

	public ProductoDTO() {
		// TODO Auto-generated constructor stu
	}



	public ProductoDTO(String codigoBarras, Integer cantidad) {
		super();
		this.codigoBarras = codigoBarras;
		this.cantidad=cantidad;
	}


	//SET Y GET

	public String getCodigoBarras() {
		return codigoBarras;
	}



	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	


	public Integer getCantidad() {
		return cantidad;
	}



	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	public String toString() {
		return "ProductoDTO [codigoBarras=" + codigoBarras + "]";
	}

	
	

}
