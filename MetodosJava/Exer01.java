import javax.swing.JOptionPane;

public class Exer01 {
    public static void main(String[] args) {
        String NM = "", MSG = " Aluno : ";
        double NT1 = 0, NT2 = 0, R = 0;

        NM = JOptionPane.showInputDialog("Qual o Nome do Aluno? ");
        NT1 = Double.parseDouble(JOptionPane.showInputDialog("Qual Foi a 1ª Nota do Aluno " + NM + " ? "));
        NT2 = Double.parseDouble(JOptionPane.showInputDialog("Qual Foi a 2ª Nota do Aluno " + NM + " ? "));

        R = calcularMedia(NT1, NT2);
        MSG += NM + ("\n") + lerNota(R);

        JOptionPane.showMessageDialog(null, MSG);
    }

    public static double calcularMedia(double N1, double N2) {

        double M = 0;
        M = (N1 + N2) / 2;
        return M;
    }

    public static String lerNota(double MD) {
        String APR = "";

        if (MD < 7)

        {
            APR = "Reprovado Com Média " + MD;
        }

        else

        {
            APR = "Aprovado Com Média " + MD;
        }

        return APR;
    }
}