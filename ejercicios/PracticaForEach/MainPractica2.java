package PracticaForEach;

import java.util.ArrayList;
import java.util.List;

public class MainPractica2 {
    public static void main(String[] args) {
        List<String> lista=new ArrayList<>();
        lista.add("Hola");
        lista.add("Vamos a iterar");
        lista.add("con un poco de forEach");
        lista.add("Vamos a ver como funciona!!");
        for(String listaIterador : lista){
            System.out.println(listaIterador);
        }


    }
}
