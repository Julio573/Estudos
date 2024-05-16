import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        int numero_funcionario, horas_trabalhadas;
        double valor_hora, salario;

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Insira seus dados para calcular seu salário.");

        System.out.print("Insira o seu número de funcionário: ");
        numero_funcionario = scan.nextInt();
        System.out.print("Insira a quantidade de horas trabalhadas: ");
        horas_trabalhadas = scan.nextInt();
        System.out.print("Insira o valor recebido por hora: ");
        valor_hora = scan.nextDouble();

        salario = horas_trabalhadas * valor_hora;
        System.out.println("Número de fúncionario = " + numero_funcionario);
        System.out.printf("Salário = R$%.2f%n", salario);


        scan.close();
    }
}
