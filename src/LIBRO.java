public class LIBRO {
    protected String titulo;
    protected String autor;
    protected double precio;
    protected int cantidade;

    public LIBRO() {
    }

    public LIBRO(String titulo, String autor, double precio, int cantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidade = cantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", cantidade=" + cantidade +
                '}';
    }

    public String mostrarLibro(){
         return "Título: " + titulo + "Autor: " + autor+"Precio: $" + precio+
                 "Cantidad de ejemplares: " + cantidade;

    }

    public void prestar(int cantidad) {}
    public void devolver(int cantidad) {}



}
