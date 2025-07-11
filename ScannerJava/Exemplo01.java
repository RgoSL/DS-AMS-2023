import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bs, al, ar;
        System.out.println("Digite a Base do Retângulo: ");
        bs = input.nextDouble();
        System.out.println("Digite a Altura do Retângulo: ");
        al = input.nextDouble();
        ar = al * bs;
        System.out.println("A Área do Retângulo é: " + ar);
    }
}