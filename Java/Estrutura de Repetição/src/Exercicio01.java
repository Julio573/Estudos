import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira sua senha: ");
        int senha = scan.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida, tente novamente");
            System.out.print("Insira sua senha: ");
            senha = scan.nextInt();
        }

        System.out.println("Acesso permitido.");
        scan.close();
    }
}
