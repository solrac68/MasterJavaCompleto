public class ArgumentosLineaComando {
    public static void main(String[] args) {
//        for (String arg: args) {
//            System.out.println("argumento = " + arg);
//        }
        if(args.length == 0){
            System.out.println("Debe ingresar argumentos ¡");
            System.exit(-1);
        }
        for (int i=0;i < args.length;i++){
            System.out.println("args[" + i + "] = " + args[i]);
        }

    }
}
