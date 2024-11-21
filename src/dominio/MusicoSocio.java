package dominio;
import java.math.BigDecimal;

public class MusicoSocio extends Musico{

    private int numeroSocio;

    public MusicoSocio(){}

    public MusicoSocio(String nombreCompleto, String instrumento, int numeroSocio){
        super(nombreCompleto,instrumento);
        this.numeroSocio = numeroSocio;

    }

    public MusicoSocio setNumeroSocio(int NumeroSocio){
        this.numeroSocio = numeroSocio;
        return this;
    }

    public int getNumeroSocio(){
        return numeroSocio;
    }

    public String toString(){
        StringBuilder datos = new StringBuilder(super.toString());
        datos.append(". \nNumero de socio: ")
                .append(numeroSocio);

        return datos.toString();
    }

}
