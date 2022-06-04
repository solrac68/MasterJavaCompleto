public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        boolean esVacio2 = curso.isEmpty();

        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();

        System.out.println("esBlanco = " + esBlanco);

        if(!esVacio) {
            System.out.println(curso.toUpperCase()); // java.lang.NullPointerException
            System.out.println(curso.concat("desde cero")); // java.lang.NullPointerException
            System.out.println("Bienvenido al curso".concat(curso)); // java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "str" is null
            System.out.println("Bienvenido al curso " + curso); // Bienvenido al curso null
        }


    }
}
