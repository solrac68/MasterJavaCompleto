import java.util.Random;

public class EjemploClassMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length; // Se genera un número aleatorio entre 0 y 7, sin incluir el 0 o el 7
        System.out.println("random = " + random);
        random = Math.floor(random);
        System.out.println("color = " + colores[(int)random]);

        Random random1 = new Random();
        int randomInt = random1.nextInt(7);
        System.out.println("randomInt = " + randomInt);

        int random2 = 7 + random1.nextInt(9); // Aleatorio entre 7 y 15
        System.out.println("random2 = " + random2);

        int random3 = random1.nextInt(colores.length); // Aleatorio entre 0 y colores.length
        System.out.println("color = " + colores[random3]); // Imprime los colores
        

    }
}
