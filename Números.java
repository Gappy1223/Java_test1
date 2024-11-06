import java.util.Scanner;
public class Números {

    public static void divisibles(){
        for(int j=0; j<= 100; j++){
            if (j % 2 == 0 && j % 3 == 0){
                System.out.println("El número " + j + " es divisible entre 2 y 3");
            }
        }
    }

    public static void leerNumero(){
        Scanner scanner = new Scanner(System.in);
        Integer dato;

        do{
            System.out.print("Ingrese un número: ");
            dato = scanner.nextInt();
            if(dato < 0){
                System.out.println("El número no es mayor a 0");
            } else {
                System.out.println("El número " + dato + " es mayor a 0");
            }
        } while (dato < 0);
    }


    public static void main(String[] args){
        Integer num = 1;
        System.out.println("Numeros del 1 al 100 usando while");
        while (num <= 100){
            System.out.println(num);
            num++;
        }
        System.out.println("");
        System.out.println("Números del 1 al 100 usando for");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        
        System.out.println("Los números del 1 al 100 que son divisibles entre 2 y 3");
        divisibles();

        System.out.println("Saber si un numero es mayor a 0");
        leerNumero();
    }
}
