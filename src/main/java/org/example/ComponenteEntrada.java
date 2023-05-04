package org.example;
interface DispositivoEntrada extends Componente {
    String getTipoConector();
    int[] getPuertosValidos();
}