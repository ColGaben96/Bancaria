package co.edu.unbosque.model.service;

import co.edu.unbosque.model.TipoTituloAcademicoDAO;
import co.edu.unbosque.model.persistence.TipoTituloAcademicoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Implementation of TipoContratoService. Here is where magic literally happens.
 */

@Service
public class TipoTituloAcademicoImpl implements TipoTituloAcademicoService {

    @Autowired
    private TipoTituloAcademicoDAO tipotituloacademico;

    @Override
    public List<TipoTituloAcademicoDTO> listTipoTitulosAcademicos() {
        return (List<TipoTituloAcademicoDTO>) this.tipotituloacademico.findAll();
    }

    @Override
    public void save(TipoTituloAcademicoDTO tipotituloacademico) {
        this.tipotituloacademico.save(tipotituloacademico);
    }

    @Override
    public void delete(TipoTituloAcademicoDTO tipotituloacademico) {
        this.tipotituloacademico.delete(tipotituloacademico);
    }

    @Override
    public TipoTituloAcademicoDTO findTipoTituloAcademico(TipoTituloAcademicoDTO tipotituloacademico) {
        return this.tipotituloacademico.findById(tipotituloacademico.getIdTipoTiulo()).orElse(null);
    }
}
