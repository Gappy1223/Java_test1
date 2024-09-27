import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Float[] Op = new Float[4];
        Float[] Val = new Float[3];
        System.out.print("Ingrese el primer valor: ");
        Val[0] = dato.nextFloat();
        System.out.print("Ingrese el segundo valor: ");
        Val[1] = dato.nextFloat();
        System.out.print("Ingrese el tercer valor: ");
        Val[2] = dato.nextFloat();

        Op[0] = (Val[0] + Val[1]) - Val[2];
        Op[1] = (Val[0] - Val[1]) * Val[2];
        Op[2] = (Val[0] * Val[1]) * Val[2];
        Op[3] = (Val[2] / Val[0]) + Val[1];

        for( int i = 0; i< Val.length; i++){
            System.out.println("Valor " + (i+1)+ " = " + Val[i]);
        }
        for( int i = 0; i< Op.length; i++){
            System.out.println("Operación " + (i+1)+" = " + Op[i]);
        }
    }
}
