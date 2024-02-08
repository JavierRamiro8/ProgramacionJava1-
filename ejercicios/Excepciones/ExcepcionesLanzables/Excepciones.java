package Excepciones.ExcepcionesLanzables;

import java.io.IOException;

public class Excepciones extends Exception {
    
    public class CustomIOException extends IOException {
    public CustomIOException(String message) {
        super(message);
    }
}

public class CustomGeneralException extends Exception {
    public CustomGeneralException(String message) {
        super(message);
    }
}

}
