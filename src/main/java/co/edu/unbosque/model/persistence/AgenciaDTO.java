package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author Gabriel Blanco
 * @version 1.0
 *
 * DTO Class for agencies. This class is meant to work with the database. Also this will be the master class for this table as it is specified.
 */
@Entity
@Data
@Table(name="agencia")
public class AgenciaDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 41520210101L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idAgencia;
    private String nombre_punto;
    private String direccion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_punto() {
        return nombre_punto;
    }

    public void setNombre_punto(String nombre_punto) {
        this.nombre_punto = nombre_punto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
