public interface iTarjeta {
     boolean validarTarjeta();
     double actualizarSaldo(double montoCompra);
     void calcularRecompensa(double montoCompra);
     void imprimir();
}
