import javax.swing.JOptionPane;

public class VetorManipulacao3 {
    public static void main(String[] args) {

        String[] NMS = new String[5];
        NMS[0] = "Enzo";
        NMS[1] = "Nicolas";
        NMS[2] = "Felipe";
        NMS[3] = "Mariana";
        NMS[4] = "Vilma";

        String NP = JOptionPane.showInputDialog("Pesquise Um Nome :");

        int V = 0;
        String P = "";

        for (int I = 0; I < NMS.length; I++) {
            if (NMS[I].equalsIgnoreCase(NP)) {
                V++;
                P += (I + 1) + " ";
            }
        }

        if (V > 0) {
            JOptionPane.showMessageDialog(null,
                    "Esse Nome '" + NP + "' Foi Encontrado " + V + " Vezes Nas Posições: " + P);
        } else {
            JOptionPane.showMessageDialog(null, "Esse Nome '" + NP + "' Não Foi Encontrado.");
        }
    }
}