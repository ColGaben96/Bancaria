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
    private int idTituloAcademico;
    private String nombre_titulo;
    private Date fecha_expedicion;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "tipo_titulo_FK", nullable = false, updatable = false, insertable = false)
    private TipoTituloAcademicoDTO tipo_titulo;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "empleado_titular_FK", nullable = false, updatable = false, insertable = false)
    private EmpleadoDTO empleado_titular;

    public int getIdTituloAcademico() {
        return idTituloAcademico;
    }

    public void setIdTituloAcademico(int id) {
        this.idTituloAcademico = id;
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
