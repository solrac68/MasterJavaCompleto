public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal¡";
        Class strClass  = texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        for(var m:strClass.getMethods()){
            System.out.println("strClass.getName() = " + m.getName());
        }

    }
}
