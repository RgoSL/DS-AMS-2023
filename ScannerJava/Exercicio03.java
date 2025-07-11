import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String F;
        int V;
        double S, C, SF;
        System.out.println("Qual o nome do Funcionário? ");
        F = input.nextLine();
        System.out.println("Qual o Salário do Funcionário? ");
        S = input.nextDouble();
        System.out.println("Quanto " + F + " fez em vendas? ");
        V = input.nextInt();
        SF = S + (V * 0.4);
        C = V * 0.4;
        System.out.println("O Funcionário " + F);
        System.out.println("");
        System.out.println("Recebeu uma comissão de R$ " + C);
        System.out.println("");
        System.out.println("O valor do seu Salário Final é de: " + " R$ " + SF);

    }
}