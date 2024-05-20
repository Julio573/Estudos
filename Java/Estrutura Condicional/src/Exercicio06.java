import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double valor;


        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um valor qualquer para descobrir os seus intervalos.");

        System.out.print("Insira o valor: ");
        valor = scan.nextDouble();

        double resultado = 0.00;
       if (valor < 0.0 || valor > 100.0) {
           System.out.println("Fora do intervalo");
       } else if (valor <= 25.0) {
            System.out.println("Intervalo [0,25]");
       } else if (valor <= 50.0) {
            System.out.println("Intervalo [25,50]");
       } else if (valor <= 75.50) {
           System.out.println("Intervalo [50,75]");
        } else {
           System.out.println("Intervalo [75,100]");
       }
        scan.close();

    }
}
