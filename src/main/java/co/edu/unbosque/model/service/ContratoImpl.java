package co.edu.unbosque.model.service;

import co.edu.unbosque.model.ContratoDAO;
import co.edu.unbosque.model.persistence.ContratoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author Gabriel Blanco
 * @version 1.0
 * Implementation of ContratoService. Here is where magic literally happens.
 */
@Service
public class ContratoImpl implements ContratoService {
    @Autowired
    private ContratoDAO contrato;

    @Override
    @Transactional(readOnly = true)
    public List<ContratoDTO> listContratos() {
        return (List<ContratoDTO>) this.contrato.findAll();
    }

    @Override
    @Transactional
    public void save(ContratoDTO contrato) {
        this.contrato.save(contrato);
    }

    @Override
    @Transactional
    public void delete(ContratoDTO contrato) {
        this.contrato.delete(contrato);
    }

    @Override
    @Transactional(readOnly = true)
    public ContratoDTO findContrato(ContratoDTO contrato) {
        return this.contrato.findById(contrato.getId()).orElse(null);
    }
}
