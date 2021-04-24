package co.edu.unbosque.model.persistence;

import lombok.Data;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

/**
 * @author Gabriel Blanco
 * @version 1.0
 * DTO Class for employee. This class is meant to work with the database. Also this will be the master class for this table as it is specified.
 */
@Entity
@Data
@Table(name = "empleado")
public class EmpleadoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID=416202102L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    private String numID;
    private String nombres;
    private String apellidos;
    private String ciudad_residencia;
    private int role;
    private String cod_empleado;
    private String contrasena;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private ContratoDTO tipo_contrato_FK;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private AgenciaDTO agencia_asignada_FK;
    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", nullable = false, updatable = false, insertable = false)
    private SindicatoDTO afiliado_sindicato_FK;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int id) {
        this.idEmpleado = id;
    }

    public String getNumID() {
        return numID;
    }

    public void setNumID(String numID) {
        this.numID = numID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad_residencia() {
        return ciudad_residencia;
    }

    public void setCiudad_residencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getCod_empleado() {
        return cod_empleado;
    }

    public void setCod_empleado(String cod_empleado) {
        this.cod_empleado = cod_empleado;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ContratoDTO getTipo_contrato() {
        return tipo_contrato_FK;
    }

    public void setTipo_contrato(ContratoDTO tipo_contrato) {
        this.tipo_contrato_FK = tipo_contrato;
    }

    public AgenciaDTO getAgencia_asignada() {
        return agencia_asignada_FK;
    }

    public void setAgencia_asignada(AgenciaDTO agencia_asignada) {
        this.agencia_asignada_FK = agencia_asignada;
    }

    public SindicatoDTO getAfiliado_sindicato() {
        return afiliado_sindicato_FK;
    }

    public void setAfiliado_sindicato(SindicatoDTO afiliado_sindicato) {
        this.afiliado_sindicato_FK = afiliado_sindicato;
    }
}


