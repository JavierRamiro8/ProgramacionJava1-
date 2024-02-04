package EmpresaAgroalimenticia.src;

public abstract class ProductosCongelados extends Productos {
    private String fechaEnvasado;
    private String paisOrigen;
    private int temperaturaMantenimiento;

    public ProductosCongelados(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen,
            int temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public String toString() {
        return super.toString() + " fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen
                + ", temperaturaMantenimiento=" + temperaturaMantenimiento;
    }

}
