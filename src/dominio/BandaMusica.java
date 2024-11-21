package dominio;

import java.util.*;

public class BandaMusica {

    private String nombre;
    private ArrayList <Actuacion> actuaciones = new ArrayList<>();

    public BandaMusica(){
        nombre="";
    }

    public BandaMusica(String nombre){
        this.nombre=nombre;
    }

    public BandaMusica setNombre(String nombre){
        this.nombre=nombre;
        return this;
    }

    public String getNombre(){
        return nombre;
    }

    public BandaMusica anniadirActuacion(Actuacion actuacion){
        actuaciones.add(actuacion);
        return this;
    }

    public String toString(){
        StringBuilder datos = new StringBuilder();
        datos.append("\n\nNombre de la banda: ")
             .append(nombre);
        for (Actuacion actuacion : actuaciones) {
            datos.append("\n\n")
                 .append(actuacion.toString());
        }
        return datos.toString();
    }
}
