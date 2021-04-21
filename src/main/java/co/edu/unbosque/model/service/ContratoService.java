package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.ContratoDTO;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * This is where DAO works here pretty well
 */

public interface ContratoService {
    List<ContratoDTO> listContratos();
    void save(ContratoDTO contrato);
    void delete(ContratoDTO contrato);
    ContratoDTO findContrato(ContratoDTO contrato);
}
