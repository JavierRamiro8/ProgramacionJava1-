package EmpresaSalarios;

import java.util.Scanner;

public class MainEmpresa{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("introduce la categoria de juan");
        String categoria=in.nextLine();
        System.out.println("introduce edad de antiguedad de juan");
        int antiguedad =in.nextInt();
        CalculadoraSalarios juan=new CalculadoraSalarios();
       juan.CalcularSalarios(categoria,antiguedad);
       System.out.println(juan.toString());
    }
}