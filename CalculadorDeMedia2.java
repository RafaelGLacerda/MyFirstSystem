import java.util.Scanner;

public class aluno1 {

private static String nome;
private static long matricula;
private static double nota;
private static int tamanho;


Scanner sc = new Scanner(System.in);

public void nome(){
System.out.print("Digite o nome do aluno: ");
nome = sc.nextLine();
}
public void matricula(){
System.out.print("Digite o numero de matricula: ");
matricula = sc.nextInt();
}


}
