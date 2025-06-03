import Competencia.Carrera;
import Competencia.Competencia;
import Competencia.Partido;
import Competencia.EstadoCompetencia;
import Jugadores.Participante;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Declaración de Objetos ↓
         *  1. participantes
         *  2. carreras
         */
        Participante participante = new Participante();
        Partido partido = new Partido();
        Carrera carreras = new Carrera();
        /**
         * Declaración de clases ↓
         * 1. EstadoCompetencia
         */

        EstadoCompetencia status;

        /**
         * Declaración de variables
         */
        int opcion, tiempoLimite, goles, cantidad, grupos, seleccionEquipo;
        String tipoCamino, arbitro, equipo;
        Map<String, Integer> tiempoCompetidores = new HashMap<String, Integer>();
        Map<String, Integer> golesEquipo = new HashMap<String, Integer>();
        ArrayList<String> equipos = new ArrayList<>();
        ArrayList<String> carreras_grupo = new ArrayList<>();
        Scanner seleccion = new Scanner(System.in);


        try {
            do {
                System.out.println("BIENBENIDOS A LAS COMPETENCIAS INTERNACIONALES\n");
                System.out.println("1. Iniciar torneo \n");
                System.out.println("2. Registrar Participantes\n");
                System.out.println("3. Ver jugadores\n");
                System.out.println("4. Generar partido\n");
                System.out.println("5  generar carrera\n");
                System.out.println("6  mostrar competencia\n");
                System.out.println("7 Salir\n");
                System.out.println("---------------------------");
                System.out.println("Opcion → ");
                opcion = seleccion.nextInt();

                switch (opcion) {

                    case 1:
                        carreras.iniciarTorneo();
                        break;

                    case 2:

                        carreras.agregarParticipantes(participante);
                        break;

                    case 3:

                        participante.imprimir();
                        break;

                    case 4:

                        seleccion.nextLine();
                        System.out.println("Ingrese el nombre del arbitro encargado del partido → ");
                        arbitro = seleccion.nextLine();
                        partido.setArbitro(arbitro);

                        golesEquipo.clear();
                        System.out.println("Ingrese la cantidad de grupos a participar → ");
                        cantidad = seleccion.nextInt();

                        for (int i = 0; i <cantidad ; i++) {
                            seleccion.nextLine();
                            System.out.println("Registre el nombre de su equipo → ");
                            equipo = seleccion.nextLine();
                            System.out.println("Ingrese el total de goles anotados por " + equipo + " → ");
                            goles = seleccion.nextInt();
                            seleccion.nextLine();
                            golesEquipo.put(equipo, goles);
                            equipos.add(equipo);

                        }
                        partido.setGolesEquipo(golesEquipo);
                        System.out.println("Partido generado correctamente");
                        break;

                    case 5:

                        seleccion.nextLine();

                        System.out.println("Cuantos equipos participaran en la carrera ? ");
                        cantidad = seleccion.nextInt();

                        seleccion.nextLine();
                        if (equipos.isEmpty()) {

                            System.out.println("No hay equipos registrados aun");
                        } 
                        
                        System.out.println("Grupos disponibles : ");
                        for (int i = 0; i <equipos.size() ; i++) {
                            System.out.println((i+1) +  ". " + equipos.get(i) );
                        }

                        System.out.println("Seleccione los grupos que participaran en la carrera ");
                        for (int i = 0; i <cantidad ; i++) {
                            System.out.println("seleccione el numero de equipo # → ");
                            seleccionEquipo = seleccion.nextInt();
                            seleccion.nextLine();
                            if (seleccionEquipo >= 1 && seleccionEquipo <= equipos.size()) {
                                carreras_grupo.add(equipos.get(seleccionEquipo - 1));
                            } else {
                                System.out.println("Seleccion invalida. intente de nuevo");
                                i--;
                            }
                        }

                        seleccion.nextLine();
                        System.out.println("Seleccióne el tipo de terreno para la carrera ↓ ");
                        System.out.println("1. Asfalto \n " +
                                "2. Grama \n " +
                                "3. Sendero");
                        System.out.println("----------------------------------------------------");
                        System.out.println("Selecciona el tipo de camino → ");
                        tipoCamino = seleccion.nextLine();
                        carreras.setTipoCamino(tipoCamino);
                        for (String grupo : carreras_grupo) {
                            System.out.println("Registre el tiempo limite de la carrera → ");
                            tiempoLimite = seleccion.nextInt();
                            seleccion.nextLine();

                            tiempoCompetidores.put(grupo, tiempoLimite);

                        }

                        carreras.setTiempoCompetidores(tiempoCompetidores);

                        System.out.println("Carrera generada exitosamente");

                        break;

                    case 6:
                            System.out.println(partido.determinarGanador());
                            System.out.println(carreras.determinarGanador());
                        break;

                    case 7:

                        break;

                    default:
                        System.out.println("la opcion ingresada es invalida , por favor intente nuevamente");
                        break;

                }
            } while (opcion != 5);

        } catch (Exception e) {

            System.out.println("Error → " + e.getMessage());
        }


    }
}