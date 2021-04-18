package co.edu.unbosque.model.service;

import co.edu.unbosque.model.TituloAcademicoDAO;
import co.edu.unbosque.model.persistence.TituloAcademicoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class TituloAcademicoImpl implements TituloAcademicoService {

    @Autowired
    private TituloAcademicoDAO titulo;

    @Override
    @Transactional(readOnly = true)
    public List<TituloAcademicoDTO> listTitulosAcademicos() {
        return (List<TituloAcademicoDTO>) this.titulo.findAll();
    }

    @Override
    public void save(TituloAcademicoDTO titulo) {
        this.titulo.save(titulo);
    }

    @Override
    public void delete(TituloAcademicoDTO titulo) {
        this.titulo.delete(titulo);
    }

    @Override
    @Transactional(readOnly = true)
    public TituloAcademicoDTO findTituloAcademico(TituloAcademicoDTO titulo) {
        return this.titulo.findById(titulo.getId()).orElse(null);
    }
}
