package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * DTO Class for academic titles type. This class is meant to work with the database. Also this will be the master class for this table as it is specified.
 */
@Entity
@Data
@Table(name = "tipotituloacademico")
public class TipoTituloAcademicoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 420202101L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoTitulo;
    private String nombre_tipotitulo;

    public int getIdTipoTitulo() {
        return idTipoTitulo;
    }

    public void setIdTipoTitulo(int id) {
        this.idTipoTitulo = id;
    }

    public String getNombre_tipotitulo() {
        return nombre_tipotitulo;
    }

    public void setNombre_tipotitulo(String nombre_tipotitulo) {
        this.nombre_tipotitulo = nombre_tipotitulo;
    }
}
