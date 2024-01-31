package MaquinaExpendedora;

public class Bebida {
    private String nombreBebida;
    private char codigoBebida;
    private double precioBebida;

    public Bebida(String nombreBebida, char codigoBebida, double precioBebida) {
        this.nombreBebida = nombreBebida;
        this.codigoBebida = codigoBebida;
        this.precioBebida = precioBebida;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public char getCodigoBebida() {
        return codigoBebida;
    }

    public double getPrecioBebida() {
        return precioBebida;
    }
    

}
