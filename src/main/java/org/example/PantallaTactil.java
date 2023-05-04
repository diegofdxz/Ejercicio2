package org.example;

public class PantallaTactil implements DispositivoEntrada, DispositivoSalida {
    private String fabricante;
    private String modelo;
    private double precio;
    private String tipoConector;
    private List<Integer> puertosValidos;

    public PantallaTactil(String fabricante, String modelo, double precio, String tipoConector, List<Integer> puertosValidos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoConector = tipoConector;
        this.puertosValidos = puertosValidos;
    }

    // Implementación de los métodos de DispositivoEntrada
    @Override
    public String getTipoConector() {
        return tipoConector;
    }

    @Override
    public List<Integer> getPuertosValidos() {
        return puertosValidos;
    }

    // Implementación de los métodos de DispositivoSalida
    @Override
    public void imprimir(String texto) {
        System.out.println("No se puede imprimir desde una pantalla táctil");
    }

    @Override
    public void mostrarImagen(String ruta) {
        System.out.println("Mostrando imagen " + ruta + " en la pantalla táctil");
    }

    // Métodos de acceso
    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
}