package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * DTO Class for syndicates. This class is meant to work with the database. Also this will be the master class for this table as it is specified.
 */
@Entity
@Data
@Table(name="sindicato")
public class SindicatoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 4202021014L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero_afiliacion;
    private double valor_cuota;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_afiliacion() {
        return numero_afiliacion;
    }

    public void setNumero_afiliacion(int numero_afiliacion) {
        this.numero_afiliacion = numero_afiliacion;
    }

    public double getValor_cuota() {
        return valor_cuota;
    }

    public void setValor_cuota(double valor_cuota) {
        this.valor_cuota = valor_cuota;
    }
}
