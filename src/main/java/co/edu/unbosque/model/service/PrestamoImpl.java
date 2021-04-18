package co.edu.unbosque.model.service;

import co.edu.unbosque.model.PrestamoDAO;
import co.edu.unbosque.model.persistence.PrestamoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * Implementation of PrestamoService. Here is where magic literally happens.
 */
@Service
public class PrestamoImpl implements PrestamoService {

    @Autowired
    private PrestamoDAO prestamo;

    @Override
    @Transactional(readOnly = true)
    public List<PrestamoDTO> listPrestamos() {
        return (List<PrestamoDTO>) this.prestamo.findAll();
    }

    @Override
    @Transactional
    public void save(PrestamoDTO prestamo) {
        this.prestamo.save(prestamo);
    }

    @Override
    @Transactional
    public void delete(PrestamoDTO prestamo) {
        this.prestamo.delete(prestamo);
    }

    @Override
    @Transactional(readOnly = true)
    public PrestamoDTO findPrestamo(PrestamoDTO prestamo) {
        return this.prestamo.findById(prestamo.getId()).orElse(null);
    }
}
