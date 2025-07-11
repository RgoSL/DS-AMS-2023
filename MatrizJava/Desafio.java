import javax.swing.JOptionPane;

public class Desafio {
    public static void main(String[] args) {

        final int N_Alunos = 10;
        final int N_Notas = 3;

        String[] NMS = new String[N_Alunos];
        double[][] NTS = new double[N_Alunos][N_Notas];
        double[] M = new double[N_Alunos];

        for (int I = 0; I < N_Alunos; I++) {
            NMS[I] = JOptionPane.showInputDialog("Qual o Nome do  " + (I + 1) + "° Aluno ? ");

            for (int J = 0; J < N_Notas; J++) {
                String inputNota = JOptionPane.showInputDialog("Qual a  " + (J + 1) + " ° Nota Do Aluno " + NMS[I]);
                NTS[I][J] = Double.parseDouble(inputNota);
            }
        }

        System.out.println("*****    MÉDIA ESCOLAR    ****** ");
        System.out.println(" ");

        System.out.println("Aluno\t\tNotas\t\t\tMédia ");
        for (int I = 0; I < N_Alunos; I++) {
            double S = 0;
            System.out.print(NMS[I] + "\t");

            for (int J = 0; J < N_Notas; J++) {
                System.out.print(NTS[I][J] + "\t");
                S += NTS[I][J];
            }
            M[I] = S / N_Notas;
            System.out.print("\t" + M[I] + "\t");

            if (M[I] >= 7.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}