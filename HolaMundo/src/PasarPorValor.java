public class PasarPorValor {
    public static void main(String[] args) {
        int i = 2;
        System.out.println("i = " + i);
        test(i);
        System.out.println("i = " + i);

        Integer j = 5; // Clase inmutable
        System.out.println("j = " + j);
        test2(j);
        System.out.println("j = " + j);
    }
    
    static void test(int i){
        System.out.println("dentro del metodo i = " + i);
        i = 45;
        System.out.println("dentro del metodo i = " + i);
    }
    static void test2(Integer i){
        // No se modifica en el método porque i es inmutable.
        System.out.println("dentro del metodo i = " + i);
        i = 45;
        System.out.println("dentro del metodo i = " + i);
    }
}
