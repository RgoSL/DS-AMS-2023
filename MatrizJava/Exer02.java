import javax.swing.JOptionPane;

public class Exer02 {
    public static void main(String[] args) {

        int[][] Mat = new int[3][5];

        for (int I = 0; I < 3; I++) {
            for (int J = 0; J < 5; J++) {
                String N = JOptionPane.showInputDialog("Quais Números Você Gostaria Que o Programa Calculasse?");
                Mat[I][J] = Integer.parseInt(N);

                System.out.println("Os Números Analisados Foram : " + Mat[I][J]);

            }
        }

        for (int I = 0; I < 3; I++) {
            int S = 0;
            for (int J = 0; J < 5; J++) {
                S += Mat[I][J];

            }

            System.out.println(" ");

            System.out.println("A Soma Dos Valores Da Linha " + I + " , São : " + S);
        }
    }
}