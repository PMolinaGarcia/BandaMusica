package dominio;
import java.io.*;

public class Participante implements Serializable{

    protected String nombreCompleto;

    public Participante(){}

    public Participante (String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    public Participante setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
        return this;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public String toString(){
        StringBuilder datos = new StringBuilder();
        datos.append("\nNombre: ")
                .append(nombreCompleto);

        return datos.toString();
    }

}
