public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Carlos Augusto";

        curso.concat(profesor);
        System.out.println("curso = " + curso); // curso = Programacion Java
        
        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado); // resultado = Programacion JavaCarlos Augusto

        String resultado2 = curso.transform((c) -> {
            return c + " con " + profesor;
        });

        System.out.println("resultado2 = " + resultado2); // resultado2 = Programacion Java con Carlos Augusto

        resultado.replace("a","A");
        System.out.println("resultado = " + resultado); //Programacion JavaCarlos Augusto
        
        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3); //resultado3 = ProgrAmAcion JAvACArlos Augusto



    }
}
