package dominio;
import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico {

    private BigDecimal sueldo;

    public MusicoRefuerzo(){}

    public MusicoRefuerzo (String nombreCompleto, String instrumento, BigDecimal sueldo){
        super(nombreCompleto,instrumento);
        this.sueldo=sueldo;
    }

    public MusicoRefuerzo setSueldo(BigDecimal sueldo){
        this.sueldo = sueldo;
        return this;
    }

    public BigDecimal getSueldo(){
        return sueldo;
    }

    public String toString(){
        StringBuilder datos = new StringBuilder(super.toString());
        datos.append(". \nSueldo: ")
                .append(sueldo)
                .append(" euros");

        return datos.toString();
    }


}
