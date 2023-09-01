package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="matricula")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_matricula")
	@SequenceGenerator(name = "seq_matricula",sequenceName = "seq_matricula", allocationSize = 1)
	@Column(name="matr_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="matr_id_estudiante")
	private Estudiante estudiante;
	
	@ManyToOne
	@JoinColumn(name="matr_id_materia")
	private Materia materia;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	

}
