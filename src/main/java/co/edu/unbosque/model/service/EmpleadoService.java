package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.EmpleadoDTO;

import java.util.List;
/**
 * @author Gabriel Blanco
 * @version 1.0
 * This is where DAO works here pretty well
 */
public interface EmpleadoService {
    List<EmpleadoDTO> listEmpleados();
    void save(EmpleadoDTO empleado);
    void delete(EmpleadoDTO empleado);
    EmpleadoDTO findEmpleado(EmpleadoDTO empleado);
}
