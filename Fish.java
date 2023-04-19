class Animal {
private String nome;

 
public Animal(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}
}
class Peixe extends Animal {
    private String caracteristicas;

public Peixe(String nome, String caracteristicas) {
super(nome);
this.caracteristicas = caracteristicas;
}

    
public String getCaracteristicas() {
return caracteristicas;
}

    
public void setCaracteristicas(String caracteristicas) {
this.caracteristicas = caracteristicas;
}
}

public class Fish {
public static void main(String[] args) {
        
Peixe peixe1 = new Peixe("Tilapia", "A Tilápia é um peixe de escamas, com corpo um pouco alto e comprimido e com uma coloração que varia muito.");
Peixe peixe2 = new Peixe("Peixe-Palhaço", "peixe e palhaço XD?");
Peixe peixe3 = new Peixe("Peixe-Boi", "peixe que nada e corre!");



 System.out.println("Nome do peixe: " + peixe1.getNome());
 System.out.println("Características do peixe: " + peixe1.getCaracteristicas());
 System.out.println();
 System.out.println("Nome do peixe: " + peixe2.getNome());
 System.out.println("Características do peixe: " + peixe2.getCaracteristicas());
 System.out.println();
 System.out.println("Nome do peixe: " + peixe3.getNome());
 System.out.println("Características do peixe: " + peixe3.getCaracteristicas()); 
    
    }
}
