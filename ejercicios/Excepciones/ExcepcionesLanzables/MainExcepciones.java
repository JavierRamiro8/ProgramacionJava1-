package Excepciones.ExcepcionesLanzables;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import Excepciones.ExcepcionesLanzables.Excepciones.CustomGeneralException;
import Excepciones.ExcepcionesLanzables.Excepciones.CustomIOException;

public class MainExcepciones {

    public static void readFile(String filePath) throws CustomIOException, CustomGeneralException {
    }

    public static void main(String[] args) {
        try {
            readFile("path/a/tu/archivo.txt");
        } catch (CustomIOException e) {
            System.err.println(e.getMessage());
        } catch (CustomGeneralException e) {
            System.err.println(e.getMessage());
        }
    }
}


