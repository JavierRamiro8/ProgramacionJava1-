import java.util.Scanner;

public class Maquina {

    private final static String [] bebidas = {"agua", "cocacola",  "cocacola zero", "cafe con leche","cafe"};
    private final static String [] comidas = {"sandwich", "pizza",  "hamburguesa", "a","b"};
    private final static char [] bebidasCodigos = {'A', 'B', 'C', 'D', 'E'};
    private final static char [] comidasCodigos = {'F', 'G', 'H', 'I', 'J'};
    private final static double [] bebidasPrecios = {2.45, 2.00, 3.15, 1.10, 0.6};
    private final static double [] comidasPrecios = {2.45, 2.00, 3.15, 1.10, 0.6};
    private final static double [] monedas = {20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05};
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		
		boolean encender = true;
        while (encender){
            encender = encenderMaquina();
        }        
        sc.close();
	}

    public static boolean encenderMaquina(){
        mostrarMenu1();
        
        int decision = recogerPantalla();
        
        switch (decision) {
            case 1: 
                // bebidas
                boolean salirBebidas = false;
                while (!salirBebidas) {
                    mostrarMenuBebidas();
                    int decision2 = recogerPantalla();
        
                    switch (decision2) {
                    case 1:
                        // mostrar lista bebidas
                        mostrarListaBebida();
                        break;
                    case 2:
                        // introducir codigo
                        char codigo = recogerCodigo();

                        salirBebidas = comprobarCodigo(codigo);
                        break;
                    case 3:    
                        return true;
                    default:
                        return false;
                    }
                }
                
                break;
        
            case 2:  
                // comidas
                boolean salirComidas = false;
                while (!salirComidas) {
                    mostrarMenuComidas();
                    int decision2 = recogerPantalla();
                    
                    switch (decision2) {
                    case 1:
                        // mostrar lista comidas
                        mostrarListaComida();
                        break;
                    case 2:
                        // introducir codigo
                        char codigo = recogerCodigo();
                        salirComidas = comprobarCodigo(codigo);
                        break;
                    case 3:    
                        return true;
                    default:
                        return false;
                    }
                }
                break;
            default:
                return false;
        }
        
        return true;
    }

    public static void mostrarMenu1(){
        System.out.println("*********************\nBienvenido, ¿qué desea?");
        System.out.println("1. Menu bebidas");
        System.out.println("2. Menu comidas");
        System.out.println("3. Salir");
        System.out.println("*********************\n");
    }

    public static void mostrarMenuBebidas(){
        System.out.println("*********************\nBEBIDAS");
        System.out.println("1. Lista bebidas");
        System.out.println("2. Introducir código bebida");
        System.out.println("3. Volver atrás");
        System.out.println("4. Salir");
        System.out.println("*********************\n");
    }

    public static void mostrarMenuComidas(){
        System.out.println("*********************\nCOMIDAS");
          System.out.println("1. Lista comidas");
        System.out.println("2. Introducir código comida");
        System.out.println("3. Volver atrás");
        System.out.println("4. Salir");
        System.out.println("*********************\n");
    }

    public static int recogerPantalla(){
        System.out.println("Introduzca una opción:");
        int ret = sc.nextInt();
        return ret;
    }

    public static char recogerCodigo(){
        System.out.println("Introduzca el código:");
        String ret = sc.next();
        return ret.charAt(0);
    }

    public static double recogerMoneda(){
        boolean valida = false;
        double ret= 0.0;
        while(!valida){
            System.out.println("Introduzca dinero, por favor");
            double moneda = sc.nextDouble();

            for(int i = 0; i < monedas.length; i++){
                if(monedas[i] == moneda){
                    valida = true;
                    ret= moneda;
                }                   
            }
            if(valida == false){
                System.out.println("Dinero no valido.");
            }
        }
        return ret;
    }

    public static void mostrarListaBebida(){
        for (int i = 0; i < bebidas.length; i++){
            System.out.println(bebidasCodigos[i] + "; " + bebidas[i] + ", " + bebidasPrecios[i]);
        }
    }

    public static void mostrarListaComida(){
        for (int i = 0; i < comidas.length; i++){
            System.out.println(comidasCodigos[i] + "; " + comidas[i] + ", " + comidasPrecios[i]);
        }
    }

    public static boolean comprobarCodigo(char codigo){
        boolean ret = false;
        for (int i = 0; i < comidas.length; i++){
            if(comidasCodigos[i] == codigo){
                ret = true;
                // el codigo es correcto se realizará la compra
                realizarCompraComidas(comidas[i], comidasPrecios[i]);
                break;
            }
            else if(bebidasCodigos[i] == codigo){
                ret = true;
                // el codigo es correcto se realizará la compra
                realizarCompraBebidas(bebidas[i], bebidasPrecios[i]);
                break;
            }
        }
        return ret;
    }

    public static void realizarCompraComidas(String bebida, double precio){
        boolean caliente = frioCaliente();
        double suplemento = 0;
        if(caliente){
            suplemento = 0.40;
        }
        double precioFinal = precio + suplemento;
        double dineroIntroducido = introducirMonedas(precioFinal);
        // se realizará la compra y se devolverá el cambio
        System.out.println("REALIZANDO COMPRA");
        calcularCambio(precioFinal, dineroIntroducido);
    }

    public static void realizarCompraBebidas(String bebida, double precio){
         
        double dineroIntroducido = introducirMonedas(precio);
        // se realizará la compra y se devolverá el cambio
        System.out.println("REALIZANDO COMPRA");
        calcularCambio(precio, dineroIntroducido);
    }

    public static void calcularCambio(double precio, double dinero){
        int [] cambio = new int [monedas.length];
        double vueltas =  dinero - precio;
        
        int i = 0;
        while (vueltas != 0 && i <  monedas.length){
            if(vueltas - monedas[i] >= 0){
                vueltas = vueltas - monedas[i];
                cambio[i]++;
            }
            else{
                i++;
            }
        }
        
        imprimirCambio(cambio);
    }

    public static void imprimirCambio(int [] cambio){
        for(int i = 0; i < cambio.length; i++){
            if(cambio[i] != 0){
                System.out.println("Se devolverán: " + cambio[i] + " de " + monedas[i]);
            }        
        }
    }

    public static double introducirMonedas(double precio){
        double dinero = 0;
        System.out.println("Debe introducir: " + precio);
        while (dinero < precio) {
            double moneda = recogerMoneda();
            dinero = dinero + moneda;
            System.out.println("Llevas introducido: " + dinero);
            System.out.println("El precio total es: " + precio);
            if(precio > dinero ){
                System.out.println("Queda por introducir: " + (precio-dinero));
            }
            else{
                System.out.println("El cambio será de: " + (precio-dinero));
            }
            
        }

        return dinero;
    }

    public static boolean frioCaliente(){
        System.out.println("¿Quiere la comida caliente?\nSe cobrará un suplemento de 0.40.");
        // devolvemos true si lo queremos caliente
        char frio = recogerCodigo();
        if(frio == 'S' || frio == 's'){
            return true;
        }
        else{
            return false;
        }
    }
}
