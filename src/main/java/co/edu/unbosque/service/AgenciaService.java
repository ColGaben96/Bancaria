package co.edu.unbosque.service;

import co.edu.unbosque.model.persistence.AgenciaDTO;

import java.util.List;

public interface AgenciaService {
    public List<AgenciaDTO> listAgencias();
    public void save(AgenciaDTO agencia);
    public void delete(AgenciaDTO agencia);
    public AgenciaDTO findAgencia(AgenciaDTO agencia);
}
