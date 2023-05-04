import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    private UnidadCentral unidadCentral;
    private List<DispositivoEntrada> dispositivosEntrada;
    private List<DispositivoSalida> dispositivosSalida;

    public Ordenador(UnidadCentral unidadCentral, List<DispositivoEntrada> dispositivosEntrada, List<DispositivoSalida> dispositivosSalida) {
        this.unidadCentral = unidadCentral;
        this.dispositivosEntrada = dispositivosEntrada;
        this.dispositivosSalida = dispositivosSalida;
    }

    public double calcularPrecio() {
        double precioTotal = unidadCentral.getPrecio();

        for (DispositivoEntrada dispositivoEntrada : dispositivosEntrada) {
            precioTotal += dispositivoEntrada.getPrecio();
        }

        for (DispositivoSalida dispositivoSalida : dispositivosSalida) {
            precioTotal += dispositivoSalida.getPrecio();
        }

        return precioTotal;
    }

    // Métodos de acceso
    public UnidadCentral getUnidadCentral() {
        return unidadCentral;
    }

    public List<DispositivoEntrada> getDispositivosEntrada() {
        return dispositivosEntrada;
    }

    public List<DispositivoSalida> getDispositivosSalida() {
        return dispositivosSalida;
    }
}