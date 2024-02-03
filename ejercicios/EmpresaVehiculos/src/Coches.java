package EmpresaVehiculos.src;

import EmpresaVehiculos.src.Vehiculos.InnerVehiculos;

public class Coches extends Vehiculos implements InnerVehiculos {
    private int capacidadMaletero;

    public Coches(String marca, String modelo, String matricula, int velocidadMaxima, int numeroRuedas,
            String traccion, int capacidadMaletero) {
        super(marca, modelo, matricula, velocidadMaxima, numeroRuedas, traccion);
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return super.toStringVehiculos() + ", capacidadMaletero=" + capacidadMaletero + " litros" + "peso del vehiculo= "+ pesoVehiculo()+"]";
    }

}
