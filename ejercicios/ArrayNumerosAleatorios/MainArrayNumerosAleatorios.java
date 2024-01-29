package ArrayNumerosAleatorios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainArrayNumerosAleatorios {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe el numero del tamanio del array");
        int tamanioArray = in.nextInt();
        System.out.println("Escribe el numero maximo del random para llenar el array");
        int maxRandom = in.nextInt();
        System.out.println("Escribe el numero minimo del random para llenar el array");
        int minRandom = in.nextInt();
        if(maxRandom<minRandom){
            System.out.println("Escribe el numero maximo del random para llenar el array");
            maxRandom = in.nextInt();
            System.out.println("Escribe el numero minimo del random para llenar el array");
            minRandom = in.nextInt();
        }
        Integer arrayNumerosAleatorios[] = new Integer[tamanioArray];
        for (int i = 0; i < tamanioArray; i++) {
            arrayNumerosAleatorios[i] = (int) (Math.random() * (maxRandom - minRandom + 1)) + minRandom;
            System.out.println("el numero aleatorio que se ha generado es: " + arrayNumerosAleatorios[i]);
        }
        MainArrayNumerosAleatorios.menu(arrayNumerosAleatorios);
    }

    public static void menu(Integer[] arrayNumerosAleatorios) {
        String respuesta="";
        do {
            System.out.println("Elige las opciones siguientes");
            System.out.println("1) ordenar el array");
            System.out.println("2) buscar valor");
            System.out.println("3) numeros Impares del array");
            System.out.println("4) numeros mayor del array");
            int opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    Arrays.sort(arrayNumerosAleatorios);
                    System.out.println("el array esta ordenado de orden ascendente,");
                    for (int i = 0; i < arrayNumerosAleatorios.length; i++) {
                        System.out.println(arrayNumerosAleatorios[i]);
                    }
                    break;
                case 2:
                    System.out.println("que valor quieres buscar?");
                    int busquedaNumeros=in.nextInt();
                    int contador=0;
                    for (int i=0;i<arrayNumerosAleatorios.length;i++) {
                        if(busquedaNumeros==arrayNumerosAleatorios[i]){
                            contador++;
                        }
                    }
                    if(contador>0){
                        System.out.println("esta ese valor en "+contador+" veces");
                    }else{
                        System.out.println("no esta ese valor en el array");
                    }
                    break;
                    case 3:
                   ArrayList<Integer> arrayNumerosImpares=new ArrayList<Integer>();
                    for (int i=0;i<arrayNumerosAleatorios.length;i++) {
                        if((arrayNumerosAleatorios[i]%2)==1){
                            arrayNumerosImpares.add(arrayNumerosAleatorios[i]);
                        }
                    }
                        System.out.println(arrayNumerosImpares);
                    break;
                    case 4:
                        Arrays.sort(arrayNumerosAleatorios,Collections.reverseOrder());
                        System.out.println("el numero mayor en este array es el: "+arrayNumerosAleatorios[0]);
                    break;
                default:
                System.out.println("opcion no valida");
                    break;
            }
            System.out.println("¿quieres seguir?");
            in.nextLine();
            respuesta=in.nextLine();
        } while (respuesta.equals("si"));
    }
}
