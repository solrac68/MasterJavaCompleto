import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 20 junio, 2022

        df = new SimpleDateFormat("dd-MM-yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 20-06-2022

        df = new SimpleDateFormat("dd/MMM/yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 20/jun/2022

        df = new SimpleDateFormat("dd/MMMM/yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 20/junio/2022

        df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = 20 de junio, 2022

        df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr); // fechaStr = lunes 20 de junio, 2022


    }
}
