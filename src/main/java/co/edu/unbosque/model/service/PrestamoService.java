package co.edu.unbosque.model.service;

import co.edu.unbosque.model.persistence.PrestamoDTO;

import java.util.List;

public interface PrestamoService {
    List<PrestamoDTO> listPrestamos();
    void save(PrestamoDTO prestamo);
    void delete(PrestamoDTO prestamo);
    PrestamoDTO findPrestamo(PrestamoDTO prestamo);
}
