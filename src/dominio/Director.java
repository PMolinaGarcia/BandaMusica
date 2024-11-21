package dominio;

public class Director extends Participante{

    public Director(){}

    public Director(String nombreCompleto){
        super(nombreCompleto);
    }

    public String toString(){
        StringBuilder datos = new StringBuilder(super.toString());
        datos.append(". Es el director.");

        return datos.toString();
    }

}
