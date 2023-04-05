import java.util.Scanner;

public class Bank2 {
    private String nomeDaConta;
    private String nomeDoCorrentista;
    private double montante;

    public Bank2(String nomeDaConta, String nomeDoCorrentista, double montante) {
        this.nomeDaConta = nomeDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.montante = montante;
    }

    public void depositar(double valor) {
        this.montante += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor > this.montante) {
            System.out.println("Saldo insuficiente para realizar o saque!");
        } else {
            this.montante -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
    }

    public void verificarSaldo() {
        System.out.println("O saldo da conta é de R$" + this.montante);
    }

    public void exibir() {
        System.out.println("Nome da Conta: " + this.nomeDaConta);
        System.out.println("Nome do Correntista: " + this.nomeDoCorrentista);
        System.out.println("Montante: R$" + this.montante);
    }
