package javaintroducao;

public class Tarefas10Java {
    public static void main(String[] args) {
        double Total, Lateral, R, Altura, Pi;

        R = 7;
        Altura = 18;
        Pi = 3.14;
        Lateral = (2 * Pi * R * Altura);
        Total = Lateral + (2 * Pi * (R * R));
        System.out.println("O raio da lata é " + R + " e a altura de " + Altura
                + "O valor da area externa da lata então é de cm " + Total);
    }
}