import java.util.Scanner;

public class Ejercicio3J2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // variables a utilizar
        int factorial = 1;
        int N;
        System.out.println("Ingrese el numero");
        N = sc.nextInt();
        // Ingresa al for para hacer la operacion
        for (int i = 2; i <= N; i++) {
            factorial= factorial*i;
        }
        // imprime el factorial de N
        System.out.println("El factorial de "+N+" Es: "+factorial);
    }
}