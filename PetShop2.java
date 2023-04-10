import java.util.Scanner;

public class CadastroPet1 {
    
Scanner sc = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);

private static String animal;
private static String nome;
private static String especie;
private static String sexo;
private static String cores;
private static int idade;
private static double peso;
private static double altura;
private static double comprimento;
private static String descrição;

public void animal(){
    System.out.print("Escreva o TIPO de animal: ");
    animal = sc.nextLine();
}
public void nome(){
    System.out.print("Escreva o NOME do animal: ");
    nome = sc.nextLine();
}
public void especie(){
    System.out.print("Escreva a ESPECIE do animal: ");
    especie = sc.nextLine();
}
public void sexo(){
    System.out.print("Escreva o SEXO do animal: ");
    sexo = sc.nextLine();
}
public void cores(){
    System.out.print("Escreva as CORES do animal: ");
    cores = sc.nextLine();
}
public void idade(){
    System.out.print("Escreva a IDADE do animal: ");
    idade = sc.nextInt();
}
public void peso(){
    System.out.print("Escreva o PESO do animal: ");
    peso = sc.nextDouble();
}
public void altura(){
    System.out.print("Escreva a ALTURA (em centimetros) do animal: ");
    altura = sc.nextDouble();
}
public void comprimento(){
    System.out.print("Escreva o COMPRIMENTO (em centimetros) do animal: ");
    comprimento = sc.nextDouble();
}
public void descrição(){
    System.out.print("Escreva uma descrição do animal ou informações adicionais: ");
    descrição = sc2.nextLine();
}
public void exibir(){

    System.out.println();
    System.out.println();
    System.out.println("Cadastro Atualizado: ");
    System.out.println("Tipo de animal: " +animal);
    System.out.println("Nome do animal: " +nome);
    System.out.println("Especie do animal: " +especie);
    System.out.println("Sexo do animal: " +sexo);
    System.out.println("Cores do animal: " +cores);
    System.out.println("Idade do animal: " +idade+ " anos");
    System.out.println("Peso do animal: " +peso+ " Kg");
    System.out.println("Altura do animal: " +altura+ " cm");
    System.out.println("Comprimento do animal: " +comprimento+ " cm");
    System.out.println("Descrição do animal: " +descrição);

}

}
