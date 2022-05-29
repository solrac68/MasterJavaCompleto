import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosInputScaner {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        //String numeroStr = scaner.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = scaner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("Numero decimal = " + numeroDecimal);

        String resultadoBinario = "Integer.toBinaryString(numeroDecimal) = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "numero octal de " +  numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = String.format("%s\n%s\n%s",resultadoBinario,resultadoOctal,resultadoHex);

        System.out.println(mensaje);

    }
}