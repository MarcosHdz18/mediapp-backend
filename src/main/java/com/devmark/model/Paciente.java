/**
 * 
 */
package com.devmark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author marcos.hernandez
 * 
 * Clase entity que será mapeada mediante JPA con la base de datos
 *
 */
@Entity
@Table(name = "paciente")
public class Paciente {
	
	/**
	 * Identificador unico del paciente
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPaciente")
	private Integer idPaciente;	
	/**
	 * Nombres del paciente
	 */
	private String nombres;
	/**
	 * Apellidos del paciente	
	 */
	private String apellidos;
	/**
	 * Direccion del paciente		
	 */
	private String direccion;
	/**
	 * Telefono del paciente
	 */
	private String telefono;
	/**
	 * Telefono del paciente
	 */
	private String email;
	/**
	 * @return the idPaciente
	 */
	public Integer getIdPaciente() {
		return idPaciente;
	}
	/**
	 * @param idPaciente the idPaciente to set
	 */
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
