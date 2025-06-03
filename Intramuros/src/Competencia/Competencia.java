package Competencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Interface.ITorneo;
import Jugadores.Participante;
import Jugadores.TipoParticipante;


public abstract class Competencia implements ITorneo{

    private List<Participante> competidores = new ArrayList<>();
    private  EstadoCompetencia estadoCompetencia;


    public Competencia() {
    }

    public Competencia(List<Participante> competidores, EstadoCompetencia estadoCompetencia) {
        this.competidores = competidores;
        this.estadoCompetencia = estadoCompetencia;
    }


    public List<Participante> getCompetidores() {
        return competidores;
    }

    public void setCompetidores(List<Participante> competidores) {
        this.competidores = competidores;
    }

    public EstadoCompetencia getEstadoCompetencia() {
        return estadoCompetencia;
    }

    public void setEstadoCompetencia(EstadoCompetencia estadoCompetencia) {
        this.estadoCompetencia = estadoCompetencia;
    }

    @Override
    public  void agregarParticipantes(Participante participante) {

        String nombre;
        List<Participante> jugadores =  new ArrayList<>();
        TipoParticipante categoria [] = TipoParticipante.values();
        int  eleccion;
        Scanner registro = new Scanner(System.in);

        System.out.println("Ingrese el nombre del participante\n");
        nombre = registro.nextLine();


        System.out.println("Seleccione el tipo de participante a registrar");
        for (int i = 0; i <categoria.length ; i++) {
            System.out.println( (i + 1) + " " + categoria[i]);
        }
        System.out.println("Selecciona una opcion → ");
        eleccion = registro.nextInt();
        registro.nextLine();
        TipoParticipante categorias = categoria[eleccion - 1];

        participante.setNombre(nombre);
        participante.setTipoJugador(categorias);

        if (categorias == TipoParticipante.EQUIPO) {
            System.out.println("Ingresa la cantidad de miembro del equipo → ");
            int cantidad = registro.nextInt();
            registro.nextLine();

            for (int i = 0; i <cantidad ; i++) {
                System.out.println("Nombre del jugador " + (i + 1) +  " → ");
                String nombreJugador = registro.nextLine();
                Participante jugador = new Participante();
                jugador.setNombre(nombreJugador);
                jugadores.add(jugador);
            }
            participante.setJugadores(jugadores);
        } else {

            jugadores.add(participante);
            participante.setJugadores(jugadores);
        }
        this.setCompetidores(jugadores);
        this.getCompetidores().add(participante);
        System.out.println("---------------------------------------------------\n");


    };

    @Override
    public  void iniciarTorneo(){
        if (competidores.isEmpty()) {
            System.out.println("No hay competidores");
            return;
        }
        estadoCompetencia  = EstadoCompetencia.EN_CURSO;
        System.out.println("Torneo iniciado ...");
    } ;

    @Override
    public abstract String determinarGanador();


    public abstract  void mostrarCompetencia();

}
