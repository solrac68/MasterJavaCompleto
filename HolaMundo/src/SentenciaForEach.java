public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1,2,4,5,7,9};
        for (int i: numeros) {
            System.out.println("i = " + i);
        }
        String[] nombres = {"Andres","Pepe","Maria","Paco","Pato"};
        
        for(String nombre:nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
