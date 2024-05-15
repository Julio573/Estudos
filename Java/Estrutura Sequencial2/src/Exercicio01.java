import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int variavelA, variavelB, variavelC;

        System.out.println("Insira dois valores inteiros para realizar sua soma. \n");

        System.out.print("Insira o primeiro valor: ");
        variavelA = scan.nextInt();
        System.out.print("Insira o segundo valor: ");
        variavelB = scan.nextInt();

        variavelC = variavelA + variavelB;
        System.out.println("Soma = " + variavelC);


        scan.close();


    }
}