import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int codigo, quantidade;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione o código do item selecionado e a quantidade\n");

        System.out.print("Selecione o código do item desejado: ");
        codigo = scan.nextInt();
        System.out.print("Seleciona a quantidade desejada: ");
        quantidade = scan.nextInt();

        double total = 0.00;
        if (codigo == 1) {
           total = quantidade * 4;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else if (codigo == 5) {
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$%.2f%n", total);
        scan.close();
        
    }
}
