class atributos{
    private int vida;
    private int força;
    private int mana;
    private int armadura;
    private int resistencia;
    private int chanceCritico;
    private String velocidade;
public atributos(int vida, int força, int mana, int armadura,int resistencia, int chanceCritico, String velocidade ){
    this.vida = vida;
    this.força = força;
    this.mana = mana;
    this.armadura = armadura;
    this.resistencia = resistencia;
    this.chanceCritico = chanceCritico;
    this.velocidade = velocidade;
}
public int getVida(){
    return vida;
}
public int getForça(){
    return força;
}
public int getMana(){
    return mana;
}
public int getArmadura(){
    return armadura;
}
public int getResistencia(){
    return resistencia;
}
public int getChanceCritico(){
    return chanceCritico;
}
public String getVelocidade(){
    return velocidade;
}
}
public class RPG{
public static void main(String[] args){

    atributos Guerreiro = new atributos(1000, 100,50, 200, 100, 50, "Media");
    atributos Arqueiro = new atributos(800, 250, 100, 50, 50, 80, "Rapido");
    atributos Mago = new atributos(650, 350, 150, 25, 25, 40, "Lento");  

System.out.println(" -----> Atributo das Classes <-----");
System.out.println();
System.out.println("Guerreiro: " + " Vida: " + Guerreiro.getVida() + ", força: " + Guerreiro.getForça() + ", Mana: " + Guerreiro.getMana() + ", Armadura: " + Guerreiro.getArmadura() + ", Resistencia: " + Guerreiro.getResistencia() + ", Chance De Critico: " + Guerreiro.getChanceCritico() + "%" + ", Velocidade: " + Guerreiro.getVelocidade());
System.out.println("Arqueiro: " + " Vida: " + Arqueiro.getVida() + ", força: " + Arqueiro.getForça() + ", Mana: " + Arqueiro.getMana() + ", Armadura: " + Arqueiro.getArmadura() + ", Resistencia: " + Guerreiro.getResistencia() + ", Chance De Critico: " + Arqueiro.getChanceCritico() + "%" + ", Velocidade: " + Arqueiro.getVelocidade());
System.out.println("Mago: " + " Vida: " + Mago.getVida() + ", força: " + Mago.getForça() + ", Mana: " + Mago.getMana() + ", Armadura: " + Mago.getArmadura() + ", Resistencia: " + Mago.getResistencia() + ", Chance De Critico: " + Mago.getChanceCritico() + "%" + ", Velocidade: " + Mago.getVelocidade());

    }
}
