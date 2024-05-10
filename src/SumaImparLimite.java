import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Ingrese el número inferior a sumar: ");
        int inferior = sc.nextInt();
        System.out.println( "Ingrese el número superior a sumar: ");
        int superior = sc.nextInt();
        int total = 0;
        if (inferior%2 == 0) {
            inferior++ ;
        }
        for (int i = inferior; i <= superior; i += 2) {
            total += i;
        }
        System.out.println(total);
    }
}
