package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;

	
	@GetMapping("/registrarEstudiante")
	private String registrarEstudiante(Estudiante estudiante) {
		return "vistaNuevoEstudiante";
	}
	
	@PostMapping("/insertarEstudiante")
	private String insertarEstudiante(Estudiante estudiante) {
		this.estudianteService.agregar(estudiante);
		return "redirect:/estudiantes/listaEstudiantes";
	}
	
	@GetMapping("/listaEstudiantes")
	private String listaEstudiantes(Model modelo) {
		List<Estudiante> estudiantes=this.estudianteService.encontrarTodos();
		modelo.addAttribute("estudiantes", estudiantes);
		return "vistaListaEstudiantes";
	}
	
	@DeleteMapping("/eliminarEstudiante/{id}")
	private String eliminarEstudiante(@PathVariable("id") Integer id) {
		this.estudianteService.borrar(id);
		return "redirect:/estudiantes/listaEstudiantes";
	}
	
}
