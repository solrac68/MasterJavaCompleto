public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 == 5 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        estado = promedio >= 5.5 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);
    }
}
