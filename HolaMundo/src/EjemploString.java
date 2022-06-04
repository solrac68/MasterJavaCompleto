import java.util.Arrays;

public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String curso2 = new String("Programacion Java");

        boolean esigual = curso == curso2;
        System.out.println("curso == curso2 = " + esigual); // false, se compara la referencia al objeto

        esigual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esigual); // true, se compara el texto exacto

        String curso3 = "Programacion Java";
        esigual = curso == curso3;
        System.out.println("curso == curso3 = " + esigual); // true por que reutiliza el mismo objeto asignado al mismo string

    }
}
