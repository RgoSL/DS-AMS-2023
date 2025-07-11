import javax.swing.JOptionPane;

public class Exem02 {
    public static void main(String[] args) {
        int T;
        String P;
        digite();
        P = JOptionPane.showInputDialog("Digite Uma Palavra Qualquer: ");
        T = tamanho(P);
        JOptionPane.showMessageDialog(null, P + "Possui " + T + " Caracteres ");
    }

    static void digite() {
        JOptionPane.showMessageDialog(null, "Digite Uma Palavra ");
    }

    static int tamanho(String X) {
        return X.length();
    }
}