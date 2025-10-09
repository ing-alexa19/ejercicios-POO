public class Libroimpreso extends LIBRO{

    private double peso;

    public Libroimpreso(String titulo, String autor, double precio, int cantidadEjemplares) {
        super(titulo, autor, precio, cantidadEjemplares);
    }

    public Libroimpreso(String titulo, String autor, double precio, int cantidadEjemplares, double peso) {
        super(titulo, autor, precio, cantidadEjemplares);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "LibroImpreso{" +
                "peso=" + peso +
                '}';
    }

    @Override
    public String mostrarLibro(){
        return ("\n--------------------------" +"\n    LIBRO IMPRESO"+"\n--------------------------" +"\nTítulo: "+ titulo + "\nAutor: " + autor +"\nPrecio: $" + precio +"\nCantidad de ejemplares: " +cantidade +"Peso: " +peso +"g");
    }
}
