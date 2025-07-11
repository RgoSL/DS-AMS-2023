import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exer04 {
    public static void main(String[] args) {
        String Esc = "";

        Esc = JOptionPane.showInputDialog("Posso Calcular : \n\n" +
                " 1 - Soma \n" +
                " 2 - Subtração \n" +
                " 3 - Divisão \n" +
                " 4 - Multiplicação \n" +
                " 5 - Resto de Divisão \n" +
                " 6 - Dobro \n" +
                " 7 - Quadrado \n" +
                " 8 - Cubo \n" +
                " 9 - Raiz quadrada\n" +
                " 0 - Sair\n" +
                " \n Escolha uma Das Opções : ");

        calculos(Esc);
    }

    public static void calculos(String esclMain) {

        String R = "";
        DecimalFormat Dc = new DecimalFormat("0.00");
        double Num1 = 0, Num2 = 0;
        switch (esclMain) {
            case (" Soma"):
            case ("1"):
            case ("Soma"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o 1° Número ? "));
                Num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o 2° Número ? "));
                R = Dc.format(Num1 + Num2);
                JOptionPane.showMessageDialog(null, "O Resultado é : " + R);
                break;

            case ("2"):
            case ("subtração"):
            case ("Subtração"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o 1° Número ? "));
                Num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o 2° Número ? "));
                R = Dc.format(Num1 - Num2);
                JOptionPane.showMessageDialog(null, "O Resultado é : " + R);
                break;

            case ("divisao"):
            case ("3"):
            case ("Divisao"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual Número Será  o Dividendo  ? "));
                Num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o Divisisor ? "));
                R = Dc.format(Num1 / Num2);
                JOptionPane.showMessageDialog(null, "O Resultado é : " + R);
                break;

            case ("multiplição"):
            case ("4"):
            case ("Multiplicação"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o 1° Fator ? "));
                Num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o 2° Fator ? "));
                R = Dc.format(Num1 * Num2);
                JOptionPane.showMessageDialog(null, "O Produto é : " + R);
                break;

            case ("5"):
            case ("resto de divisão"):
            case ("Resto da divisão"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual Número é o Dividendo ? "));
                Num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual é o Número Divisor ? "));
                R = Dc.format(Num1 % Num2);
                JOptionPane.showMessageDialog(null, "O Resto da Divisão é : " + R);
                break;

            case ("6"):
            case ("dobro"):
            case ("Dobro"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual Número Será Dobrado ? "));
                R = Dc.format(Num1 * 2);
                JOptionPane.showMessageDialog(null, " O Dobro de  " + Num1 + " é : " + R);
                break;

            case ("7"):
            case ("quadrado"):
            case ("Quadrado"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Deseja Saber o ² de Qual Número ? "));
                R = Dc.format(Num1 * Num1);
                JOptionPane.showMessageDialog(null, "O Quadrado de " + Num1 + " é : " + R);
                break;

            case ("8"):
            case ("cubo"):
            case ("Cubo"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Gostaria de Saber o ³ de Qual Número ? "));
                R = Dc.format(Num1 * Num1 * Num1);
                JOptionPane.showMessageDialog(null, "O Cubo de " + Num1 + " é : " + R);
                break;

            case ("9"):
            case ("raiz quadrada"):
            case ("Raiz quadrada"):
                Num1 = Double.parseDouble(JOptionPane.showInputDialog("Deseja Saber a Raiz de Qual Número ? "));
                R = Dc.format(Math.sqrt(Num1));
                JOptionPane.showMessageDialog(null, "A Raiz de " + Num1 + " é : " + R);
                break;

            case ("0"):
            case ("Sair"):
                break;
        }
    }
}