/**
 * 
 */
package com.devmark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devmark.model.Paciente;
import com.devmark.service.IPacienteService;

/**
 * @author marcos.hernandez
 * 
 * Clase que controla el flujo de informacion a las diferentes capas del sistema
 *
 */
@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService pacienteServiceImpl;
	
	/**
	 * Servicio RESTful que lista todos los registros de la base de datos
	 * @return {@link List} lista de objetos de tipo Paciente
	 */
	@GetMapping
	public List<Paciente> listar() {
		return this.pacienteServiceImpl.listar();		
	}
	/**
	 * Servicio RESTful que lista un registro de la base de datos por su id
	 * @param idPaciente {@link Integer} identificador unico del paciente
	 * @return {@link Paciente} un objeto de tipo Paciente por su id
	 */
	@GetMapping("/{idPaciente}")
	public Paciente leerPorId(@PathVariable("idPaciente") Integer idPaciente) {
		return this.pacienteServiceImpl.leerPorId(idPaciente);
	}
	/**
	 * Servicio RESTful que realiza el guardado en la base de datos de un registro
	 * @param paciente {@link Paciente} objeto de tipo Paciente a guardar
	 */
	@PostMapping
	public void registrar(@RequestBody Paciente paciente) {
		this.pacienteServiceImpl.registrar(paciente);		
	}
	/**
	 * Servicio RESTful que realiza la modificacion en la base de datos de un registro
	 * @param paciente {@link Paciente} objeto de tipo Paciente a guardar
	 */
	@PutMapping
	public void modificar(@RequestBody Paciente paciente) {
		this.pacienteServiceImpl.modificar(paciente);		
	}
	/**
	 * Servicio RESTful que realiza la eliminacion de un registro en la base de datos por su id
	 * @param idPaciente {@link Integer} id a eliminar
	 */
	@DeleteMapping("/{idPaciente}")
	public void eliminar(@PathVariable("idPaciente") Integer idPaciente) {
		this.pacienteServiceImpl.eliminar(idPaciente);		
	}
}
