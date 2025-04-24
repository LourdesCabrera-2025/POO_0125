/**
 * @author LourdesCabrera-2025
 * --------------------------------------
 * @since miércoles, 23 de abril de 2025
 */
//---------------------------------------

import Usuarios.Usuario;

import java.awt.*;
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
        String nickname, pin, cuenta;
        double saldo;
        Scanner accion = new Scanner(System.in);
        Usuario usuarios = new Usuario();

        while (true) {

            try {
                do {
                    System.out.println("$$$$ Bienvenido a tu ATM Online $$$$ ");
                    System.out.println("----------------------------------");
                    System.out.println("1. Ingresar a mi cuenta \n" +
                            "2. Crear cuenta de banco");
                    System.out.println("----------------------------------");
                    System.out.println("Seleccione una accion → ");
                    seleccion = accion.nextInt();

                    switch (seleccion) {

                        case 1:
                            while (true) {
                                do {
                                    accion.nextLine();
                                    System.out.println("Ingrese su pin → ");
                                    pin = accion.next();

                                } while (!usuarios.Autenticarse(pin));
                                Menu();
                                break;


                            }

                            break;
                        case 2:
                            accion.nextLine(); // Limpiar buffer
                            System.out.println("♥♥ Gracias por tu preferencia, por favor registra tu usuario en nuestro sistema");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("Por favor ingresa tu nickname → ");
                            nickname = accion.nextLine();
                            usuarios.setNickname(nickname);
                            System.out.println("Por favor toma nota de tu ID : ");
                            String base = nickname.length() >= 3 ? nickname.substring(0, 3).toLowerCase() : nickname.toLowerCase();
                            int numero = (int) (Math.random() * 90000) + 10000;
                            String idGenerado = base + numero;
                            usuarios.setId_Usuario(idGenerado);
                            System.out.println("ID Usuario → " + usuarios.getId_Usuario());
                            System.out.println("Por favor toma nota de tu Pin: ");
                            String pinCuenta = String.valueOf((int) (Math.random() * 90000) + 10000);
                            usuarios.setPin(pinCuenta);
                            System.out.println("Pin secreto → " + usuarios.getPin());
                            System.out.println("Por favor ingresa el monto a depositar → ");
                            saldo = accion.nextDouble();
                            usuarios.setSaldo(saldo);
                            accion.nextLine();
                            System.out.println("Generando numero de cuenta → ");
                            long numerocuenta = (long) (Math.random() * 1_000_000_000_000L);
                            usuarios.setCuenta(String.valueOf(String.format("%012d", numerocuenta)));
                            System.out.println("N° Cuenta bancaria → " + usuarios.getCuenta());
                            System.out.println("---------------------------------------------------");
                            break;
                        default:
                            System.out.println("Seleccion de menu invalida, por favor selecciona algo valido");
                            break;
                    }
                } while (seleccion != 1 && seleccion != 2);
            } catch (Exception e) {
                System.out.println("Error : " + e.getMessage());
                accion.nextLine();
            }
        }
    }

    public static void Menu() {

        // Main despues del logeo
    }

}