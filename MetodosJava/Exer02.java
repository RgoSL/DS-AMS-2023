import javax.swing.JOptionPane;

public class Exer02 {
    public static void main(String[] args) {
        double Num = 0, Num2 = 0;

        Num = Double.parseDouble(JOptionPane.showInputDialog("Qual é o 1° Número ? "));
        Num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o 2° Número ? "));

        diferenca(Num, Num2);
    }

    public static void diferenca(double N1, double N2) {
        double I = 0, Cont = 0;

        if (N1 > N2) {
            for (I = N2; I < N1; I++) {
                Cont++;
            }
        }

        else if (N2 > N1) {
            for (I = N1; I < N2; I++)

            {
                Cont++;
            }
        }

        JOptionPane.showMessageDialog(null, "A Diferença Entre Os Dois Valores É : " + Cont);
    }
}