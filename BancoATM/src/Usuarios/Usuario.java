package Usuarios;

import com.sun.tools.javac.Main;

import java.awt.*;

/**
 * @author LourdesCabrera-2025
 * Usuarios. Usuario: en esta clase se guardan los atributos, métodos
 */
public class Usuario {

    /**
     * Atributos del usuario como:
     * nombre(String),
     * id_usuario (String),
     * pin(String) ,
     * saldo(double),
     * cuenta (String)
     */

    private String nickname; // Variable que guarda el nombre de usuario
    private String id_Usuario; // Variable que guarda el id de cada cuenta de usuario
    private String pin; // Variable que guarda el codigo secreto de cada cuenta de usuario
    private double saldo; // Variable que almacena el saldo que el cliente, mantiene en la cuenta
    private String cuenta; // Variable que permite visualizar la cuenta del usuario


    /**
     * Constructor vacío: Sirve para crear una instancia de una clase cuando no se necesita inicializar ningún atributo
     * con valores específicos al momento de la creación del objeto.
     */

    public Usuario() {
    }

    /**
     * Constructor con parámetros: Se utiliza para inicializar todos los atributos (variables) de una clase con valores
     * específicos proporcionados al momento de crear yn objeto de la clase
     */

    public Usuario(String nickname, String id_Usuario, String pin, double saldo, String cuenta) {
        this.nickname = nickname;
        this.id_Usuario = id_Usuario;
        this.pin = pin;
        this.saldo = saldo;
        this.cuenta = cuenta;
    }

    /**
     * Getter's & Setter's
     */
    /**
     * @param nickname Parámetro utilizado para guardar el nombre del usuario que crea una cuenta o inicia sesión en su cuenta
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @param id_Usuario Parámetro que guarda el identificador de usuario que cada cliente tiene en el sistema
     */

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    /**
     * @param pin Parámetro que guarda el pin de la cuenta del usuario que le permite acceder, retirar y realizar transacciones
     */

    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @param saldo Parámetro utilizado para reservar la cantidad monetaria que desea guardar el cliente en su cuenta bancaria
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @param cuenta Parámetro que le permite al usuario visualizar la cuenta que tiene el usuario
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    // Getter's

    /**
     * @return nickname
     * retorna los datos del nombre de usuario
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * @return id_usuario
     * retorna el dato que se guarda en el id del cliente
     */

    public String getId_Usuario() {
        return id_Usuario;
    }

    /**
     * @return pin
     * retorna el valor del pin que tiene el usuario guardado en su cuenta
     */

    public String getPin() {
        return pin;
    }

    /**
     * @return saldo
     * retorna el valor monetario que se guarda en el atributo de saldo de la cuenta
     */

    public double getSaldo() {
        return saldo;
    }

    /**
     * @return cuenta
     * retorna todos los posibles detalles que describen a la cuenta del usuario
     */

    public String getCuenta() {
        return cuenta;
    }


    public boolean Autenticarse (String pin)
    {
        try {
            if (getPin().equals(pin)) {
                System.out.println("Ingreso válido del pin.....Bienvenido al sistema →" + getId_Usuario());
                return true;
            } else {
                System.out.println("Error al ingresar pin...");
               return false;
            }
        } catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    public void ConsultarSaldo() {

        System.out.println("Su saldo es de : " + getSaldo());
    }


}
