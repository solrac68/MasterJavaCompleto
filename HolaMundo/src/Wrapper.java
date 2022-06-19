public class Wrapper {
    public static void main(String[] args) {
        Integer intObjeto = Integer.valueOf(32456);
        Integer intObjeto2 = 32456;
        int intPrimitivo = 32456;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);
        
    }
}
