package co.edu.unbosque.model.service;

import co.edu.unbosque.model.TipoContratoDAO;
import co.edu.unbosque.model.persistence.TipoContratoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Gabriel Blanco
 * @version 1.0
 * Implementation of TipoContratoService. Here is where magic literally happens.
 */
@Service
public class TipoContratoImpl implements TipoContratoService {

    @Autowired
    private TipoContratoDAO tipocontrato;

    @Override
    public List<TipoContratoDTO> listTipoContrato() {
        return (List<TipoContratoDTO>) this.tipocontrato.findAll();
    }

    @Override
    public void save(TipoContratoDTO tipocontrato) {
        this.tipocontrato.save(tipocontrato);
    }

    @Override
    public void delete(TipoContratoDTO tipocontrato) {
        this.tipocontrato.delete(tipocontrato);
    }

    @Override
    public TipoContratoDTO findTipoContrato(TipoContratoDTO tipocontrato) {
        return this.tipocontrato.findById(tipocontrato.getIdTipoContrato()).orElse(null);
    }
}
