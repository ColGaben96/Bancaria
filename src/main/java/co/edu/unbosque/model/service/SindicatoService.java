package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.SindicatoDTO;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * This is where DAO works here pretty well
 */
public interface SindicatoService {
    List<SindicatoDTO> listSindicato();
    void save(SindicatoDTO sindicato);
    void delete(SindicatoDTO sindicato);
    SindicatoDTO findSindicato(SindicatoDTO sindicato);
}
