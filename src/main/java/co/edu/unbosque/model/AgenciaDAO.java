package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AgenciaDTO;
import org.springframework.data.repository.CrudRepository;

public interface AgenciaDAO extends CrudRepository<AgenciaDTO, Integer> {

}
