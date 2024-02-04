package EmpresaAgroalimenticia.src;

public class ProductosFrescos extends Productos {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductosFrescos(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return super.toString() + " fechaEnvasado=" + fechaEnvasado + ", paisOrigen=" + paisOrigen + "]";
    }

}
