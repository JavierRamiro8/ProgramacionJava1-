package MaquinaExpendedora;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;

public class MainMaquinaExpendedora {
    public static ArrayList<Comida> listComida = new ArrayList<>();
    public static ArrayList<Bebida> listaBebida = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        addComida();
        addBebida();
        menu();
    }

    private static void menu() {
        int seleccionPrincipal = 0;
        int seleccionSecundaria = 0;
        boolean salida = false;
        do {
            System.out.println("1)Comprar comida");
            System.out.println("2)Comprar bebida");
            System.out.println("3)Salir");
            seleccionPrincipal = in.nextInt();
            switch (seleccionPrincipal) {
                case 1:
                    do {
                        System.out.println("1) Visualizar la comida");
                        System.out.println("2) Introducir código en la máquina expendedora");
                        System.out.println("3) Volver Atras");
                        System.out.println("4) Salir");
                        seleccionSecundaria = in.nextInt();

                        switch (seleccionSecundaria) {
                            case 1:
                                MostrarComida();
                                break;
                            case 2:
                                System.out.println("Elije codigo de la maquina expendedora");
                                String cadenaCodigoMaquinaExpendedora = in.next();
                                char codigoMaquinaExpendedora = cadenaCodigoMaquinaExpendedora.charAt(0);
                                int contadorCodigoEncontrado = 0;
                                Comida mostrarComida;
                                Iterator<Comida> iteratorListaComida = listComida.iterator();
                                while (iteratorListaComida.hasNext()) {
                                    mostrarComida = iteratorListaComida.next();
                                    if (codigoMaquinaExpendedora == mostrarComida.getCodigoComida()) {
                                        contadorCodigoEncontrado++;
                                    }
                                }
                                if (contadorCodigoEncontrado != 0) {
                                    double precioProducto = SeleccionComida(codigoMaquinaExpendedora);
                                    ComprarComida(precioProducto);

                                } else {
                                    System.out.println("El codigo no existe, porfavor elije otro");
                                }
                                break;
                            case 3:

                                break;
                            case 4:
                                salida = true;
                                break;

                            default:
                                break;
                        }
                    } while (!salida);
                    break;
                case 2:
                    System.out.println("1) Visualizar la bebida");
                    System.out.println("2) Introducir código en la máquina expendedora");
                    System.out.println("3) Volver Atras");
                    System.out.println("4) Salir");
                    seleccionSecundaria = in.nextInt();
                    switch (seleccionSecundaria) {
                        case 1:
                            MostrarBebida();
                            break;
                        case 2:
                            System.out.println("Elije codigo de la maquina expendedora");
                            break;
                        case 3:

                            break;
                        case 4:
                            salida = true;
                            break;

                        default:
                            break;
                    }
                    break;
                case 3:
                    salida = true;
                    break;

                default:
                    break;
            }
        } while (salida == false);
    }

    private static void addComida() {
        listComida.add(new Comida("Sandwitch mixto", 'F', 2.35));
        listComida.add(new Comida("Empanada", 'G', 1.75));
        listComida.add(new Comida("Patatas Fritas", 'H', 0.90));
        listComida.add(new Comida("Pizza", 'I', 5.65));
        listComida.add(new Comida("Hamburguesa", 'J', 4.95));
    }

    private static void addBebida() {
        listaBebida.add(new Bebida("Agua", 'A', 1.00));
        listaBebida.add(new Bebida("Coca cola", 'B', 1.40));
        listaBebida.add(new Bebida("Coca cola zero", 'C', 1.45));
        listaBebida.add(new Bebida("Cáfe Solo", 'D', 0.65));
        listaBebida.add(new Bebida("Cáfe con leche", 'E', 0.80));
    }

    private static void MostrarComida() {
        Iterator<Comida> iteratorListaComida = listComida.iterator();
        while (iteratorListaComida.hasNext()) {
            Comida mostrarComida = iteratorListaComida.next();
            System.out.println(mostrarComida.getNombreComida() + " "
                    + mostrarComida.getCodigoComida() + " " + mostrarComida.getPrecioComida());
        }
    }

    private static void MostrarBebida() {
        Iterator<Bebida> iteratorListaBebida = listaBebida.iterator();
        while (iteratorListaBebida.hasNext()) {
            Bebida mostrarBebida = iteratorListaBebida.next();
            System.out.println(mostrarBebida.getNombreBebida() + " "
                    + mostrarBebida.getCodigoBebida() + " " + mostrarBebida.getPrecioBebida());
        }
    }

    private static double SeleccionComida(char codigoMaquinaExpendedora) {
        Iterator<Comida> iteratorListaComida = listComida.iterator();
        double precio = 0.0;
        while (iteratorListaComida.hasNext()) {
            Comida comida = iteratorListaComida.next();
            if (codigoMaquinaExpendedora == comida.getCodigoComida()) {
                System.out.println("Has elegido: " + comida.getNombreComida());
                System.out.println("Precio: " + comida.getPrecioComida());
                precio = comida.getPrecioComida();
                break;
            }
        }
        return precio;
    }

    private static void ComprarComida(double precioProducto) {
        double precioAPagar = precioProducto;
        while (precioAPagar > 0) {
            System.out.println("Tienes que pagar " + precioAPagar);
            double monedaIntroducida = in.nextDouble();
            if (monedaIntroducida == 2.00 || monedaIntroducida == 1.00 || monedaIntroducida == 0.50
                    || monedaIntroducida == 0.20 || monedaIntroducida == 0.10 || monedaIntroducida == 0.05
                    || monedaIntroducida == 0.02 || monedaIntroducida == 0.01) {
                if (monedaIntroducida > precioAPagar) {
                    System.out.println("No tenemos cambio, por favor introducza la moneda justa");
                } else {
                    precioAPagar -= monedaIntroducida;
                }
            } else {
                System.out.println("Moneda No existe");
            }
        }
    }

    private static void SeleccionBebida() {

    }
}