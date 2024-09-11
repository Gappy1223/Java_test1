import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = dato.nextInt();
        String mensaje = (edad >= 18) ? "La persona es mayor de edad" : "La persona es menor de edad";
        System.out.print(mensaje);
    }
}