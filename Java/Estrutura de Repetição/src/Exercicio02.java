import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira as coordenadas X e Y do plano cartesiano.");

        System.out.print("Coordenada X: ");
        int X = scan.nextInt();
        System.out.print("Coordenada Y: ");
        int Y = scan.nextInt();

        while (X != 0 && Y != 0) {

            if (X > 0 && Y > 0) {
                System.out.println("Primeiro");
            } else if (X < 0 && Y > 0) {
                System.out.println("Segundo");
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("Quarto");
            }

            System.out.print("Insira novamente a coordenada X: ");
            X = scan.nextInt();
            System.out.print("Insira novamente a coordenada Y: ");
            Y = scan.nextInt();
        }
        scan.close();
    }
}
