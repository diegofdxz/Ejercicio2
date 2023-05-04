package org.example;
public abstract class ComponenteSalida extends Componente {
    private int[] puertosValidos;

    public ComponenteSalida(String fabricante, String modelo, double precio, int[] puertosValidos) {
        super(fabricante, modelo, precio);
        this.puertosValidos = puertosValidos;
    }

    public int[] getPuertosValidos() {
        return puertosValidos;
    }
}
