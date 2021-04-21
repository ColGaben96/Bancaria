package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ContratoDTO;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Interface to implement Spring's magic
 */
public interface ContratoDAO extends CrudRepository<ContratoDTO, Integer> {
}
