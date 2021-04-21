package co.edu.unbosque.model.service;

import co.edu.unbosque.model.SindicatoDAO;
import co.edu.unbosque.model.persistence.SindicatoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Implementation of SindicatoService. Here is where magic literally happens.
 */
@Service
public class SindicatoImpl implements SindicatoService {
    @Autowired
    private SindicatoDAO sindicato;

    @Override
    @Transactional(readOnly = true)
    public List<SindicatoDTO> listSindicato() {
        return (List<SindicatoDTO>) this.sindicato.findAll();
    }

    @Override
    @Transactional
    public void save(SindicatoDTO sindicato) {
        this.sindicato.save(sindicato);
    }

    @Override
    @Transactional
    public void delete(SindicatoDTO sindicato) {
        this.sindicato.delete(sindicato);
    }

    @Override
    @Transactional(readOnly = true)
    public SindicatoDTO findSindicato(SindicatoDTO sindicato) {
        return this.sindicato.findById(sindicato.getId()).orElse(null);
    }
}
