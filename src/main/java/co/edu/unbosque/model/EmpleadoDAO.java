package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.EmpleadoDTO;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoDAO extends CrudRepository<EmpleadoDTO, Integer> {
}
