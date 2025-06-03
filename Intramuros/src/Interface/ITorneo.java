package Interface;

import Jugadores.Participante;

public interface ITorneo {
    void agregarParticipantes(Participante p);

    void iniciarTorneo();

    String determinarGanador();
}
