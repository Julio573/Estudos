import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número para descobrir seus ímpares: ");
        int inteiro = scan.nextInt();

        for (int i = 0; i < inteiro; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        scan.close();
    }
}
