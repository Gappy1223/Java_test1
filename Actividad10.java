import java.util.Scanner;
import java.util.InputMismatchException;
public class  Actividad10 {
    public static double division(Double varA, Double varB) throws ArithmeticException{
        if(varB == 0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return varA/varB;
    }

    public static double sumar(Double varA, Double varB){

        return varA + varB;
    }

    public static double restar(Double varA, Double varB){

        return varA - varB;
    }

    public static double multiplicar(Double varA, Double varB){

        return varA * varB;
    }


    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Double varA;
        Double varB;
        Double resultado;
        try {
            System.out.println("** Calculadora **");
            System.out.println("Teclea el primer número");
            varA = scanner.nextDouble();
            System.out.println("Teclea el segundo número");
            varB = scanner.nextDouble();
            System.out.println("Teclea la operación");
            System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    resultado = sumar(varA, varB);
                    break;
                case 2:
                    resultado = restar(varA, varB);
                    break;
                case 3:
                    resultado = multiplicar(varA, varB);
                    break;
                case 4:
                    resultado = division(varA, varB);
                default:
                    throw new IllegalArgumentException("Ingrese un número que se encuentre en el rango.");
            }

        } catch (ArithmeticException e) {
            System.out.println("La excepción es: " + e);
        } catch (InputMismatchException e){
            System.out.println("La excepción es: " + e + " Solo puede utilizar números.");
        } catch (IllegalArgumentException e){
            System.out.println("La excepción es: " + e);
        } finally {
            System.out.println("----------------------------------");
            scanner.close();
        }
    }
}