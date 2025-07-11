import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exer05 {
    public static void main(String[] args) {
        double L1 = 0, L2 = 0;

        L1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o Valor de Um Dos Lados do Triângulo ? "));
        L2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o Valor Do Outro Lado do Triângulo ? "));

        hipotenusa(L1, L2);
    }

    public static void hipotenusa(double LD1, double LD2) {
        double HP = 0;
        DecimalFormat Dc = new DecimalFormat("0.00");

        HP = Math.hypot(LD1, LD2);
        JOptionPane.showMessageDialog(null, "A Hipotenusa Desse Triângulo é : " + Dc.format(HP));
    }
}