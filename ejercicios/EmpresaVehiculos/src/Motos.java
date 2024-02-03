package EmpresaVehiculos.src;

public class Motos extends Vehiculos {
    private String proteccion;

    public Motos(String marca, String modelo, String matricula, int velocidadMaxima, int numeroRuedas,
            String proteccion) {
        super(marca, modelo, matricula, velocidadMaxima, numeroRuedas);
        this.proteccion = proteccion;
    }

    public String getProteccion() {
        return proteccion;
    }

    @Override
    public String toString() {
        return super.toStringMotos() + " es una moto que lleva proteccion=" + proteccion + "]";
    }

}
