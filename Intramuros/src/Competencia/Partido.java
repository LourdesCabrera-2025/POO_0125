package Competencia;

import java.util.Map;

public class Partido  extends Competencia{
    private String arbitro;
    private Map<String ,Integer> golesEquipo;


    public Partido() {
    }

    public Partido(String arbitro, Map<String, Integer> golesEquipo) {
        this.arbitro = arbitro;
        this.golesEquipo = golesEquipo;
    }

    public String getArbitro() {
        return arbitro;
    }

    public Map<String, Integer> getGolesEquipo() {
        return golesEquipo;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public void setGolesEquipo(Map<String, Integer> golesEquipo) {
        this.golesEquipo = golesEquipo;
    }

    @Override
    public String determinarGanador() {
        if (golesEquipo == null || golesEquipo.size()!= 2) {
            return  "No hay suficientes equipos para determinar un ganador";
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("Arbitro del partido → ") .append(arbitro).append("\n");
        resultado.append("Resultado final:\n");

        for (Map.Entry<String, Integer> entry : golesEquipo.entrySet()) {
            resultado.append(" → ").append(entry.getKey())
                    .append(" anoto ").append(entry.getValue()).append(" goles.\n");
        }


        String ganador = null;
        int maxGoles = Integer.MIN_VALUE;
        boolean empate = false;

        for (Map.Entry<String, Integer> entry: golesEquipo.entrySet()) {
            if (entry.getValue() > maxGoles) {
                ganador = entry.getKey();
                maxGoles = entry.getValue();
                empate = false;
            } else if (entry.getValue() == maxGoles) {
                empate = true;
            }
        }
        if (empate) {
            resultado.append(" El partido termino en **empate**");
        }else {
            resultado.append("El equipo ganador es: ").append(ganador)
                    .append("con ").append(maxGoles).append(" goles.");
        }

        return resultado.toString();
    }

    @Override
    public void mostrarCompetencia() {

    }
}
