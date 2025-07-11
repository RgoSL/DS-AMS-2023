import javax.swing.JOptionPane;

public class Exer03 {
    public static void main(String[] args) {

        int NumPDR = 2;
        String[] NMS = new String[NumPDR];
        double[] PRÇ = new double[NumPDR];

        for (int I = 0; I < NumPDR; I++) {
            NMS[I] = JOptionPane.showInputDialog("Digite o Nome Do Produto " + (I + 1) + ":");
            String PRÇ_EX = JOptionPane.showInputDialog("Digite o Preço Do " + (I + 1) + "° Produto " + ":");
            PRÇ[I] = Double.parseDouble(PRÇ_EX);
        }

        String VL_EX = JOptionPane.showInputDialog("Digite o Valor Máximo Para Pesquisa : ");
        double VL = Double.parseDouble(VL_EX);

        System.out.println("Produtos Com Preço Até R$" + VL + " : ");
        for (int I = 0; I < NumPDR; I++) {
            if (PRÇ[I] <= VL) {
                System.out.println("Nome: " + NMS[I] + ", Preço: R$" + PRÇ[I]);
            }
        }
    }
}