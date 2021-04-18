package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.AgenciaDTO;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * This is where DAO works here pretty well
 */
public interface AgenciaService {
    List<AgenciaDTO> listAgencias();
    void save(AgenciaDTO agencia);
    void delete(AgenciaDTO agencia);
    AgenciaDTO findAgencia(AgenciaDTO agencia);
}
