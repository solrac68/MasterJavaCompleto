public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Carlos";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Carlos\")) = " + nombre.equals("Carlos"));
        System.out.println("nombre.equals(\"carlos\")) = " + nombre.equals("carlos"));
        System.out.println("nombre.equalsIgnoreCase(\"carlos\") = " + nombre.equalsIgnoreCase("carlos"));
        System.out.println("nombre.compareTo(\"Carlos\")= " + nombre.compareTo("Carlos"));
        System.out.println("nombre.compareTo(\"Aaron\")= " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0): " + nombre.charAt(0));
        System.out.println("nombre.charAt(6): " + nombre.charAt(5));
        System.out.println("nombre.substring(1): " + nombre.substring(1));
        System.out.println("nombre.substring(1,4): " + nombre.substring(1,4));

        String trabalenguas = "trabalenguas";
        String trabalenguas2 = "   trabalenguas   ";
        System.out.println("trabalenguas.replace(\"a\",\"A\") = " + trabalenguas.replace("a","A"));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('z') = " + trabalenguas.lastIndexOf('z'));
        System.out.println("trabalenguas.contain(\"t\") = " + trabalenguas.contains("t")); // true
        System.out.println("trabalenguas.contains(\"ta\") = " + trabalenguas.contains("ta")); // false
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.startsWith("lenguas")); // false
        System.out.println("trabalenguas.contains(\"traba\") = " + trabalenguas.startsWith("traba")); // true
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); // true
        System.out.println("trabalenguas2.trim())= " + trabalenguas2.trim());


    }
}