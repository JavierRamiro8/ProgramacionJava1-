package Excepciones;

public class MainLanzamientoExcepciones {
    public static void main(String[] args) throws Excepciones {
        int numero=0;
        if(numero==0){
            throw new Excepciones("el numero es 0, hemos capturado la excepcion");
        }
    }
}
