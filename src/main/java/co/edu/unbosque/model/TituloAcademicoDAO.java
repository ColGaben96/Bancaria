package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.TituloAcademicoDTO;
import org.springframework.data.repository.CrudRepository;

public interface TituloAcademicoDAO extends CrudRepository<TituloAcademicoDTO, Integer> {
}
