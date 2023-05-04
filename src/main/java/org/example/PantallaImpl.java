package org.example;

public class PantallaImpl implements Pantalla {
    private final String fabricante;
    private final String modelo;
    private final double precio;
    private final int pulgadas;
    private final String resolucion;

    public PantallaImpl(String fabricante, String modelo, double precio, int pulgadas, String resolucion) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
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

    public int getPulgadas() {
        return pulgadas;
    }

    public String getResolucion() {
        return resolucion;
    }
}

