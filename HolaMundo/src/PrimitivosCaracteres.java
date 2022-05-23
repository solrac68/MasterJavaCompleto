public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //char caracter = '9';
        char caracter = '\u0040';
        System.out.println("caracter = " + caracter); // @
        char decimal = 64;
        System.out.println("decimal = " + decimal); // @
        System.out.println("decimal = caracter " + (decimal == caracter));
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        caracter = '\u00A2';
        System.out.println("caracter = " + caracter); //

        char espacio = '\u0020'; //' '
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevalinea = '\n';
        char retornocarro = '\r';

        System.out.println("char corresponde en byte =" + espacio + Character.BYTES);
        System.out.println("char corresponde en byte =" + retroceso + Character.BYTES);
        System.out.println("char corresponde en byte =" + tabulador + Character.BYTES);
        System.out.println("char corresponde en byte =" + nuevalinea + Character.BYTES);
        System.out.println("char corresponde en byte =" + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char corresponde en byte =" + System.lineSeparator() + Character.BYTES);
        System.out.println("Character.SIZE = " + Character.SIZE);
        System.out.println("Character min value = " + Character.MIN_VALUE);
        System.out.println("Character max value = " + Character.MAX_VALUE);

        var carac = '\u0040';
        System.out.println("caracter = " + carac); // @ >= jdk10



    }
}