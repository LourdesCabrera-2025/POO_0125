package Jugadores;


import java.util.ArrayList;
import java.util.List;

public class Participante {
    private String nombre;
    private TipoParticipante tipoJugador;
    private List<Participante> jugadores = new ArrayList<>();


    public Participante() {
    }

    public Participante(String nombre, TipoParticipante tipoJugador, List<Participante> jugadores) {
        this.nombre = nombre;
        this.tipoJugador = tipoJugador;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoParticipante getTipoJugador() {
        return tipoJugador;
    }

    public void setTipoJugador(TipoParticipante tipoJugador) {
        this.tipoJugador = tipoJugador;
    }

    public List<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Participante> jugadores) {
        this.jugadores = jugadores;
    }


    public void imprimir() {


        if (this.getTipoJugador() == TipoParticipante.INDIVIDUAL) {

            for (int i = 0; i < getJugadores().size() ; i++) {

                System.out.println((i + 1) + "Nombre Jugador : " + getJugadores().get(i).getNombre()  + " ( " + getTipoJugador() + ") " )  ;
            }
        } else {

            System.out.println("Juegan en formato → " + this.getTipoJugador());

            for (int i = 0; i < getJugadores().size(); i++) {
                System.out.println("Jugador "+(i + 1) + " : " +  getJugadores().get(i).getNombre());
            }
        }


    }
}
