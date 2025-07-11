import javax.swing.JOptionPane;

public class Exem03 {
    public static void main(String[] args) {
        int Idade1, Idade2;
        String Nome1, Nome2;

        Nome1 = JOptionPane.showInputDialog("Digite o Nome da 1ª Pessoa");
        Idade1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite a Idade da 1ª Pessoa"));

        Nome2 = JOptionPane.showInputDialog("Digite o Nome da 2ª Pessoa");
        Idade2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite a Idade da 2ª Pessoa"));

        String Texto = PessoaMaisVelha(Nome1, Idade1, Nome2, Idade2);

        JOptionPane.showMessageDialog(null, Texto);

    }

    static String PessoaMaisVelha(String N1, int ID1, String N2, int ID2) {
        if (ID1 > ID2)
            return N1 + " É a Pessoa Mais Velha";
        else if (ID2 > ID1)
            return N2 + " É a Pessoa Mais velha";
        else
            return N1 + " e " + N2 + "tem a mesma idade";
    }
}