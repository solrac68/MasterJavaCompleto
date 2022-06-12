public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Carlos","Andres","Antonio","Felipe","Haroldo","Esteban"};
        String nombres2[] = {"Felipe","Luz","Cristina","Viviana","Alvaro"};

        int n = nombres.length;
        for (int i = 0; i < n; i++) {
            if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("carlos")){
                continue;
            }
            String out = String.format("nombres[%s] = %s",i,nombres[i]);
            System.out.println(out);
        }
    }
}
