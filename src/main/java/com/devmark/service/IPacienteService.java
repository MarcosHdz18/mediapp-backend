/**
 * 
 */
package com.devmark.service;

import java.util.List;

import com.devmark.model.Paciente;

/**
 * @author marcos.hernandez
 * 
 * Interface que establece los metodos del CRUD para las transacciones de la entidad Paciente
 *
 */
public interface IPacienteService {
	/**
	 * Metodo que permite registrar un paciente
	 * @param paciente {@link Paciente} objeto de tipo Paciente que se va a registrar
	 */
	public abstract void registrar(Paciente paciente);
	/**
	 * Metodo que permite modificar un paciente
	 * @param paciente {@link Paciente} objeto de tipo Paciente que se va a registrar
	 */
	public abstract void modificar(Paciente paciente);
	/**
	 * Metodo que permite realizar la consulta de todos los registros de Paciente
	 * @return {@link List} objeto de tipo List con todos los registros de la entidad Paciente
	 */
	public abstract List<Paciente> listar();
	/**
	 * Metodo que permite consultar por su id un registro de paciente
	 * @param idPaciente {@link Integer} identificador unico del paciente a consultar
	 * @return {@link Persona} un objeto de tipo Paciente
	 */
	public abstract Paciente leerPorId(Integer idPaciente);
	/**
	 * Metodo que permite eliminar un registro de tipo Paciente por su identificador unico
	 * @param idPaciente {@link Integer} identificador unico del paciente
	 */
	public abstract void eliminar(Integer idPaciente);
	
}
