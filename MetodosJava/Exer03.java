import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exer03 {
    public static void main(String[] args) {
        double H = 0;
        String SX = "", IMC = "";

        H = Double.parseDouble(JOptionPane.showInputDialog("Qual é a Sua Altura ? "));
        SX = JOptionPane.showInputDialog("Qual é o Seu Sexo ? ");
        IMC = calculoPesoIdeal(H, SX);

        JOptionPane.showMessageDialog(null, "O Seu Peso Ideal é " + " KG " + IMC);
    }

    public static String calculoPesoIdeal(double Alt, String Sex) {
        DecimalFormat Dc = new DecimalFormat("0.00");
        String IMCc = "";

        if (Sex.equals("feminino") || Sex.equals("mulher") || Sex.equals("Feminino") || Sex.equals("Mulher"))
            IMCc = Dc.format(((62.1 * Alt) - 44.7));

        else if (Sex.equals("masculino") || Sex.equals("Homem") || Sex.equals("Masculino") || Sex.equals("homem"))
            IMCc = Dc.format(((72.7 * Alt) - 58));

        return IMCc;
    }
}