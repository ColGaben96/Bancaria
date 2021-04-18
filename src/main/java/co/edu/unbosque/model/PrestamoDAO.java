package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.PrestamoDTO;
import org.springframework.data.repository.CrudRepository;

public interface PrestamoDAO extends CrudRepository<PrestamoDTO, Integer> {
}
