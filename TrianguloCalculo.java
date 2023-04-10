import java.util.Scanner;

public class teste1 {
    public  static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int escolha;
    double base;
    double altura;
    double lado1;
    double lado2;
    double lado3;


    System.out.println("Calculo do Triangulo:");
    System.out.print("Digite 1 para (Area), Digite 2 para (Perimetro): ");
    escolha = sc.nextInt();

    if(escolha==1){
        System.out.print("Digite o valor da BASE do triangulo: ");
        base = sc.nextDouble();

        System.out.print("Digite o valor da ALTURA do triangulo: ");
        altura = sc.nextDouble();

        System.out.println();
        System.out.println("A area do triangulo é: " + ((base*altura)/2));
    }
    if(escolha==2){
        
        System.out.print("Digite o valor do LADO1 do triangulo: ");
        lado1 = sc.nextDouble();
        
      
        System.out.print("Digite o valor do LADO 2 do triangulo: ");
        lado2 = sc.nextDouble();
        
        
        System.out.print("Digite o valor do LADO 3 do triangulo: ");
        lado3 = sc.nextDouble();
        
        System.out.println();
        System.out.println("O perimetro do triangulo é: " + (lado1+lado2+lado3));
    }
    else
    System.out.println("essa opção não existe!");
    
