package EmpresaVehiculos;

import EmpresaVehiculos.src.Camiones;
import EmpresaVehiculos.src.Coches;
import EmpresaVehiculos.src.Motos;
import EmpresaVehiculos.src.Vehiculos;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainVehiculos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regex = "^[0-9]{4}[A-Z]{3}$";
        System.out.print("introduce la matricula del vehiculo: ");
        String matricula = in.next();
        Pattern patron = Pattern.compile(regex);
        Matcher comprobador = patron.matcher(matricula);
        if (comprobador.matches()) {
            Vehiculos bmwCoche = new Coches("BMW", "M3", matricula, 200, 4,"Delantera", 50);
            System.out.println(bmwCoche.toString());
            Vehiculos scannia = new Camiones("Scannia", "B900Alfa", matricula, 100, 8,800,"Butano","4x4");
            System.out.println(scannia.toString());
            Vehiculos harleyDavinson = new Motos("Harley Davinson", "Nightster", matricula, 200, 2,"Casco");
            System.out.println(harleyDavinson.toString());
        } else {
            System.out.println("no se ha podido añadir la matricula introducida ya que la matricula es incorrecta");
        }
    }
}
