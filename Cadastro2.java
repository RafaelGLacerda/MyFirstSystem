import java.util.Scanner;

public class people1 {

    Scanner sc = new Scanner(System.in);

    private static String nome;
    private static int idade;
    private static String sexo;
    private static long cpf;

    public void nome(){
    System.out.print("Digite aqui seu nome: ");
    nome = sc.nextLine();
    }
    public void idade(){
    System.out.print("Digite sua idade: ");
    idade = sc.nextInt();
    }
    public void cpf(){
        System.out.print("Digite seu CPF: ");
        cpf = sc.nextLong();
    }
    public void sexo(){
    System.out.print("Digite seu sexo: ");
    sexo = sc.next();
    }
    public void exibir(){
        System.out.println("Nome: " +nome);
        System.out.println("CPF: " +cpf);
        System.out.println("Sexo: " +sexo);
    }
    public void MostrarIdade(){
        if(idade>=18){
            System.out.println("Maior de Idade: " +idade);
        }else
        System.out.println("Menor de Idade: " +idade);
        }
    }
