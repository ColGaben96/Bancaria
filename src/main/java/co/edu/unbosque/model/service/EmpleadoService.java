package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.EmpleadoDTO;

import java.util.List;

public interface EmpleadoService {
    List<EmpleadoDTO> listEmpleados();
    void save(EmpleadoDTO empleado);
    void delete(EmpleadoDTO empleado);
    EmpleadoDTO findEmpleado(EmpleadoDTO empleado);
}
