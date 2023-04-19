class ContaBancaria {
    protected String cliente;
    protected int num_conta;
    protected float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + valor + ".");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da conta: " + num_conta);
        System.out.println("Saldo: R$" + saldo);
    }
}

class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        if (diaRendimento == diaAtual()) {
            float rendimento = saldo * (taxaRendimento / 100);
            saldo += rendimento;
            System.out.println("Rendimento de R$" + rendimento + " aplicado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Hoje não é o dia de rendimento.");
        }
    }

    private int diaAtual() {
       
        return 18; 
    }
}

class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    public void sacar(float valor) {
        float saldoComLimite = saldo + limite;
        if (saldoComLimite >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + valor + ".");
        }
    }
}

class Contas {
    public static void main(String[] args) {
   
        ContaBancaria conta1 = new ContaBancaria("Cliente 1", 1, 1000);
        ContaPoupanca conta2 = new ContaPoupanca("Cliente 2", 2, 2000, 15);
        ContaEspecial conta3 = new ContaEspecial("Cliente 3", 3, 3000, 500);

       
        conta1.sacar(500);
        conta1.depositar(1000);

        conta2.sacar(150);
        conta2.depositar(200);

        conta3.sacar(400);
        conta3.depositar(300);

           
            float taxaRendimento = 0.5f; 
            conta2.calcularNovoSaldo(taxaRendimento);

          
           System.out.println("Dados da Conta 1:");
           conta1.mostrarDados();

           System.out.println("\nDados da Conta 2:");
           conta2.mostrarDados();

           System.out.println("\nDados da Conta 3:");
           conta3.mostrarDados();
}
}
