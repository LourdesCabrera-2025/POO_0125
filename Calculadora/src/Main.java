
import java.util.Scanner;

/**
 *
 */
public class Main {

    /**
     * @param args
     */

    public static void main(String[] args) {

        /**
         *
         */
        Conversiones conversiones = new Conversiones();
        /**
         *
         */
        /**
         *
         */
        int seleccion;
        double longitud, temperatura;
        int datos;
        boolean salir= false;
        Scanner scanner = new Scanner(System.in);

        /**
         *
         */
        while (!salir) {
            /**
             *
             */

            try {
                /**
                 *
                 */

                do {
                    /**
                     *
                     */

                    System.out.println("Bienvenidos a su convertidor online \n " +
                            "1. cm → inch \n" +
                            "2. inch → cm \n" +
                            "3. F° → C° \n" +
                            "4. C° → F° \n" +
                            "5. GB → MB \n" +
                            "6. Salir");

                    System.out.println("Realize su eleccion : ");
                    seleccion = scanner.nextInt();
                    conversiones.setSeleccion(seleccion);

                    /**
                     *
                     */
                    switch (seleccion) {
                        case 1:
                            System.out.println("Ingresa el valor a convertir -> ");
                            longitud = scanner.nextDouble();
                            conversiones.setLongitud(longitud);
                            System.out.println("La respuesta a la conversión de cm → inch  es : " + conversiones.PulgadaCentimetro() + " inch");
                            break;
                        case 2:
                            System.out.println("Ingresa el valor a convertir -> ");
                            longitud = scanner.nextDouble();
                            conversiones.setLongitud(longitud);
                            System.out.println("La respuesta a la conversion de inch -> cm es : " + conversiones.PulgadaCentimetro() + " cm") ;
                            break;
                        case 3:
                            System.out.println("Ingresa el valor a convertir -> ");
                            temperatura = scanner.nextDouble();
                            conversiones.setTemperatura(temperatura);
                            System.out.println("La respuesta a la conversion de F° -> C° es : " + conversiones.FahrenheitCelcius() + " C° ");
                            break;
                        case 4:
                            System.out.println("Ingrese el valor a convertir -> ");
                            temperatura = scanner.nextDouble();
                            conversiones.setTemperatura(temperatura);
                            System.out.println("La respuesta a la conversion de C° -> F° es : " + conversiones.FahrenheitCelcius() + " F° ");
                            break;
                        case 5:
                            System.out.println("Ingrese el valor a convertir -> ");
                            datos = scanner.nextInt();
                            conversiones.setDatos(datos);
                            System.out.println("La respuesta a la conversion de GB -> MB : " + conversiones.GigabyteMegas() + " MB");


                            break;
                        case 6:
                            System.out.println("Saliendo");
                            salir = true;
                            break;
                    }

                } while (seleccion != 6);

            } catch (Exception e) {
                System.out.println("Error -> " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}