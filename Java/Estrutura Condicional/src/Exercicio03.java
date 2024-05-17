import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int numero1, numero2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Descobrindo se dois números são múltiplos entre si\n");

        System.out.print("Insira o primeiro número: ");
        numero1 = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        numero2 = scan.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println(numero1 + " é múltiplo de " + numero2);
        } else {
            System.out.println(numero1 + " não é múltiplo de " + numero2);
        }

        scan.close();
    }
}
