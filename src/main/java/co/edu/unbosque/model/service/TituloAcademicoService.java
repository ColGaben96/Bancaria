package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.TituloAcademicoDTO;

import java.util.List;
/**
 * @author Gabriel Blanco
 * @version 1.0
 * This is where DAO works here pretty well
 */
public interface TituloAcademicoService {
    List<TituloAcademicoDTO> listTitulosAcademicos();
    void save(TituloAcademicoDTO titulo);
    void delete(TituloAcademicoDTO titulo);
    TituloAcademicoDTO findTituloAcademico(TituloAcademicoDTO titulo);
}
