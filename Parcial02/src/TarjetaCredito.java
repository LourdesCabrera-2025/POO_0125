import java.time.LocalDate;

public abstract class TarjetaCredito implements iTarjeta{

    private String nombreTitular;
    private String numeroTerjeta;
    private double saldo;
    private LocalDate fVencimiento;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String nombreTitular, String numeroTerjeta, double saldo, LocalDate fVencimiento) {
        this.nombreTitular = nombreTitular;
        this.numeroTerjeta = numeroTerjeta;
        this.saldo = saldo;
        this.fVencimiento = fVencimiento;
    }


    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setNumeroTerjeta(String numeroTerjeta) {
        this.numeroTerjeta = numeroTerjeta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setfVencimiento(LocalDate fVencimiento) {
        this.fVencimiento = fVencimiento;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getNumeroTerjeta() {
        return numeroTerjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getfVencimiento() {
        return fVencimiento;
    }

    @Override
    public final boolean validarTarjeta() {
        return false;
    }

    @Override
    public abstract double actualizarSaldo(double montoCompra);

    @Override
    public abstract void calcularRecompensa(double montoCompra);
    @Override
    public abstract void imprimir();
}
