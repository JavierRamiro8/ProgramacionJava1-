package CuadradoMagico;

public class ComprobadorCuadradoMagico {
    private int[][] cuadradoMagico;
    public ComprobadorCuadradoMagico(int[][] cuadradoMagico){
        this.cuadradoMagico=cuadradoMagico;
    }

    public String comprobarCuadradoMagico() {
        int contadorFilas=0;
        int contadorColumnas=0;
        int contadorDiagonalID=0;
        int contadorDiagonalDI=0;
        int tamanioCuadradoSegundoArray=cuadradoMagico[0].length;
            if(tamanioCuadradoSegundoArray!=cuadradoMagico.length){
                return "Ni siquiera es un cuadrado :(";
            }
        for(int i=0;i<cuadradoMagico.length;i++){
            for(int o=0;o<cuadradoMagico.length;o++){
                contadorDiagonalID+=cuadradoMagico[i][o];
                i++;
            }
        }
        for(int i=cuadradoMagico.length-1;i>=0;i--){
            for(int o=cuadradoMagico.length-1;o>=0;o--){
                contadorDiagonalDI+=cuadradoMagico[i][o];
                i--;
            }
        }
        for(int i=0;i<cuadradoMagico.length;i++){
            for(int o=0;o<cuadradoMagico.length;o++){
                contadorFilas+=cuadradoMagico[i][o];
                contadorColumnas+=cuadradoMagico[o][i];
            }
            if(contadorFilas!=contadorColumnas | contadorFilas!=contadorDiagonalDI | contadorFilas!=contadorDiagonalID | contadorColumnas!=contadorDiagonalDI | contadorColumnas!=contadorDiagonalID){
                return "No es un cuadrado Magico";
            }else{
                contadorColumnas=0;
                contadorFilas=0;
            }
        }
        return "Es un Cuadrado Magico";
    }
}
