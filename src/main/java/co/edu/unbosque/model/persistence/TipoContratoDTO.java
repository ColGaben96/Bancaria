package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * DTO Class for contract types. This class is meant to work with the database. Also this will be the master class for this table as it is specified.
 */

@Entity
@Data
@Table(name = "tipocontrato")
public class TipoContratoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 4202021012L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoContrato;
    private String nombre_tipo;

    public int getIdTipoContrato() {
        return idTipoContrato;
    }

    public void setIdTipoContrato(int id) {
        this.idTipoContrato = id;
    }

    public String getNombre_tipo() {
        return nombre_tipo;
    }

    public void setNombre_tipo(String nombre_tipo) {
        this.nombre_tipo = nombre_tipo;
    }
}
