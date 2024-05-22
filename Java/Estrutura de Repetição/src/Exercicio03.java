import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int codigo;

        Scanner scan = new Scanner(System.in);

        codigo = 0;
        int totalAlcool = 0;
        int totalGasolina = 0;
        int totalDiesel = 0;

        while (codigo != 4) {

            System.out.print("Insira o código do produto desejado: ");
            codigo = scan.nextInt();

            if (codigo == 1) {
                totalAlcool += 1;
                System.out.println("Álcool");
            } else if (codigo == 2) {
                totalGasolina += 1;
                System.out.println("Gasolina");
            } else if (codigo == 3) {
                totalDiesel += 1;
                System.out.println("Diesel");
            } else {
                System.out.println("Insira outro código válido");
            }
        }
        System.out.println("MUITO OBRIGADO.");
        System.out.println("Alcool: " + totalAlcool);
        System.out.println("Gasolina: " + totalGasolina);
        System.out.println("Diesel: " + totalDiesel);

        scan.close();
    }
}
