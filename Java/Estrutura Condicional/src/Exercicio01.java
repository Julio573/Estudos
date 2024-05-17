import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int numero;

        Scanner scan = new Scanner(System.in);
        System.out.println("Descobrindo se um número inteiro é positivo ou negativo.");

        System.out.print("Insira o número desejado: ");
        numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println(numero + " é positivo.");
        } else {
            System.out.println(numero + " é negativo.");
        }

        scan.close();
    }
}
