/**
 * @author lourd
 * @since 16 de abril de 2025
 * Note: This class was created for to store different methods and constructors for creation
 * a program
 */

public class Conversiones {

    private double longitud; // this variable it's used by insert different length
    private double temperatura; // this variable it's used by insert different temperatures
    private int datos; // this variable it's used by insert different  size of system digital
    private int seleccion; // This variable it's used for save the selection that client prefer convert


    /**
     *  it was called constructor and normally used for passed many parameter to the different methods for they can solve
     *  the situation by construct the possible answer
     */
    public Conversiones(){}
    public Conversiones(double longitud, double temperatura, int datos, int seleccion) {
        this.longitud = longitud;
        this.temperatura = temperatura;
        this.datos = datos;
        this.seleccion = seleccion;
    }

    /**
     * @param longitud
     * This function serve for insert data relationate to length
     */

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * @param temperatura
     * This function serve for insert data relationate to temperature
     */

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @param datos
     * This function serve for insert data relationate to system digital types of data size
     */
    public void setDatos(int datos) {
        this.datos = datos;
    }

    /**
     * @return
     * the function return the require solutions of the solicitude processed
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * @return
     * the function return the require solutions of the solicitude processed
     */

    public double getTemperatura() {
        return temperatura;
    }

    /**
     * @return
     * the function return the require solutions of the solicitude processed
     */

    public int getDatos() {
        return datos;
    }

    /**
     * @param seleccion
     * this function is for input any selection that user want
     */
    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }

    /**
     * @return this function is for obtained the seleccion that user made
     */

    public int getSeleccion() {
        return seleccion;
    }

    /**
     *
     * @return
     */

    public double PulgadaCentimetro() {
        double dimension = 2.54;

        double resultado ;

        if (getSeleccion()== 1 )  {
            resultado = getLongitud() * dimension;
        } else {
            resultado = getLongitud() / dimension;
        }

        resultado = Math.round(resultado * 100) /100.0;
        return resultado;
    }

    public double FahrenheitCelcius() {
        double Grados_F = -32 * 5/9;
        double Grados_C = 5/9 + 32;

        double resultado;

        if (getTemperatura() == 3) {

            resultado = getTemperatura() - Grados_F;
        } else {

            resultado = getTemperatura() * Grados_C;
        }

        return resultado;
    }

    public int GigabyteMegas() {
        int PesoKL = 1000;

        int  resultado;

        resultado = getDatos() * PesoKL;

        return  resultado;
    }
}
