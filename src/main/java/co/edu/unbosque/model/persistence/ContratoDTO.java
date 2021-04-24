package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * DTO Class for contract. This class is meant to work with the database. Also this will be the master class for this table as it is specified.
 */
@Entity
@Data
@Table(name = "contrato")
public class ContratoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 4202021013L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;
    private String nombre_puesto;
    private double sueldo;
    private double valor_hora_extra;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private TipoContratoDTO tipo_contrato_FK;

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int id) {
        this.idContrato = id;
    }

    public String getNombre_puesto() {
        return nombre_puesto;
    }

    public void setNombre_puesto(String nombre_puesto) {
        this.nombre_puesto = nombre_puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getValor_hora_extra() {
        return valor_hora_extra;
    }

    public void setValor_hora_extra(double valor_hora_extra) {
        this.valor_hora_extra = valor_hora_extra;
    }

    public TipoContratoDTO getTipo_contrato() {
        return tipo_contrato_FK;
    }

    public void setTipo_contrato(TipoContratoDTO tipo_contrato) {
        this.tipo_contrato_FK = tipo_contrato;
    }
}


