package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.TipoContratoDTO;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * This is where DAO works here pretty well
 */

public interface TipoContratoService {
    List<TipoContratoDTO> listTipoContrato();
    void save(TipoContratoDTO tipocontrato);
    void delete(TipoContratoDTO tipocontrato);
    TipoContratoDTO findTipoContrato(TipoContratoDTO tipocontrato);
}
