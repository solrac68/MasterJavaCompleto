public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edades = {1,2,3,4,5};
        for (int edad: edades){
            System.out.println("externo edad = " + edad);
        }
        test(edades);
        for (int edad: edades){
            System.out.println("externo edad = " + edad);
        }
    }
    
    static void test(int[] edades){
        for (int edad: edades){
            System.out.println("interno edad = " + edad);
        }
        for (int i=0;i<edades.length;i++){
            edades[i] += 5;
        }

        for (int edad: edades){
            System.out.println("interno edad = " + edad);
        }
    }
}
