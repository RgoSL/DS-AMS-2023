import javax.swing.JOptionPane;

public class UrnaEletronica3 {
    public static void main(String[] args) {
        int E = 1;
        int C, J = 0, G = 0, M = 0, A = 0;
        while (E == 1) {

            JOptionPane.showMessageDialog(null, "Vote no Candidato!");

            JOptionPane.showMessageDialog(null,
                    "Jair Inácio(1) \n Gomes Tebet(2) \n Messias Silva(3) \n Anastácio(4) ");

            C = Integer.parseInt(JOptionPane.showInputDialog(""));
            ;

            if (C == 1)

                J++;
            else if (C == 2)
                G++;
            else if (C == 3)
                M++;
            else if (C == 4)
                A++;

            E = Integer.parseInt(JOptionPane.showInputDialog("Ainda há Eleitores? Sim(1) ou Não(2) "));
            if (E == 2)
                JOptionPane.showMessageDialog(null, "Fim do Periodo Eleitoral!! ");

        }
        if ((J > G && J > M && J > A))
            JOptionPane.showMessageDialog(null, "O Vencedor é O Candidato Jair Inácio! ");

        else if ((G > J && G > M && G > A))
            JOptionPane.showMessageDialog(null, "O Vencedor é O Candidato Gomes Tebet! ");

        else if ((M > J && M > A && M > G))
            JOptionPane.showMessageDialog(null, "O Vencedor é O Candidato Messias Silva! ");

        else if ((A > J && A > M && A > G))
            JOptionPane.showMessageDialog(null, "O Vencedor é O Candidato Anastácio! ");
        else
            JOptionPane.showMessageDialog(null, "Voltamos em Breve com o Segundo Turno! ");
    }
}