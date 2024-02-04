package EmpresaAgroalimenticia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import EmpresaAgroalimenticia.src.ProductosCongeladosAgua;
import EmpresaAgroalimenticia.src.ProductosCongeladosAire;
import EmpresaAgroalimenticia.src.ProductosCongeladosNitrogeno;
import EmpresaAgroalimenticia.src.ProductosFrescos;
import EmpresaAgroalimenticia.src.ProductosRefrigerados;

public class MainEmpresaAgroalimenticia {
    private static ArrayList<ProductosFrescos> productosFrescosArray = new ArrayList<>();
    private static ArrayList<ProductosRefrigerados> productosRefrigeradosArray = new ArrayList<>();
    private static ArrayList<ProductosCongeladosAgua> productosCongeladosPorAguaArray = new ArrayList<>();
    private static ArrayList<ProductosCongeladosNitrogeno> productosCongeladosPorNitrogenoArray = new ArrayList<>();
    private static ArrayList<ProductosCongeladosAire> productosCongeladosPorAireArray = new ArrayList<>();
    private static String fechaCaducidad;
    private static int numeroLote;
    private static String fechaEnvasado;
    private static String paisOrigen;
    private static int temperatura;

    public static void main(String[] args) {
        boolean menuInteractivo = true;
        while (true) {
            if (menuInteractivo) {
                menuInteractivo = menu();
            } else {
                break;
            }
        }
    }

    private static Scanner in = new Scanner(System.in);

    private static boolean menu() {
        System.out.println("Introduce una opcion");
        System.out.println("1) Añadir un Producto fresco");
        System.out.println("2) Añadir un Producto refrigerado");
        System.out.println("3) Añadir un Producto Congelado");
        System.out.println("4) Salir");
        int opcion = in.nextInt();
        in.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("introduce la fecha de caducidad");
                fechaCaducidad = in.nextLine();
                System.out.println("introduce el numero de lote");
                numeroLote = in.nextInt();
                in.nextLine();
                System.out.println("introduce la fecha de envasado");
                fechaEnvasado = in.nextLine();
                System.out.println("introduce el pais de origen del producto");
                paisOrigen = in.nextLine();
                ProductosFrescos productoFresco = new ProductosFrescos(fechaCaducidad, numeroLote, fechaEnvasado,
                        paisOrigen);
                productosFrescosArray.add(productoFresco);
                System.out.println("quieres revisar todos los productos frescos que has añadido?");
                System.out.println("1) si");
                System.out.println("2) no");
                opcion = in.nextInt();
                if (opcion == 1) {
                    revisarProductosFrescos();
                }
                break;
            case 2:
                System.out.println("introduce la fecha de caducidad");
                fechaCaducidad = in.nextLine();
                System.out.println("introduce el numero de lote");
                numeroLote = in.nextInt();
                System.out.println("introduce el codigo de organismo de supervision alimentaria");
                int codOrganismo = in.nextInt();
                in.nextLine();
                System.out.println("introduce la fecha de envasado");
                fechaEnvasado = in.nextLine();
                System.out.println("introduce la temperatura de mantenimiento recomendado");
                temperatura = in.nextInt();
                in.nextLine();
                System.out.println("introduce el pais de origen del producto");
                paisOrigen = in.nextLine();
                ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados(fechaCaducidad, numeroLote,
                        codOrganismo, fechaEnvasado, temperatura, paisOrigen);
                productosRefrigeradosArray.add(productoRefrigerado);
                System.out.println("quieres revisar todos los productos frescos que has añadido?");
                System.out.println("1) si");
                System.out.println("2) no");
                opcion = in.nextInt();
                if (opcion == 1) {
                    revisarProductosRefrigerados();
                }
                break;
            case 3:
                System.out.println("elije el tipo de producto congelado");
                System.out.println("1) Añadir un Producto Congelado por Oxigeno");
                System.out.println("2) Añadir un Producto Congelado por Hidrogeno");
                System.out.println("3) Añadir un Producto Congelado por Nitrogeno");
                System.out.println("4) Volver atras");
                opcion = in.nextInt();
                in.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("introduce la fecha de caducidad");
                        fechaCaducidad = in.nextLine();
                        System.out.println("introduce el numero de lote");
                        numeroLote = in.nextInt();
                        in.nextLine();
                        System.out.println("introduce la fecha de envasado");
                        fechaEnvasado = in.nextLine();
                        System.out.println("introduce el pais de origen del producto");
                        paisOrigen = in.nextLine();
                        System.out.println("introduce la temperatura de mantenimiento recomendado");
                        temperatura = in.nextInt();
                        System.out.println("introduce la composicion en % del Nitrogeno");
                        int composicionNitrogeno = in.nextInt();
                        System.out.println("introduce la composicion en % del Oxigeno");
                        int composicionOxigeno = in.nextInt();
                        System.out.println("introduce la composicion en % del Dioxido de Carbono");
                        int composicionDCarbono = in.nextInt();
                        System.out.println("introduce la composicion en % del Vapor de Agua");
                        int composicionVAgua = in.nextInt();
                        ProductosCongeladosAire productosCongeladosAire = new ProductosCongeladosAire(fechaCaducidad,
                                numeroLote, fechaEnvasado, paisOrigen, temperatura, composicionNitrogeno,
                                composicionOxigeno, composicionDCarbono, composicionVAgua);
                        productosCongeladosPorAireArray.add(productosCongeladosAire);
                        System.out.println("quieres revisar todos los productos Congelados por aire que has añadido?");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opcion = in.nextInt();
                        if (opcion == 1) {
                            revisarProductosCongeladorPorAire();
                        }
                        break;
                    case 2:
                        System.out.println("introduce la fecha de caducidad");
                        fechaCaducidad = in.nextLine();
                        System.out.println("introduce el numero de lote");
                        numeroLote = in.nextInt();
                        in.nextLine();
                        System.out.println("introduce la fecha de envasado");
                        fechaEnvasado = in.nextLine();
                        System.out.println("introduce el pais de origen del producto");
                        paisOrigen = in.nextLine();
                        System.out.println("introduce la temperatura de mantenimiento recomendado");
                        temperatura = in.nextInt();
                        System.out.println("introduce los gramos de sal para hacer el calculo");
                        int gramoSal = in.nextInt();
                        System.out.println("introduce los litros de agua usados para hacer el calculo");
                        int litroAgua = in.nextInt();
                        ProductosCongeladosAgua productosCongeladosAgua = new ProductosCongeladosAgua(fechaCaducidad,
                                numeroLote, fechaEnvasado, paisOrigen, temperatura, gramoSal, litroAgua);
                        productosCongeladosPorAguaArray.add(productosCongeladosAgua);
                        System.out.println("quieres revisar todos los productos Congelados por aire que has añadido?");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opcion = in.nextInt();
                        if (opcion == 1) {
                            revisarProductosCongeladorPorAgua();
                        }
                        break;
                    case 3:
                        System.out.println("introduce la fecha de caducidad");
                        fechaCaducidad = in.nextLine();
                        System.out.println("introduce el numero de lote");
                        numeroLote = in.nextInt();
                        in.nextLine();
                        System.out.println("introduce la fecha de envasado");
                        fechaEnvasado = in.nextLine();
                        System.out.println("introduce el pais de origen del producto");
                        paisOrigen = in.nextLine();
                        System.out.println("introduce la temperatura de mantenimiento recomendado");
                        temperatura = in.nextInt();
                        System.out.println("introduce el pais de origen del producto");
                        String tiempoExposicion = in.nextLine();
                        ProductosCongeladosNitrogeno productoCongeladoPorNitrogeno = new ProductosCongeladosNitrogeno(
                                fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperatura, tiempoExposicion);
                        productosCongeladosPorNitrogenoArray.add(productoCongeladoPorNitrogeno);
                        System.out.println("quieres revisar todos los productos Congelados por aire que has añadido?");
                        System.out.println("1) si");
                        System.out.println("2) no");
                        opcion = in.nextInt();
                        if (opcion == 1) {
                            revisarProductosCongeladorPorNitrogeno();
                        }
                    case 4:
                        return true;
                    default:
                        break;
                }
                break;
            case 4:
                return false;
            default:
                System.out.println("Error, no existe esa opcion");
                break;
        }
        return true;
    }

    private static void revisarProductosCongeladorPorNitrogeno() {
        Iterator<ProductosCongeladosNitrogeno> iteratorProductoCongeladoNitrogeno = productosCongeladosPorNitrogenoArray
                .iterator();
        while (iteratorProductoCongeladoNitrogeno.hasNext()) {
            ProductosCongeladosNitrogeno productosCongeladosNitrogeno = iteratorProductoCongeladoNitrogeno.next();
            System.out.println(productosCongeladosNitrogeno);
        }
    }

    private static void revisarProductosCongeladorPorAgua() {
        Iterator<ProductosCongeladosAgua> iteratorProductoCongeladoAgua = productosCongeladosPorAguaArray.iterator();
        while (iteratorProductoCongeladoAgua.hasNext()) {
            ProductosCongeladosAgua productosCongeladosAgua = iteratorProductoCongeladoAgua.next();
            System.out.println(productosCongeladosAgua);
        }
    }

    private static void revisarProductosCongeladorPorAire() {
        Iterator<ProductosCongeladosAire> iteratorProductosCongeladosAire = productosCongeladosPorAireArray.iterator();
        while (iteratorProductosCongeladosAire.hasNext()) {
            ProductosCongeladosAire productosCongeladosAire = iteratorProductosCongeladosAire.next();
            System.out.println(productosCongeladosAire);
        }
    }

    private static void revisarProductosRefrigerados() {
        Iterator<ProductosRefrigerados> iteradorProductosRefrigerado = productosRefrigeradosArray.iterator();
        while (iteradorProductosRefrigerado.hasNext()) {
            ProductosRefrigerados productoRefrigerados = iteradorProductosRefrigerado.next();
            System.out.println(productoRefrigerados);
        }

    }

    private static void revisarProductosFrescos() {
        Iterator<ProductosFrescos> iteradorProductosFrescos = productosFrescosArray.iterator();
        while (iteradorProductosFrescos.hasNext()) {
            ProductosFrescos productosFrescos = iteradorProductosFrescos.next();
            System.out.println(productosFrescos);
        }
    }
}
