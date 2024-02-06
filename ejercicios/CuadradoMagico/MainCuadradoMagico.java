package CuadradoMagico;

public class MainCuadradoMagico {
    public static void main(String[] args) {
        int[][] cuadradoMagico = {
                { 4, 9, 2 },
                { 3, 5, 7 },
                { 8, 1, 6 }
        };
        int[][] cuadradoNoMagico = {
                { 2, 7, 6 },
                { 9, 19, 1 },
                { 4, 3, 8 }
        };
        int[][] noCuadradoMagico = {
            { 2, 7, 6 },
            { 9, 19, 1 },
            { 4, 3, 8 },
            { 4, 3, 8 }
    };
        ComprobadorCuadradoMagico comprobarCuadrado = new ComprobadorCuadradoMagico(cuadradoMagico);
        System.out.println(comprobarCuadrado.comprobarCuadradoMagico());
        ComprobadorCuadradoMagico comprobarCuadradoNoMagico = new ComprobadorCuadradoMagico(cuadradoNoMagico);
        System.out.println(comprobarCuadradoNoMagico.comprobarCuadradoMagico());
        ComprobadorCuadradoMagico comprobadorNoCuadradoMagico=new ComprobadorCuadradoMagico(noCuadradoMagico);
        System.out.println(comprobadorNoCuadradoMagico.comprobarCuadradoMagico());
    }
}
