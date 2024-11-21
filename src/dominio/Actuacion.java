package dominio;
import java.time.LocalDate;
import java.util.*;

public class Actuacion {

    private LocalDate fechaActuacion;
    private ArrayList <Participante> participantes = new ArrayList<>();;


    public Actuacion(){

    }

    public Actuacion(LocalDate fechaActuacion){
        this.fechaActuacion=fechaActuacion;
    }

    public Actuacion setFechaActuacion(LocalDate fechaActuacion){
        this.fechaActuacion=fechaActuacion;
        return this;
    }

    public LocalDate getFechaActuacion(){
        return fechaActuacion;
    }

    public Actuacion anniadirParticipante(Participante participante){
        participantes.add(participante);
        return this;
    }

    public String toString(){
        StringBuilder datos = new StringBuilder();
        datos.append("Fecha actuacion: ")
                .append(fechaActuacion)
                .append("\n");
        for (Participante participante : participantes) {
                datos.append(participante.toString());
        }

        return datos.toString();

    }

}
