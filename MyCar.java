import java.util.Scanner;

class CarroInfo {
String modelo;
String marca;
int ano;
int opção;
int velocidade = 0;
Scanner sc = new Scanner(System.in);

public CarroInfo(String modelo, String marca, int ano){
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
}
public void exibirCarro(){
    System.out.println("-----> Informações do carro: <-----");
    System.out.println("Modelo: " + modelo);
    System.out.println("Marca: " + marca);
    System.out.println("Ano: " + ano);
}
public void AcelerarFrear() {
do {
 System.out.println("Digite (1) para acelerar, e (2) para frear! ");
opção = sc.nextInt();

if (opção == 1) {
  if (velocidade <= 300) {
      velocidade += 10;
System.out.println("O Carro está a: " + velocidade + " Km/h");
} else {
 System.out.println("O Carro está na velocidade máxima! " + velocidade + " Km/h");
  }
} else 
if (opção == 2) {
   if (velocidade >= 10) {
       velocidade -= 10;
System.out.println("O Carro está a: " + velocidade + " Km/h");
} else {
System.out.println("O Carro já está parado! " + velocidade + " Km/h" );
  }

} else {
System.out.println("Opção inválida!");
  }
} 

while (velocidade != 0);
System.out.println("O Carro parou!");
}

}
public class Carro{
    public static void main(String[] args){

CarroInfo c1 = new CarroInfo("SUV", "Chrevrolet", 2019);

c1.exibirCarro();
c1.AcelerarFrear();

    }
}
