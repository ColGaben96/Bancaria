package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.TipoTituloAcademicoDTO;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * This is where DAO works here pretty well
 */

public interface TipoTituloAcademicoService {
    List<TipoTituloAcademicoDTO> listTipoTitulosAcademicos();
    void save(TipoTituloAcademicoDTO tipotituloacademico);
    void delete(TipoTituloAcademicoDTO tipotituloacademico);
    TipoTituloAcademicoDTO findTipoTituloAcademico(TipoTituloAcademicoDTO tipotituloacademico);
}
