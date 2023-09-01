package com.example.demo.modelo;

public class MatriculaDto {
	
	private String cedulaEstu;
	
	private String nombreEstu;
	
	private String apellidoEstu;
	
	private String nombreMate;
	
	private String codigoMate;

	
	public MatriculaDto() {

	}


	public MatriculaDto(String cedulaEstu, String nombreEstu, String apellidoEstu, String nombreMate,
			String codigoMate) {
		super();
		this.cedulaEstu = cedulaEstu;
		this.nombreEstu = nombreEstu;
		this.apellidoEstu = apellidoEstu;
		this.nombreMate = nombreMate;
		this.codigoMate = codigoMate;
	}


	public String getCedulaEstu() {
		return cedulaEstu;
	}


	public void setCedulaEstu(String cedulaEstu) {
		this.cedulaEstu = cedulaEstu;
	}


	public String getNombreEstu() {
		return nombreEstu;
	}


	public void setNombreEstu(String nombreEstu) {
		this.nombreEstu = nombreEstu;
	}


	public String getApellidoEstu() {
		return apellidoEstu;
	}


	public void setApellidoEstu(String apellidoEstu) {
		this.apellidoEstu = apellidoEstu;
	}


	public String getNombreMate() {
		return nombreMate;
	}


	public void setNombreMate(String nombreMate) {
		this.nombreMate = nombreMate;
	}


	public String getCodigoMate() {
		return codigoMate;
	}


	public void setCodigoMate(String codigoMate) {
		this.codigoMate = codigoMate;
	}
	
	
	

}
