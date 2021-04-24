package co.edu.unbosque.model.service;

import co.edu.unbosque.model.EmpleadoDAO;
import co.edu.unbosque.model.persistence.EmpleadoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Implementation of EmpleadoService. Here is where magic literally happens.
 */
@Service
public class EmpleadoImpl implements EmpleadoService {
    @Autowired
    private EmpleadoDAO empleado;

    @Override
    @Transactional(readOnly = true)
    public List<EmpleadoDTO> listEmpleados() {
        return (List<EmpleadoDTO>) this.empleado.findAll();
    }

    @Override
    @Transactional
    public void save(EmpleadoDTO empleado) {
        this.empleado.save(empleado);
    }

    @Override
    @Transactional
    public void delete(EmpleadoDTO empleado) {
        this.empleado.delete(empleado);
    }

    @Override
    @Transactional(readOnly = true)
    public EmpleadoDTO findEmpleado(EmpleadoDTO empleado) {
        return this.empleado.findById(empleado.getIdEmpleado()).orElse(null);
    }
}
