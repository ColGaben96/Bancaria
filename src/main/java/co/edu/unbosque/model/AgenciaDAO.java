package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AgenciaDTO;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Interface to implement Spring's magic
 */
public interface AgenciaDAO extends CrudRepository<AgenciaDTO, Integer> {

}
