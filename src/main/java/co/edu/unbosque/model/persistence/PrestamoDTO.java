package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * DTO Class for loans. This class is meant to work with the database. Also this will be the master class for this table as it is specified.
 */
@Entity
@Data
@Table(name="prestamo")
public class PrestamoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID=416202103L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPrestamo;
    private int num_prestamo;
    private double valor;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idEmpleado", nullable = false, updatable = false, insertable = false)
    private EmpleadoDTO empleado_responsable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getNum_prestamo() {
        return num_prestamo;
    }

    public void setNum_prestamo(int num_prestamo) {
        this.num_prestamo = num_prestamo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EmpleadoDTO getEmpleado_responsable() {
        return empleado_responsable;
    }

    public void setEmpleado_responsable(EmpleadoDTO empleado_responsable) {
        this.empleado_responsable = empleado_responsable;
    }
}
