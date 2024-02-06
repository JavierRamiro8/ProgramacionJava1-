package MapasDeCaracteres;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MainRecorrerCaracteres {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduce una frase:");
        String cadena = in.nextLine();
        TreeMap<String, Integer> mapa = new TreeMap<>();
        for (int i = 0; i < cadena.length(); i++) {
            String caracter = String.valueOf(cadena.charAt(i));
            int contador = 0;
            if (!mapa.containsKey(caracter)) {
                contador++;
                mapa.put(caracter, contador);
            } else {
                contador = mapa.get(caracter);
                contador++;
                mapa.replace(caracter, contador);
            }
        }
        for (String key : mapa.keySet()) {
            System.out.println("Caracter: " + key + ", Cantidad: " + mapa.get(key));
        }
        List<Map.Entry<String, Integer>> ordenarMapa = new ArrayList<>(mapa.entrySet());
        Collections.sort(ordenarMapa, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        LinkedHashMap<String, Integer> mapaOrdenado = new LinkedHashMap<>();
        for (Map.Entry<String,Integer> entrada : ordenarMapa) {
            mapaOrdenado.put(entrada.getKey(), entrada.getValue());
        }
        mapaOrdenado.forEach((clave, valor) -> System.out.println("Clave: " + clave + ", Valor: " + valor));
    }
}
