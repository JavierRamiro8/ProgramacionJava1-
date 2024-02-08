package Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainArchivos {
    public static void main(String[] args) {
        String rutaFichero = "./ejercicios/Archivos/ArchivoGuardado.txt";
        System.out.println("introduce lo que quieras, todo se guardara en un log");
        Scanner in = new Scanner(System.in);
        String cadena = in.nextLine();
        try (BufferedWriter bufferEscritor = new BufferedWriter(new FileWriter(rutaFichero,true))) {
            bufferEscritor.append(cadena);
            bufferEscritor.newLine();
            bufferEscritor.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("vamos a leer lo que has puesto en el log");
        try (BufferedReader bufferLector = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea=bufferLector.readLine())!=null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
