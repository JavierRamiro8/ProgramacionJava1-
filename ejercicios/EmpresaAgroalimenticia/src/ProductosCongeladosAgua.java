package EmpresaAgroalimenticia.src;

public class ProductosCongeladosAgua extends ProductosCongelados {
    private int gramosDeSal;
    private int litroDeAguaUsados;

    public ProductosCongeladosAgua(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
            int temperaturaMantenimiento, int gramosDeSal, int litroDeAguaUsados) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.gramosDeSal = gramosDeSal;
        this.litroDeAguaUsados = litroDeAguaUsados;
    }

    private int salinidadDeAgua() {
        int salinidad = gramosDeSal * litroDeAguaUsados;
        return salinidad;
    }

    @Override
    public String toString() {
        return super.toString() + " gramosDeSal=" + gramosDeSal + ", litroDeAguaUsados=" + litroDeAguaUsados
                + " en total, tiene de salinidad= " + String.valueOf(salinidadDeAgua()) + "]";
    }

}
