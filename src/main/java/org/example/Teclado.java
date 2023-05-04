package org.example;

class Teclado implements DispositivoEntrada {
    private String fabricante;
    private String modelo;
    private double precio;
    private String tipoConector;
    private int[] puertosValidos;

    public Teclado(String fabricante, String modelo, double precio, String tipoConector, int[] puertosValidos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoConector = tipoConector;
        this.puertosValidos = puertosValidos;
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

    public String getTipoConector() {
        return tipoConector;
    }

    public int[] getPuertosValidos() {
        return puertosValidos;
    }
}