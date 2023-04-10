import java.util.Scanner;

public class triangulo1 {
    
    private static double base;
    private static double altura;
    private static double lado1;
    private static double lado2;
    private static double lado3;

Scanner sc = new Scanner(System.in);

public void base(){
    System.out.print("Digite o valor da BASE do triangulo: ");
    base = sc.nextDouble();
}
public void altura(){
    System.out.print("Digite o valor da ALTURA do triangulo: ");
    altura = sc.nextDouble();
}
public void lado1(){
    System.out.print("Digite o valor do LADO1 do triangulo: ");
    lado1 = sc.nextDouble();
}
public void lado2(){
    System.out.print("Digite o valor do LADO 2 do triangulo: ");
    lado2 = sc.nextDouble();
}
public void lado3(){
    System.out.print("Digite o valor do LADO 3 do triangulo: ");
    lado3 = sc.nextDouble();
}
public void perimetro(){
    System.out.println();
System.out.println("O perimetro do triangulo é: " + (lado1+lado2+lado3));
}
public void area(){
    System.out.println();
System.out.println("A area do triangulo é: " + ((base*altura)/2));
}
