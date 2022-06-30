import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {
        Map<String,String> varEnv = System.getenv();

        System.out.println(" ------ Listado de Variables del entorno del sistema --- ");

        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
        //System.out.println("varEnv = " + varEnv);
        System.out.println(" -------------------------------------------------------- ");

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);

        String temp = System.getenv("TEMP");
        System.out.println("temp = " + temp);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);

        String saludar = varEnv.get("SALUDAR_HOLA");
        System.out.println("saludar = " + saludar);
        
    }
}
