import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        double valorX, valorY;

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira dois valores para descobrir as coordenadas de um ponto em um plano.\n");

        System.out.print("Insira o valor de X: ");
        valorX = scan.nextDouble();
        System.out.print("Insira o valor de Y: ");
        valorY = scan.nextDouble();
        
        if (valorX == 0.0 && valorY == 0.0) {
            System.out.println("Origem");
        } else if (valorX == 0.0) {
            System.out.println("Eixo X");
        } else if (valorY == 0.0) {
            System.out.println("Eixo Y");
        } else if (valorX > 0.0 && valorY > 0.0 ) {
            System.out.println("Q1");
        } else if (valorX < 0.0 && valorY > 0.0) {
            System.out.println("Q2");
        } else if (valorX < 0.0 && valorY < 0.0) {
            System.out.println("Q3");
        } else if (valorX > 0.0 && valorY < 0.0) {
            System.out.println("Q4");
        }
        scan.close();
    }
}
