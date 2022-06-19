public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {2,4,1,4,7,8,1,22,8,9};
        int suma = 0;
        for(Integer i:enteros){
            if(i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
    }
}
