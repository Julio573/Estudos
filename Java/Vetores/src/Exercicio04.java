import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        int n, pares;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar?: ");
        n = scan.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scan.nextInt();
        }

        pares = 0;
        System.out.println("Números pares: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                pares++;
                System.out.printf("%d ", vect[i]);
            }
        }

        System.out.println();
        System.out.println("Quantidade de pares = " + pares);

        scan.close();
    }
}
