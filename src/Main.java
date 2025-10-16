import java.util.ArrayList;
import java.util.Scanner;

    private static int contadorImpresos = 0;
    private static int contadorDigitales = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LIBRO> biblioteca = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Crear libro impreso");
            System.out.println("2. Crear libro digital");
            System.out.println("3. Mostrar todos los libros");
            System.out.println("4. Buscar libro por título");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: {

                    contadorImpresos++;
                    String codigo = String.format("LF%03d", contadorImpresos);

                    System.out.println("\n--- CREAR LIBRO IMPRESO ---");
                    System.out.print("Título: ");
                    String tituloi = sc.nextLine();
                    System.out.print("Autor: ");
                    String autori = sc.nextLine();
                    System.out.print("Precio: ");
                    double precioi = sc.nextDouble();
                    System.out.print("Cantidad de ejemplares disponibles: ");
                    int canti = sc.nextInt();
                    System.out.print("Peso (g): ");
                    double peso = sc.nextDouble();
                    System.out.print("Número total de ejemplares físicos: ");
                    int numE = sc.nextInt();

                    biblioteca.add(new Libroimpreso(codigo, tituloi, autori, precioi, canti, peso, numE));
                    System.out.println(" Libro impreso creado con código: " + codigo);
                    break;
                }

                case 2: {

                    contadorDigitales++;
                    String codigo = String.format("LD%03d", contadorDigitales);

                    System.out.println("\n--- CREAR LIBRO DIGITAL ---");
                    System.out.print("Título: ");
                    String titulod = sc.nextLine();
                    System.out.print("Autor: ");
                    String autord = sc.nextLine();
                    System.out.print("Precio: ");
                    double preciod = sc.nextDouble();
                    System.out.print("Cantidad de ejemplares disponibles: ");
                    int cantd = sc.nextInt();
                    System.out.print("Tamaño (MB): ");
                    double tam = sc.nextDouble();
                    System.out.print("¿Disponible para préstamo? (true/false): ");
                    boolean dispo = sc.nextBoolean();

                    biblioteca.add(new Llbrodigital(codigo, titulod, autord, preciod, cantd, tam, dispo));
                    System.out.println(" Libro digital creado  con código: " + codigo);
                    break;
                }

                case 3:
                    if (biblioteca.isEmpty()) {
                        System.out.println("No hay libros registrados.");
                    } else {
                        System.out.println("\n--- LISTA DE LIBROS ---");
                        for (LIBRO l : biblioteca) {
                            System.out.println(l.mostrarLibro());
                        }
                    }
                    break;

                case 4:
                    if (biblioteca.isEmpty()) {
                        System.out.println("No hay libros para buscar.");
                        break;
                    }
                    System.out.print("Ingrese el título del libro: ");
                    String busqueda = sc.nextLine();
                    boolean encontrado = false;
                    for (LIBRO l : biblioteca) {
                        if (l.getTitulo().equalsIgnoreCase(busqueda)) {
                            encontrado = true;
                            System.out.println("Libro encontrado:");
                            System.out.println(l.mostrarLibro());

                            int subop;
                            do {
                                System.out.println("\n--- GESTIÓN DE LIBRO ---");
                                System.out.println("1. Prestar libro");
                                System.out.println("2. Devolver libro");
                                System.out.println("0. Volver al menú principal");
                                System.out.print("Seleccione una opción: ");
                                subop = sc.nextInt();

                                switch (subop) {
                                    case 1:
                                        System.out.print("Ingrese cantidad a prestar: ");
                                        int p = sc.nextInt();
                                        l.prestar(p);
                                        break;
                                    case 2:
                                        System.out.print("Ingrese cantidad a devolver: ");
                                        int d = sc.nextInt();
                                        l.devolver(d);
                                        break;
                                    case 0:
                                        System.out.println("Volviendo al menú principal...");
                                        break;
                                    default:
                                        System.out.println("Opción inválida.");
                                }
                            } while (subop != 0);
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró un libro con ese título.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        } while (opcion != 0);

        sc.close();
    }
