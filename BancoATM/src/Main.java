/**
 * @author LourdesCabrera-2025
 * --------------------------------------
 * @since miércoles, 23 de abril de 2025
 */
//---------------------------------------

import java.util.Scanner;

/**
 * @version 1.0.0
 */
public class Main {
    /**
     * @param args Función en la que se realizan todos los intercambios de operaciones entre clase, principalmente funciona como
     *             una clase de envío de datos y el recibimiento de ellos por parte de otras funciones.
     */
    public static void main(String[] args) {

        // Bienvenida: Se realiza una pequeña bienvenida al usuario indicando el tipo de programa que estará utilizando
        /**
         * Datos -> selección , es un dato que permitirá almacenará
         */
        int seleccion;
        Scanner accion = new Scanner(System.in);

        System.out.println("$$$$ Bienvenido a tu ATM Online $$$$ ");
        System.out.println("----------------------------------");
        System.out.println("1. Ingresar a mi cuenta \n" +
                "2. Crear cuenta de banco");
        System.out.println("----------------------------------");
        System.out.println("Seleccione una accion → ");
        seleccion = accion.nextInt();

    }
}