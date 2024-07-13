import java.util.Scanner;
import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = scan.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = scan.nextDouble();
        }

        double soma = 0;
        double media = 0;
        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            soma += vect[i];
            media = soma / n;
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.println();
        System.out.println("Soma = " + soma);
        System.out.println("media = " + media);


        scan.close();
    }
}
