import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String userhome = System.getProperty("user.home");
        System.out.println("userhome = " + userhome);

        String userdir = System.getProperty("user.dir");
        System.out.println("userdir = " + userdir);

        String javaversion = System.getProperty("java.version");
        System.out.println("javaversion = " + javaversion);

        String lineseparator = System.getProperty("line.separator");
        System.out.println("lineseparator = " + lineseparator);

        System.out.println("Line separator: " + lineseparator + "Una nueva linea");

        String lineseparator2 = System.lineSeparator();
        System.out.println("lineseparator2 = " + lineseparator2);

        System.out.println("Line separator: " + lineseparator2 + "Una nueva linea 2");

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
