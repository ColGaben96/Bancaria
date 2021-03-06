package co.edu.unbosque.model.service;

import co.edu.unbosque.model.AgenciaDAO;
import co.edu.unbosque.model.persistence.AgenciaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Implementation of AgenciaService. Here is where magic literally happens.
 */
@Service
public class AgenciaImpl implements AgenciaService {

    @Autowired
    private AgenciaDAO agencia;

    @Override
    @Transactional(readOnly = true)
    public List<AgenciaDTO> listAgencias() {
        return (List<AgenciaDTO>) this.agencia.findAll();
    }

    @Override
    @Transactional
    public void save(AgenciaDTO agencia) {
        this.agencia.save(agencia);
    }

    @Override
    @Transactional
    public void delete(AgenciaDTO agencia) {
        this.agencia.delete(agencia);
    }

    @Override
    @Transactional(readOnly = true)
    public AgenciaDTO findAgencia(AgenciaDTO agencia) {
        return this.agencia.findById(agencia.getIdAgencia()).orElse(null);
    }
}
