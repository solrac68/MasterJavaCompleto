public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5,1.5);
        System.out.println("max = " + max);
        
        double min = Math.min(-1.5,-9.0);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.4);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.6);
        System.out.println("piso = " + techo);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double log2 = Math.log(exp);
        System.out.println("log2 = " + log2);

        double grados = Math.toDegrees(Math.PI);
        System.out.println(Math.PI + " rad son: " + grados + " grados");
        
        double radianes = Math.toRadians(grados);
        System.out.println("radianes = " + radianes);
    }
}
