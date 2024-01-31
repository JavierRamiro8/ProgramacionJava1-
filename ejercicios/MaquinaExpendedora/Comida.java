package MaquinaExpendedora;

public class Comida {
    private String nombreComida;
    private char codigoComida;
    private double precioComida;

    public Comida(String nombreComida, char codigoComida, double precioComida) {
        this.nombreComida = nombreComida;
        this.codigoComida = codigoComida;
        this.precioComida = precioComida;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public char getCodigoComida() {
        return codigoComida;
    }

    public double getPrecioComida() {
        return precioComida;
    }
    

}
