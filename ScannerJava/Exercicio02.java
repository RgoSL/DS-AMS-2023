import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double RS, DL, MA, LE;
        System.out.println("Quantos Reais você possui? ");
        RS = input.nextDouble();
        DL = RS * 1.80;
        MA = RS * 2;
        LE = RS * 1.57;
        System.out.println("A conversão em Doláres ficaria: " + DL);
        System.out.println("");
        System.out.println("A conversão em Marcos Alemães ficaria: " + MA);
        System.out.println("");
        System.out.println("A conversão em Libras Esterlinas ficaria: " + LE);
    }
}