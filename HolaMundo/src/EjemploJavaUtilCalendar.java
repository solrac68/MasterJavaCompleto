import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(2022,Calendar.JULY,25,15,34);
        calendario.set(Calendar.YEAR,2022);
        calendario.set(Calendar.MONTH,7);
        calendario.set(Calendar.DAY_OF_MONTH,3);
        calendario.set(Calendar.HOUR_OF_DAY,21);
        calendario.set(Calendar.MINUTE,59);
        calendario.set(Calendar.SECOND,10);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);


    }
}
