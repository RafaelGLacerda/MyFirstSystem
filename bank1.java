 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe os dados da conta:");
        System.out.print("Nome da Conta: ");
        String nomeDaConta = input.nextLine();

        System.out.print("Nome do Correntista: ");
        String nomeDoCorrentista = input.nextLine();

        System.out.print("Montante inicial: R$");
        double montante = input.nextDouble();

        Bank2 conta = new Bank2(nomeDaConta, nomeDoCorrentista, montante);

        System.out.println("\nDados da conta:");
        conta.exibir();

        System.out.print("\nInforme o valor a ser depositado: R$");
        double valorDeposito = input.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Informe o valor a ser sacado: R$");
        double valorSaque = input.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("\nDados da conta atualizados:");
        conta.exibir();
    }
}
