import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Cuantos elementos de la serie fibonacci deseas ver?: ");
        int total = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= total ; i++) {
            System.out.println(a);
            int aux = a+b;
            a = b;
            b = aux;
        }
    }
}
