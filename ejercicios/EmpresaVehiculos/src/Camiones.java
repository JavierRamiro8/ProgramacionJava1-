package EmpresaVehiculos.src;

import EmpresaVehiculos.src.Vehiculos.InnerVehiculos;

public class Camiones extends Vehiculos implements InnerVehiculos{
    private int capacidadMaletero;
    private String cargamento;

    public Camiones(String marca, String modelo, String matricula, int velocidadMaxima, int numeroRuedas,
            int capacidadMaletero, String cargamento, String traccion) {
        super(marca, modelo, matricula, velocidadMaxima, numeroRuedas, traccion);
        this.capacidadMaletero = capacidadMaletero;
        this.cargamento = cargamento;
    }

    @Override
    public String toString() {
        return super.toStringVehiculos() + ", capacidadMaletero=" + capacidadMaletero + ", cargamento=" + cargamento
                + "peso del vehiculo: "+pesoVehiculo()+"]";
    }
}
