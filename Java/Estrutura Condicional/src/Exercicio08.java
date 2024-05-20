import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double salario, imposto;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Calcular valor a ser pago no imposto de renda. \n");

        System.out.print("Insira seu salário: ");
        salario = scan.nextDouble();

        imposto = 0.0;
        if (salario == 0.0) {
        } else if (salario > 2000.00 && salario <= 3000.00) {
            imposto = (8 / 100.0) * (salario - 2000.0);
        } else if (salario >= 3000.01 && salario < 4500.00) {
            imposto = (8 / 100.0) * (salario - 2000.0) + (18 / 100.0);
        } else if (salario > 4500.00) {
            imposto = (salario - 4500.0) * (28 / 100.0) + 80 + 270 ;
        }
        System.out.printf("Baseado no seu salário de R$%.2f o valor a ser pago de imposto de renda é de R$%.2f%n", salario, imposto);

        scan.close();
    }
}
