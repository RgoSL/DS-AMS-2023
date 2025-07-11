import javax.swing.JOptionPane;

public class Exem04 {
    public static void main(String[] args) {
        int Num;
        Num = Integer.parseInt(JOptionPane.showInputDialog("Entre Com Um Número : "));

        if (RestoPorDois(Num) == 0)
            JOptionPane.showMessageDialog(null, "O Número É Par. \n ");
        else
            JOptionPane.showMessageDialog(null, "O Número É Impar. \n ");
    }

    static int RestoPorDois(int A) {
        return A % 2;
    }
}