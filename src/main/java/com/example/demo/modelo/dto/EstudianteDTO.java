package com.example.demo.modelo.dto;


public class EstudianteDTO {
	
	private String nombre;
	private String ciudad;
	private String cedula;
	
	public EstudianteDTO() {
		
	}
	
	
	public EstudianteDTO(String nombre, String ciudad, String cedula) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	@Override
	public String toString() {
		return "EstudianteDTO [nombre=" + nombre + ", ciudad=" + ciudad + ", cedula=" + cedula + "]";
	}
	
	
	

}
