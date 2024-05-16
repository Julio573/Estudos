import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        int codigo1, codigo2, numero_peca1, numero_peca2;
        double valor1, valor2, valorTotal;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira os dados necessários para descobrir o valor a ser pago.");

        System.out.print("Insira o código da primeira peça: ");
        codigo1 = scan.nextInt();
        System.out.print("Insira a quantidade da primeira peça: ");
        numero_peca1 = scan.nextInt();
        System.out.print("Insira o valor unitário da primeira peça: ");
        valor1 = scan.nextDouble();

        System.out.println();

        System.out.print("Insira o código da segunda peça: ");
        codigo2 = scan.nextInt();
        System.out.print("Insira a quantidade da segunda peça: ");
        numero_peca2 = scan.nextInt();
        System.out.print("Insira o valor unitário da segunda peça: ");
        valor2 = scan.nextDouble();

        valorTotal = (numero_peca1 * valor1) + (numero_peca2 * valor2);
        System.out.printf("Valor total a pagar: R$%.2f%n", valorTotal);


        scan.close();
    }
}
