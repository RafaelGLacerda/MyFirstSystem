import javax.swing.JOptionPane;

public class Contabancariaapp {

    private static long numero;
    private static double saldo;
    private static String titular;
    private static double depositar;
    private static double sacar;

    public void preencherTitular() {
        titular = JOptionPane.showInputDialog("Digite o nome do titular:");
    }

    public void preencherNumero() {
        String input = JOptionPane.showInputDialog("Digite o número da conta:");
        numero = Long.parseLong(input);
    }

    public void preencherSaldo() {
        String input = JOptionPane.showInputDialog("Digite o valor do saldo:");
        saldo = Double.parseDouble(input);
    }

    public void preencherDeposito() {
        String input = JOptionPane.showInputDialog("Digite o valor do depósito:");
        depositar = Double.parseDouble(input);
    }

    public void preencherSaque() {
        String input = JOptionPane.showInputDialog("Digite o valor do saque:");
        sacar = Double.parseDouble(input);
    }

    public void atualizarSaldo() {
        saldo += depositar;
        saldo -= sacar;
    }

    public void exibirDados() {
        JOptionPane.showMessageDialog(null, "Dados Após Atualização:\n"
                + "Titular: " + titular + "\n"
                + "Número: " + numero + "\n"
                + "Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {

        Contabancariaapp conta = new Contabancariaapp();

        conta.preencherTitular();
        conta.preencherNumero();
        conta.preencherSaldo();
        conta.preencherDeposito();
        conta.preencherSaque();
        conta.atualizarSaldo();
        conta.exibirDados();

    }
}
