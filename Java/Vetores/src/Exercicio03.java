import java.util.Scanner;
import java.util.Locale;

public class Exercicio03 {
    public static void main(String[] args) {

        int n, menorIdade;
        double somaMedia, mediaAltura, resultadoIdade;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pesssoas serão digitadas? ");
        n = scan.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoas:");
            System.out.print("Nome: ");
            nome[i] = scan.next();
            System.out.print("Idade: ");
            idade[i] = scan.nextInt();
            System.out.print("Altura: ");
            altura[i] = scan.nextDouble();
        }

        menorIdade = 0;
        somaMedia = 0;
        mediaAltura = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                menorIdade++;
            }
            somaMedia += altura[i];
            mediaAltura = somaMedia / n;
        }

        System.out.printf("Altura média: %.2f%n", mediaAltura);
        resultadoIdade = (double) (menorIdade / idade.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", resultadoIdade);

        for (int i = 0; i < n; i++) {
        if (idade[i] < 16) {
            System.out.println(nome[i]);
        }
        }

        scan.close();
    }
}
