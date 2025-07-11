package javaintroducao;

public class Tarefas6Java {
    public static void main(String[] args) {
        double montante1, montante2, montante3, deps, juros;
        deps = 500;
        juros = (0.01);
        montante1 = deps + (deps * juros);
        montante2 = montante1 + (montante1 * juros);
        montante3 = montante2 + (montante2 * juros);
        System.out.println(
                "Seu saldo atual é " + deps + ",aplicando o juros de 1%, seu saldo passará a ser de R$" + montante1);
        System.out.println("No 2°mês seu saldo será de R$" + montante2);
        System.out.println("No 3°mês seu saldo será de R$" + montante3);
    }
}