package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.TituloAcademicoDTO;

import java.util.List;

public interface TituloAcademicoService {
    List<TituloAcademicoDTO> listTitulosAcademicos();
    void save(TituloAcademicoDTO titulo);
    void delete(TituloAcademicoDTO titulo);
    TituloAcademicoDTO findTituloAcademico(TituloAcademicoDTO titulo);
}
