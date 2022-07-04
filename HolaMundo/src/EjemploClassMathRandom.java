public class EjemploClassMathRandom {
    public static void main(String[] args) {
        String[] colores = {"azul","amarillo","rojo","verde","blanco","negro"};
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length; // Se genera un número aleatorio entre 0 y 7, sin incluir el 0 o el 7
        System.out.println("random = " + random);
        random = Math.floor(random);
        System.out.println("color = " + colores[(int)random]);
    }
}
