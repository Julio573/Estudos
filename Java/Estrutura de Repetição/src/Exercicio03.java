import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int codigo;

        Scanner scan = new Scanner(System.in);

        codigo = 0;
        int total = 0;
        while (codigo != 4) {

            System.out.print("Insira o código do produto desejado: ");
            codigo = scan.nextInt();

            if (codigo == 1) {
                total += 1;
                System.out.println("Álcool");
            } else if (codigo == 2) {
                total += 1;
                System.out.println("Gasolina");
            } else if (codigo == 3) {
                total += 1;
                System.out.println("Diesel");
            } else {
                System.out.println("Insira outro código válido");
            }
        }
                System.out.println("MUITO OBRIGADO.");
                System.out.println("Alcool: " + total);
                System.out.println("Gasolina: " + total);
                System.out.println("Diesel: " + total);

        scan.close();
    }
}
