public class EjemploStringMetodoArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0;i<largo;i++){
            System.out.println(arreglo[i]);
        }
        String[] traba = trabalenguas.split("a");
        for (String arg: traba) {
            System.out.println("traba = " + arg);
        }
        String archivo = "alguna.imagen.pdf";
        String[] tokens = archivo.split("\\.");
        System.out.println("archivo = " + archivo);
        for (String tok: tokens) {
            System.out.println(tok);
        }
    }
}
