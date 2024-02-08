package PracticaForEach.PracticaEmpresaVehiculosForEach;

import java.util.List;

public class Vehiculos {
    private String nombreCoche;
    private String modelo;
    private int potencia;
    private int autonomia;

    public Vehiculos(String nombreCoche, String modelo, int potencia, int autonomia) {
        this.nombreCoche = nombreCoche;
        this.modelo = modelo;
        this.potencia = potencia;
        this.autonomia = autonomia;
    }
    public static void getListaVehiculos(List<Vehiculos> lista){
        for(Vehiculos listaIterador : lista){
            System.out.println(listaIterador);
        }
    }
    @Override
    public String toString() {
        return "Vehiculos [nombreCoche=" + nombreCoche + ", modelo=" + modelo + ", potencia=" + potencia
                + ", autonomia=" + autonomia + "]";
    }
    

}
