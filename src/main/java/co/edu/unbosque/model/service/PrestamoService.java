package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.PrestamoDTO;

import java.util.List;
/**
 * @author Gabriel Blanco
 * @version 1.0
 * This is where DAO works here pretty well
 */
public interface PrestamoService {
    List<PrestamoDTO> listPrestamos();
    void save(PrestamoDTO prestamo);
    void delete(PrestamoDTO prestamo);
    PrestamoDTO findPrestamo(PrestamoDTO prestamo);
}
