package EmpresaAgroalimenticia.src;

public class ProductosCongeladosNitrogeno extends ProductosCongelados {
    private String tiempoExposicion;

    public ProductosCongeladosNitrogeno(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
            int temperaturaMantenimiento, String tiempoExposicion) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.tiempoExposicion = tiempoExposicion;
    }

    @Override
    public String toString() {
        return super.toString() + " tiempoExposicion=" + tiempoExposicion + "]";
    }

}
