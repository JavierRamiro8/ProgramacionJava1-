package Interfaces;

public class ProductosClase implements interfaz {

    public void Productos(String nombre,int tamanio) {
        System.out.println(nombre+" "+tamanio);
    }


    @Override
    public void Productos(String nombre, int tamanio, int peso) {
        System.out.println(nombre+" "+tamanio+" "+peso);

    }

    @Override
    public void Vehiculos(String nombre, int modelo) {
        System.out.println(nombre+" "+modelo);
    }


    @Override
    public void Vehiculos(String nombre, int modelo, String matricula) {
        System.out.println(nombre+" "+modelo+" "+matricula);
    }
    
}
