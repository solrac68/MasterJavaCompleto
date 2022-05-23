import java.util.Arrays;

public class PrimitivosFloat {
    //psvm tab
    static float varFlotante;
    public static void main(String[] args) {
        float realFloat = 2.12e3f;//2120f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde a byte a = " + Float.BYTES);
        System.out.println("float corresponde a bits a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 3.40712712537; // 3.40712712537d la "d" es opcional
        System.out.println("realDouble = " + realDouble);

        System.out.println("double corresponde a byte a = " + Double.BYTES);
        System.out.println("double corresponde a bits a = " + Double.SIZE);
        System.out.println("Máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double = " + Double.MIN_VALUE);

        //var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);
                
    }
}
