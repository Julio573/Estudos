import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Descobrindo se um número é par ou ímpar.");

        System.out.print("Insira o número desejado: ");
        numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
        scan.close();
    }
}
