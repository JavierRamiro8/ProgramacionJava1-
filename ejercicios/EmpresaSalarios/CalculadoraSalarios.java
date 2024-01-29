package EmpresaSalarios;

public class CalculadoraSalarios {
    private final int SUELDOBASE=1040;
    private final int EMPLEADO=10;
    private final int ENCARGADO=30;
    private final int DIRECTIVO=50;
    private final int AMATEUR=100;
    private final int JUNIOR=300;
    private final int EXPERTO=500;
    private int salarioFinal=0;

    public int CalcularSalarios(String categoriaEmpleado,int anioAntiguedad){
        int salarioTotal=0;
        if(categoriaEmpleado.equals("Empleado")){
            salarioTotal=(SUELDOBASE%EMPLEADO)+SUELDOBASE;
        }else if(categoriaEmpleado.equals("Encargado")){
            salarioTotal=(SUELDOBASE%ENCARGADO)+SUELDOBASE;
        }else{
            salarioTotal=(SUELDOBASE%DIRECTIVO)+SUELDOBASE;
        }
        if(anioAntiguedad>0 && anioAntiguedad<3 ){
            salarioTotal+=AMATEUR;
        }else if(anioAntiguedad>=3 && anioAntiguedad<=5){
            salarioTotal+=JUNIOR;
        }else if(anioAntiguedad>5){
            salarioTotal+=EXPERTO;
        }
        salarioFinal=salarioTotal;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "el empleado tiene de salario "+salarioFinal+" euros";
    }

    
}
