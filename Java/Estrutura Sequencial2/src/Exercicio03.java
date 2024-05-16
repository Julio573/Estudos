import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        int a, b, c, d, dif;

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira os valores inteiros");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        dif = (a * b - c * d);

        System.out.println("Diferença = " + dif);

        scan.close();
    }
}
