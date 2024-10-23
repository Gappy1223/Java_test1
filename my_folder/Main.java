import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String titulo;
        String autor;
        Integer anioPublicacion;
        Integer opcionMenu;
        String regresar;

        do {
            do {
                System.out.println("---Biblioteca---");
                System.out.println("1. Agregar un libro \n2. Mostrar libros \n3. Salir");
                opcionMenu = scanner.nextInt();
                switch (opcionMenu) {
                    case 1:
                        System.out.println("1. Agregar un libro");
                        System.out.println("Titulo");
                        titulo = scanner.next();    
                        scanner.nextLine();
                        System.out.println("Autor");
                        autor = scanner.nextLine();
                        System.out.println("Año de Publicación");
                        anioPublicacion = scanner.nextInt();
                        Libro libro1 = new Libro(titulo, autor, anioPublicacion);
                        biblioteca.agregarLibro(libro1);
                        break;
                    case 2:
                        System.out.println("2. Mostrar libros");
                        biblioteca.mostrar();
                        break;
                    case 3:
                        System.out.println("3. Salir");
                        break;
                    default:
                        break;
                }


                //biblioteca.mostrar();

                System.out.println("¿Otra operación?:(s/n) ");
                regresar = scanner.next();
            } while (opcionMenu>3||opcionMenu<1);
        } while (regresar.equalsIgnoreCase("S"));


        }
    }
