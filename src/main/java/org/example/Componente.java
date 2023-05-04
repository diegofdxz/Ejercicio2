package org.example;

public abstract class Componente {
    private String fabricante;
    private String modelo;
    private double precio;

    public Componente(String fabricante, String modelo, double precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
