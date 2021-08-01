/**
 * 
 */
package com.devmark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devmark.model.Paciente;

/**
 * @author marcos.hernandez
 * Interface que establece los metodos del CRUD para la tabla de paciente
 *
 */
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {

}
