import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros pares que desea ver: ");
        int cant = sc.nextInt();
        for (int i=1; i<=cant ; i++) {
            System.out.println( i*2);
        }
    }
}
