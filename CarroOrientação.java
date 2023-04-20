class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

public Carro(String marca, String modelo, int ano, double velocidade){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.velocidade = velocidade;
}
public String getMarca(){
    return marca;
}
public String getModelo(){
    return modelo;
}
public int getAno(){
    return ano;
}
public double getVelocidade(){
    return velocidade;
}
}
public class CarroOrientação{
    public static void main(String[] args){

Carro carro1 = new Carro("Fiat", "Sedã", 2019, 220);
Carro carro2 = new Carro("Porshe", "Conversível", 2015, 330);
Carro carro3 = new Carro("chevrolet", "Picape", 2022, 200);

System.out.println("-----> Informações do Carro: <-----");
System.out.println();
System.out.println("Marca: " + carro1.getMarca() + ", Modelo: " + carro1.getModelo() + ", Ano: " + carro1.getAno() + ", Velocidade: " + carro1.getVelocidade() + " Km/h");
System.out.println("Marca: " + carro2.getMarca() + ", Modelo: " + carro2.getModelo() + ", Ano: " + carro2.getAno() + ", Velocidade: " + carro2.getVelocidade() + " Km/h");
System.out.println("Marca: " + carro3.getMarca() + ", Modelo: " + carro3.getModelo() + ", Ano: " + carro3.getAno() + ", Velocidade: " + carro3.getVelocidade() + " Km/h");

    }
}
