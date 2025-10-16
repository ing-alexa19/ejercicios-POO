public class LIBRO {
    protected String codigo;
    protected String titulo;
    protected String autor;
    protected double precio;
    protected int cantidade;




    public LIBRO(String codigo, String titulo, String autor, double precio, int cantidade) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidade = cantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String mostrarLibro() {
        return "\nCódigo: " + codigo +
                "\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nPrecio: $" + precio +
                "\nCantidad: " + cantidade;
    }

    public void prestar(int cantidad) {
        if (cantidade >= cantidad) {
            cantidade -= cantidad;
            System.out.println("Libro prestado. Ejemplares restantes: " + cantidade);
        } else {
            System.out.println(" No hay suficientes ejemplares disponibles.");
        }
    }

    public void devolver(int cantidad) {
        cantidade += cantidad;
        System.out.println(" Libro devuelto. Total de ejemplares: " + cantidade);
    }
}




