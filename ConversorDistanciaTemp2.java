import java.util.Scanner;

public class conversortotal1 {

Scanner sc = new Scanner(System.in);

    static double celciusParaFahrenheit;
    static double fahrenheitParaCelcius;
    static double quilometrosParaMilhas;
    static double milhasParaQuilometros;


public void celciusParaFahrenheit(){
System.out.print("Digite a temperatura em CElCIUS: ");
celciusParaFahrenheit = sc.nextDouble();

double calculo1 = celciusParaFahrenheit*1.8+32;

System.out.println();
System.out.println(celciusParaFahrenheit + " Celcius para Fahrenheit = " + calculo1);
}
public void fahrenheitParaCelcius(){
    System.out.print("Digite a temperatura em Fahrenheit: ");
    fahrenheitParaCelcius = sc.nextDouble();
    
    double calculo2 = (fahrenheitParaCelcius - 32) / 1.8;
    
    System.out.println();
    System.out.println(fahrenheitParaCelcius + " fahrenheit para Celcius = " + calculo2);
    }
public void quilometrosParaMilhas(){
    System.out.print("Digite a distancia em KM: ");
    quilometrosParaMilhas = sc.nextDouble();

    double calculo3 = quilometrosParaMilhas / 1.609;

    System.out.println();
    System.out.println(quilometrosParaMilhas + " KM em Milhas é = " + calculo3);
}
public void milhasParaQuilometros(){
    System.out.print("Digite a distancia em KM: ");
    milhasParaQuilometros = sc.nextDouble();

    double calculo4 = milhasParaQuilometros*1.609;

    System.out.println();
    System.out.println(milhasParaQuilometros + " milhar em KM é = " + calculo4);
}
