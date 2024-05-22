import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número para imprimir sua tabuada: ");
        int inteiro = scan.nextInt();

        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = inteiro * i;
            System.out.printf("%d x %d = %d%n", inteiro, i, resultado);
        }
        scan.close();
    }
}
