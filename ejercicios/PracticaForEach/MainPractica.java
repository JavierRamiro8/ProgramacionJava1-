package PracticaForEach;

public class MainPractica {
    private static final int MAXRANDGENNUM=100;
    public static void main(String[] args) {
        int[] arrayNumerosAleatorios=new int[10];
        for(int i=0;i<arrayNumerosAleatorios.length;i++){
            arrayNumerosAleatorios[i]=(int)(Math.random()*MAXRANDGENNUM);
        }
        for(int iteradorArray : arrayNumerosAleatorios){
            System.out.println(iteradorArray);
        }
    }
}
