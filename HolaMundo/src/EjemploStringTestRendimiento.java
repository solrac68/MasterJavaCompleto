public class EjemploStringTestRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        Long inicio = System.currentTimeMillis();

        for(int i = 0;i<500;i++) {
            c = c.concat(a).concat(b).concat("\n");
        }
        Long fin = System.currentTimeMillis();


        System.out.println("c = " + c);
        System.out.println(fin - inicio);

        inicio = System.currentTimeMillis();

        a = "a";
        b = "b";
        c = a;

        for(int i = 0;i<500;i++) {
            c += a + b + "\n";
        }

        fin = System.currentTimeMillis();


        System.out.println("c = " + c);
        System.out.println(fin - inicio);

        a = "a";
        b = "b";
        c = a;

        inicio = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(a);


        for(int i = 0;i<500;i++) {
            sb.append(a).append(b).append("\n");
        }

        fin = System.currentTimeMillis();


        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio);
    }
}
