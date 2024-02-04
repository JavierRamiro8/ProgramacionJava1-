package EmpresaAgroalimenticia.src;

public class ProductosRefrigerados extends Productos {
    private int codOrganismo;
    private String fechaEnvasado;
    private int temperaturaMantenimiento;
    private String paisOrigen;

    public ProductosRefrigerados(String fechaCaducidad, int numeroLote, int codOrganismo, String fechaEnvasado,
            int temperaturaMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codOrganismo = codOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + " codOrganismo=" + codOrganismo + ", fechaEnvasado=" + fechaEnvasado
                + ", temperaturaMantenimiento=" + temperaturaMantenimiento + ", paisOrigen=" + paisOrigen + "]";
    }

}
