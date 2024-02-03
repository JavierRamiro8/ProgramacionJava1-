package EmpresaVehiculos.src;

public abstract class Vehiculos {
    private String marca;
    private String modelo;
    private String matricula;
    private int velocidadMaxima;
    private int numeroRuedas;
    private String traccion;
    private int velocidadRealVehiculo;

    public Vehiculos(String marca, String modelo, String matricula, int velocidadMaxima, int numeroRuedas) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroRuedas = numeroRuedas;
    }

    public Vehiculos(String marca, String modelo, String matricula, int velocidadMaxima, int numeroRuedas,
            String traccion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidadMaxima = velocidadMaxima;
        this.numeroRuedas = numeroRuedas;
        this.traccion = traccion;
    }

    public interface InnerVehiculos {
        public String pesoVehiculo();
    }
    public String pesoVehiculo(){
        velocidadReal();
        if (velocidadRealVehiculo>200) {
            return "El peso del vehiculo es 200kg";
        }else if(velocidadRealVehiculo<100){
            return "El peso del vehiculo es 1000kg";
        }else{
            return "El peso del vehiculo es 500kg";
        }
    }

    public int velocidadReal() {
        velocidadRealVehiculo = velocidadMaxima - 5;
        return velocidadRealVehiculo;
    }
    public String toStringVehiculos() {
        return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", velocidadMaxima="
                + velocidadMaxima+"km" + ", velocidad real del vehiculo " + velocidadReal() +"km"+ ", numeroRuedas=" + numeroRuedas
                + ", traccion=" + traccion;
    }
    public String toStringMotos() {
        return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", velocidadMaxima="
                + velocidadMaxima+"km" + ", velocidad real del vehiculo " + velocidadReal() +"km"+ ", numeroRuedas=" + numeroRuedas;
    }

}
