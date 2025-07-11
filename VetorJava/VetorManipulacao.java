import javax.swing.JOptionPane;

public class VetorManipulacao {
    public static void main(String[] args) {

        int[] N = new int[5];
        int N2 = 0, Marcador = 0;

        for (int i = 0; i < 5; i++) {
            N[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o  " + (i + 1) + " ° Número"));
        }
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Qual Número Deseja Localizar? "));
        for (int i = 0; i < 5; i++) {
            if (N[i] == N2) {

                System.out.println("Número Econtrado na " + (i + 1) + " ª Posição ");
                Marcador++;
            }

        }
        if (Marcador == 0) {
            System.out.println("Número Não Encontrado ");
        } else
            System.out.println("Número Encontrado " + Marcador + " Vez(es) ");
    }
}