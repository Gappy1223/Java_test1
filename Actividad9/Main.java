package Actividad9;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        Integer edad = 0;
        System.out.println("¿Cuántos estudiantes van a ingresar?");
        Integer cantidad = scanner.nextInt();

        Estudiante[] estudiante = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++){
            scanner.nextLine();
            System.out.println("Escribe el nombre: ");
            nombre = scanner.nextLine();
            System.out.println("Escribe la edad: ");
            edad = scanner.nextInt();
            estudiante[i] = new Estudiante(nombre,edad);
        }

        System.out.println("Estudiantes: ");
        for (int i = 0; i < cantidad; i++){
            System.out.println("Estudiante(s) " + (i+1) + "");
            System.out.println("Nombre " + estudiante[i].getNombre());
            System.out.println("Edad " + estudiante[i].getEdad());
        }
    }
}
