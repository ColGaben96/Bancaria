package co.edu.unbosque.model.persistence;

import lombok.Data;

@Data
public class PrestamoDTO {
    private int id;
    private int num_prestamo;
    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
