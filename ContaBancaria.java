import java.util.Scanner;

class bank{
    Scanner sc = new Scanner(System.in);
long numero;
String titular;
double saldo;
double deposito;
double saque;
public bank(long numero, String titular, double saldo, double deposito, double saque){
this.numero = numero;
this.titular = titular;
this.saldo = saldo;
this.deposito = deposito;
this.saque = saque;
}
public long getNumero(){
    return numero;
}
public String getTitular(){
    return titular;
}
public double getSaldo() {
    return saldo;
}
public void exibirsaldo(){
saldo += deposito;
saldo -= saque;
}
public void exibirDados(){
    System.out.println("-----> Dados Atualizados: <----- ");
    System.out.println("Titular: " + titular);
    System.out.println("Numero: " + numero);
    System.out.println("Saldo Atualizado: " + saldo);
}
}
public class ContaBancaria{
    public static void main(String[] args){
        
bank conta1 = new bank(045332432, "John Llstyle", 3500, 479.99, 25);
conta1.exibirsaldo();
conta1.exibirDados();

System.out.println();

bank conta2 = new bank(74327284, "Capinaelson santos", 7832, 350, 56.70);
conta2.exibirsaldo();
conta2.exibirDados();

    }
}
