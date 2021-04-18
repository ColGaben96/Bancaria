package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * DTO Class for academic titles. This class is meant to work with the database. Also this will be the master class for this table as it is specified.
 */
@Entity
@Data
@Table(name="tituloacademico")
public class TituloAcademicoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID=416202104L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipo_titulo;
    private String nombre_titulo;
    private Date fecha_expedicion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_titulo() {
        return tipo_titulo;
    }

    public void setTipo_titulo(String tipo_titulo) {
        this.tipo_titulo = tipo_titulo;
    }

    public String getNombre_titulo() {
        return nombre_titulo;
    }

    public void setNombre_titulo(String nombre_titulo) {
        this.nombre_titulo = nombre_titulo;
    }

    public Date getFecha_expedicion() {
        return fecha_expedicion;
    }

    public void setFecha_expedicion(Date fecha_expedicion) {
        this.fecha_expedicion = fecha_expedicion;
    }
}
