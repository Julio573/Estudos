import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double raio, area;

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Cálculo do raio de um círculo \n");

        System.out.print("Insira o valor do raio: ");
        raio = scan.nextDouble();

        area = Math.PI * (raio * raio);

        System.out.printf("A = %.4f%n", area);


        scan.close();

    }
}