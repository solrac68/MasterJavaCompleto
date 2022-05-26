import javax.swing.*;
import java.util.Arrays;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un entero");
            main(args);
            System.exit(0);
        }

        System.out.println("Integer.toBinaryString(numeroDecimal) = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100; // se antecede 0b
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero = " +  numeroDecimal + " a Octal = " + Integer.toOctalString(numeroDecimal));
        
        int numeroOctal = 0764; // se le antepone el 0
        System.out.println("numero en decimal del Octal = {numeroOctal} = " + numeroOctal);

        System.out.println("numero en hexadecimal del decimal = " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4; // se le antepone el 0x
        System.out.println("numero decimal del hexadecimal es = " + numeroHex);

        String mensaje = "numero = " +  numeroDecimal + " a Octal = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero en hexadecimal del decimal = " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null,mensaje);

    }
}