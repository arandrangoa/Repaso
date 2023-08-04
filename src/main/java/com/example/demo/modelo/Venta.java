package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_venta")
	@SequenceGenerator(name = "seq_venta",sequenceName = "seq_venta", allocationSize = 1)
	@Column(name="vent_id")
	private Integer id;
	
	@Column(name="vent_numero")
	private String numero;
	
	@Column(name="vent_fecha")
	private LocalDate fecha;
	
	@Column(name="vent_cedula_cliente")
	private String cedulaCliente;
	
	@Column(name="vent_total_venta")
	private BigDecimal totalVenta;
	
	@OneToMany(mappedBy = "venta")
	private List<Detalle> detalles;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public BigDecimal getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(BigDecimal totalVenta) {
		this.totalVenta = totalVenta;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}


	
	

}
