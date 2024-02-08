package PracticaForEach.PracticaEmpresaVehiculosForEach;

import java.util.ArrayList;
import java.util.List;

public class MainVehiculos {
    public static void main(String[] args) {
        List<Vehiculos> listaVehiculos=new ArrayList<>();
        Vehiculos coche=new Vehiculos("BMW", "M3suv", 100, 1000);
        Vehiculos coche2=new Vehiculos("Ford", "Focus", 400, 100000);
        listaVehiculos.add(coche);
        listaVehiculos.add(coche2);
        Vehiculos.getListaVehiculos(listaVehiculos);
    }   
}
