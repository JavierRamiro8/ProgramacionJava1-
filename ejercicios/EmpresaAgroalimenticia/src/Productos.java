package EmpresaAgroalimenticia.src;

public abstract class Productos {
    private String fechaCaducidad;
    private int numeroLote;

    public Productos(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    @Override
    public String toString() {
        return "Productos [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote;
    }
}
