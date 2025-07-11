import javax.swing.JOptionPane;

public class VetorManipulacao2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        int aux;

        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite Um Número :"));
        }

        System.out.println("Ordenação");

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (num[i] < num[j]) {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " ° " + " - " + num[i]);
        }
    }
}