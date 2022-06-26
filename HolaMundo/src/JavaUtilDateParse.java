import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd': ");
        try {
            //Date fecha = format.parse("2022-01-05");
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            Date fecha2 = new Date(); // Calendar
            System.out.println("fecha2 = " + fecha2);

            if(fecha.after(fecha2)){
                System.out.println("Fecha del usuario es después que fecha2");
            } else if (fecha.before(fecha2)){
                System.out.println("Fecha del usuario es antes que fecha2");
            } else  {
                System.out.println("Fecha del usuario es igual que fecha2");
            }

            if(fecha.compareTo(fecha2) > 0){
                System.out.println("Fecha del usuario es posterior que fecha2");
            } else if (fecha.compareTo(fecha2) < 0){
                System.out.println("Fecha del usuario es anterior que fecha2");
            } else  {
                System.out.println("Fecha del usuario es identica que fecha2");
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
