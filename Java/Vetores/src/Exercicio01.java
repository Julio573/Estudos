import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int numero = scan.nextInt();
        int[] vector = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("Digite um número: ");
            vector[i] = scan.nextInt();
        }

        System.out.println("Numero negativos:");

        for (int i = 0; i < numero; i++) {
            if (vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

        scan.close();
    }
}
