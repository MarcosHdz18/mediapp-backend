/**
 * 
 */
package com.devmark.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devmark.model.Paciente;
import com.devmark.repository.IPacienteRepository;
import com.devmark.service.IPacienteService;

/**
 * @author marcos.hernandez
 * 
 * Clase que implementa los metodos del CRUD para las transacciones hacia la tabla paciente de la
 * base de datos
 *
 */
@Service
public class PacienteServiceImpl implements IPacienteService {
	
	@Autowired
	private IPacienteRepository pacienteRepositoryImpl;

	@Override
	public void registrar(Paciente paciente) {
		this.pacienteRepositoryImpl.save(paciente);
	}

	@Override
	public void modificar(Paciente paciente) {
		this.pacienteRepositoryImpl.save(paciente);
	}

	@Override
	public List<Paciente> listar() {
		return this.pacienteRepositoryImpl.findAll();
	}

	@Override
	public Paciente leerPorId(Integer idPaciente) {
		return this.pacienteRepositoryImpl.findById(idPaciente).get();
	}

	@Override
	public void eliminar(Integer idPaciente) {
		this.pacienteRepositoryImpl.deleteById(idPaciente);
	}

}
