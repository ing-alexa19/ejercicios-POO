
    class Llbrodigital extends LIBRO {
        private double tamaño;
        private boolean disponibilidad;

        public Llbrodigital(String codigo, String titulo, String autor, double precio, int cantidade, double tamaño, boolean disponibilidad) {
            super(codigo, titulo, autor, precio, cantidade);
            this.tamaño = tamaño;
            this.disponibilidad = disponibilidad;
        }

        @Override
        public String mostrarLibro() {
            return "\n--- LIBRO DIGITAL ---" +
                    "\nCódigo: " + codigo +
                    "\nTítulo: " + titulo +
                    "\nAutor: " + autor +
                    "\nPrecio: $" + precio +
                    "\nCantidad disponible: " + cantidade +
                    "\nTamaño: " + tamaño + " MB" +
                    "\nDisponible para préstamo: " + disponibilidad;
        }
    }