import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
            Properties p = new Properties(System.getProperties()); //Se cargan todas las configuraciones del sistema en el objeto properties
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","mi valor guardado");
            System.setProperties(p);
            Properties ps = System.getProperties();
            String otra = ps.getProperty("otra");
            ps.list(System.out);
            System.out.println("otra = " + otra);
            String nombre = System.getProperty("config.autor.nombre");
            System.out.println("nombre = " + nombre);
        } catch (Exception e) {
            System.err.println("NO existe el archivo = " + e);
        }

    }
}
