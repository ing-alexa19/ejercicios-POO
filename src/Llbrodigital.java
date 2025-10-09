public class Llbrodigital extends LIBRO {
    private double tamaño;
    private boolean Disponibilidad;

    public Llbrodigital() {
    }

    public Llbrodigital(String titulo, String autor, double precio, int cantidade, double tamaño, boolean disponibilidad) {
        super(titulo, autor, precio, cantidade);
        this.tamaño = tamaño;
        Disponibilidad = disponibilidad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        Disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return "Llbrodigital{" +
                "tamaño=" + tamaño +
                ", Disponibilidad=" + Disponibilidad +
                '}';
    }
    public String mostrarLibro(){
        return ("\n--------------------------" +"\n         LIBRO"+"\n--------------------------" +"\nTítulo: "+ titulo + "\nAutor: " + autor +"\nPrecio: $" + precio +"\nCantidad de ejemplares: " +cantidade);
    }
}
