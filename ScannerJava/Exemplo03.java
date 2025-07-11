import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double DP, S1, S2, S3;
        DP = 500;
        System.out.println("O saldo inicial é de: " + DP);
        S1 = DP + ((DP * 1) / 100);
        S2 = S1 + ((S1 * 1) / 100);
        S3 = S2 + ((S2 * 1) / 100);
        System.out.println("Seu saldo após 3 meses é de: " + S3);
    }
}