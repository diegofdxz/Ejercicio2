package org.example;

public interface Impresora extends DispositivoSalida {
    String getTipoCartucho();
    int getPaginasDesdeUltimoCambio();
}

