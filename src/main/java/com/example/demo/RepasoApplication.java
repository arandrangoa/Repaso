package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class RepasoApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Estudiante e1=new Estudiante();
		e1.setApellido("Andrango");
		e1.setNombre("Alex");
		e1.setCedula("1817141516");
		e1.setCiudad("Guayaquil");
		e1.setGenero("Masculino");
		e1.setPais("Ecuador");
		//this.estudianteService.agregar(e1);
		
		//Query
		System.out.println("Query");
		Estudiante estuBusqueda=this.estudianteService.buscarPorNombreQuery("Darleen");
		System.out.println(estuBusqueda);
		System.out.println("*******************************************************");
		
		//Typed Query
		System.out.println("Typed Query");
		Estudiante estuBusqueda2=this.estudianteService.buscarPorNombreTypedQuery("Darleen");
		System.out.println(estuBusqueda2);
		System.out.println("*******************************************************");
		
		//Named Query
		System.out.println("Named Query");
		Estudiante estuBusqueda3=this.estudianteService.buscarPorNombreNamedQuery("Darleen");
		System.out.println(estuBusqueda3);
		System.out.println("*******************************************************");
		
		//Native Query
		System.out.println("Native Query");
		Estudiante estuBusqueda4=this.estudianteService.buscarPorNombreNativeQuery("Darleen");
		System.out.println(estuBusqueda4);
		System.out.println("*******************************************************");
		
		//Native Query
		System.out.println("Query List");
		List<Estudiante> listaEstudiantes=this.estudianteService.buscarPorNombreQueryList("Alex");
		for(Estudiante e: listaEstudiantes) {
			System.out.println(e);
		}
		System.out.println("*******************************************************");
		
		//Native Query
		System.out.println("DTO Typed Query");
		EstudianteDTO estuBusqueda5=this.estudianteService.buscarPorNombreQueryTypedDTO("Darleen");
		System.out.println(estuBusqueda5);
		System.out.println("*******************************************************");
		
		
	}

}
