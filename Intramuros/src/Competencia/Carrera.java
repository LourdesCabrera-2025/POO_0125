package Competencia;

import Interface.ITorneo;

import java.util.Map;

public class Carrera extends Competencia {

    private String tipoCamino;
    private int tiempoLimite;
    private Map<String, Integer> tiempoCompetidores;


    public Carrera() {
    }

    public Carrera(String tipoCamino, int tiempoLimite, Map<String, Integer> tiempoCompetidores) {
        this.tipoCamino = tipoCamino;
        this.tiempoLimite = tiempoLimite;
        this.tiempoCompetidores = tiempoCompetidores;
    }

    public String getTipoCamino() {
        return tipoCamino;
    }

    public void setTipoCamino(String tipoCamino) {
        this.tipoCamino = tipoCamino;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }

    public void setTiempoLimite(int tiempoLimite) {
        this.tiempoLimite = tiempoLimite;
    }

    public Map<String, Integer> getTiempoCompetidores() {
        return tiempoCompetidores;
    }

    public void setTiempoCompetidores(Map<String, Integer> tiempoCompetidores) {
        this.tiempoCompetidores = tiempoCompetidores;
    }

    @Override
    public String determinarGanador() {
        String ganador = null;
        int mejorTiempo = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : tiempoCompetidores.entrySet()) {
            String equipo = entry.getKey();
            int tiempo = entry.getValue();


            if (tiempo <= tiempoLimite && tiempo < mejorTiempo) {
                mejorTiempo = tiempo;
                ganador  = equipo;
            }
        }

        if (ganador != null) {
            return "🏁 El equipo ganador es: " + ganador + " con un tiempo de " + mejorTiempo + " segundos.";
        } else {
            return "⛔ Ningún equipo completó la carrera dentro del tiempo límite.";
        }

    }

    @Override
    public void mostrarCompetencia() {

    }
}
