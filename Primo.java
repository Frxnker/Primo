public class Primo {
    public static void main(String[] args) {
        System.out.println("Dime un número entero para saber si es primo:");
        int N = Integer.parseInt(System.console().readLine());
        
        boolean Primo = true;

        for (int i = 2; i < N; i++) {
            if (N % i == 0) Primo = false;
        }
        
        if (Primo) System.out.println("El numero " + N + " es primo");
        else System.out.println("El numero " + N + " no es primo");
    
    }       
}
