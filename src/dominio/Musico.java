package dominio;

public class Musico extends Participante {

    protected String instrumento;

    public Musico(){}

    public Musico (String nombreCompleto, String instrumento) {
        super(nombreCompleto);
        this.instrumento = instrumento;
    }

    public Musico setInstrumento(String instrumento){
        this.instrumento = instrumento;
        return this;
    }

    public String getInstrumento(){
        return instrumento;
    }

    public String toString(){
        StringBuilder datos = new StringBuilder(super.toString());
        datos.append(". \nInstrumento: ")
                .append(instrumento);

        return datos.toString();
    }

}
