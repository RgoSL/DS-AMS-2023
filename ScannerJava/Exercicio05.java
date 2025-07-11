import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double CE, PC, OB;
        System.out.println("Quanto Custou o Espetáculo? ");
        CE = input.nextDouble();
        System.out.println("Quanto Custam os Ingressos? ");
        PC = input.nextDouble();
        OB = CE / PC;
        System.out.println("O Teatro terá que vender " + OB + " ingressos para pagar o Custo do Show ");
    }
}