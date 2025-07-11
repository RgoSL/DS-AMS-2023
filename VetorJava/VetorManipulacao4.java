import javax.swing.JOptionPane;

public class VetorManipulacao4 {
    public static void main(String[] args) {
        String[] N = new String[5];
        String AP;

        for (int i = 0; i < 5; i++) {
            N[i] = JOptionPane.showInputDialog("Insira Um " + (i + 1) + " ° Nome.");
        }

        for (int i = 0; i < 4; i++) {
            for (int J = i + 1; J < 5; J++) {
                if (N[i].compareTo(N[J]) > 0) {
                    AP = N[i];
                    N[i] = N[J];
                    N[J] = AP;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " ° Nome - " + N[i]);
        }
    }
}