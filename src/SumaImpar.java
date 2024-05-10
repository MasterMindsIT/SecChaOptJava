import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "ingrese el límite de números a sumar: ");
        int n = sc.nextInt();
        int total = 0;
        for (int i=1; i<=n ; i+=2) {
            total += i;
        }
        System.out.println(total);
    }
}
