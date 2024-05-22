import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int inteiro;

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número inteiro para imprimir sua ordem decrescente maior que zero: ");
        inteiro = scan.nextInt();

        for (int i = 0; i <= inteiro; inteiro--) {
            System.out.println("Ordem decrescente:" + inteiro);
        }
        scan.close();
    }
}
