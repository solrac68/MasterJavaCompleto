public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Carlos Augusto";
        String detalle = curso + " con el instructor "+ profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA  +numeroB); // Programacion Java con el instructor Carlos Augusto105
        System.out.println(detalle + (numeroA  +numeroB)); // Programacion Java con el instructor Carlos Augusto15

        System.out.println(numeroA  + numeroB + detalle); // 15Programacion Java con el instructor Carlos Augusto

        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2); // detalle2 = Programacion Java con Carlos Augusto

        detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2); //detalle2 = Programacion Java con Carlos Augusto

    }
}
