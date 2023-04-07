import java.util.Scanner;

public class ContaBancaria1{

private static long numero;
private static double saldo;
private static String titular;
private static double depositar;
private static double sacar;

Scanner sc = new Scanner(System.in);

public void titular(){
System.out.print("Digite o nome do titular: ");
titular = sc.nextLine();
}
public void numero(){
System.out.print("Digite o numero do titular: ");
numero = sc.nextInt();
}
public void saldo(){
System.out.print("Digite o valor do seu saldo: R$ ");
saldo = sc.nextDouble();
}
public void depositar(){
System.out.print("Digite o valor que deseja depositar: R$ ");
depositar = sc.nextDouble();

}
public void sacar(){
System.out.print("Digite o valor que deseja sacar: R$ ");
sacar = sc.nextDouble();

}
public void saldoAtualizado(){
saldo += depositar;
saldo -= sacar;
}
public void exibir(){
    System.out.println("Dados Após Atualização: ");
    System.out.println("Titular: " +titular);
    System.out.println("Numero: " +numero);
    System.out.println("Saldo: R$ " +saldo);
}

}
