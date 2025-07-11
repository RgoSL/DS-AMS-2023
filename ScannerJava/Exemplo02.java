import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double SL, SB, VH, HT, ND, BN;
        BN = 300;
        System.out.println("Informe o valor por hora trabalhada: ");
        VH = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas; ");
        HT = input.nextDouble();
        System.out.println("Informe a quantidade de dependentes: ");
        ND = input.nextDouble();
        SB = VH * HT;
        SL = SB + BN * ND;
        System.out.println("O valor do seu salário bruto é de: " + SB);
        System.out.println("O valor do seu salário líquido é de: " + SL);
    }
}
