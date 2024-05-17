import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int hora_Inicial, hora_Final, duracao;

        Scanner scan = new Scanner(System.in);
        System.out.println("Descubra a duração entre dois horários.\n");

        System.out.print("Insira a hora inicial: ");
        hora_Inicial = scan.nextInt();
        System.out.print("Insira a hora final: ");
        hora_Final = scan.nextInt();

        if (hora_Inicial < hora_Final) {
            duracao = hora_Final - hora_Inicial;
        } else {
            duracao = 24 - hora_Inicial + hora_Final;
        }

        System.out.println("A duração é de " + duracao + " horas.");

        scan.close();
    }
}
