package EmpresaAgroalimenticia.src;

public class ProductosCongeladosAire extends ProductosCongelados {
    private int composicionNitrogeno;
    private int composicionOxigeno;
    private int composicionDCarbono;
    private int composicionVaporAgua;

    public ProductosCongeladosAire(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
            int temperaturaMantenimiento, int composicionNitrogeno, int composicionOxigeno, int composicionDCarbono,
            int composicionVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.composicionNitrogeno = composicionNitrogeno;
        this.composicionOxigeno = composicionOxigeno;
        this.composicionDCarbono = composicionDCarbono;
        this.composicionVaporAgua = composicionVaporAgua;
    }

    @Override
    public String toString() {
        return super.toString() + " composicionNitrogeno=" + composicionNitrogeno + ", composicionOxigeno="
                + composicionOxigeno + ", composicionDCarbono=" + composicionDCarbono + ", composicionVaporAgua="
                + composicionVaporAgua + "]";
    }

}
