import java.time.LocalDate;

public class TarjetaDescuento  extends TarjetaCredito{

    private int puntosAcumulados;

    public  TarjetaDescuento() {
    }
    public TarjetaDescuento(String nombreTitular, String numeroTerjeta, double saldo, LocalDate fVencimiento, int puntosAcumulados) {
        super(nombreTitular, numeroTerjeta, saldo, fVencimiento);
        this.puntosAcumulados = puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }


    @Override
    public double actualizarSaldo(double montoCompra) {
        return 0;
    }

    @Override
    public void calcularRecompensa(double montoCompra) {

    }

    @Override
    public void imprimir() {

    }
}
