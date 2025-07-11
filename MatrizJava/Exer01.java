import javax.swing.JOptionPane;

public class Exer01 {
    public static void main(String[] args) {

        int[][] Mat = new int[4][5];
        int SP = 0, SI = 0;
        int QNTD_P = 0, QNTD_I = 0;

        for (int I = 0; I < 4; I++) {
            for (int J = 0; J < 5; J++) {
                String N = JOptionPane.showInputDialog("Quais Números Você Gostaria Que o Programa Calculasse?");
                Mat[I][J] = Integer.parseInt(N);

                System.out.println(" Números Em Questão : " + Mat[I][J]);

                if (Mat[I][J] % 2 == 0) {
                    SP += Mat[I][J];
                    QNTD_P++;
                } else {
                    SI += Mat[I][J];
                    QNTD_I++;
                }
            }
        }

        double MediaP = (QNTD_P > 0) ? (double) SP / QNTD_P : 0;
        double MediaI = (QNTD_I > 0) ? (double) SI / QNTD_I : 0;

        System.out.println(" ");

        System.out.println("A Quantidade De Números Pares É : " + QNTD_P);

        System.out.println("A Quantidade De Números Ímpares É : " + QNTD_I);

        System.out.println("A Soma Dos Números Pares É : " + SP);

        System.out.println("A Soma Dos Números Ímpares : " + SI);

        System.out.println("A Média Dos Números Pares É : " + MediaP);

        System.out.println(" A Média Dos Números Ímpares É : " + MediaI);
    }
}