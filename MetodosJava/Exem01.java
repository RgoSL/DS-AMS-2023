import javax.swing.JOptionPane;

public class Exem01 {
    public static void main(String[] args) {
        int A;
        digite();
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
        dobro(A);

    }

    static void digite() {
        JOptionPane.showMessageDialog(null, "Digite um Número");
    }

    static void dobro(int N) {
        int D = N * 2;
        JOptionPane.showMessageDialog(null, "Dobro de " + N + " É " + D);
    }
}