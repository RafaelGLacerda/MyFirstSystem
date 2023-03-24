package projetosbasicos;
import java.util.Scanner;

public class Ano_Mes_Dia {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Quantos ano voce tem: ");
    int anos = sc.nextInt();
    
    System.out.print("Que mes voce nasceu: ");
    int meses = sc.nextInt();
    
    System.out.print("Dia que voce nasceu: ");
    int dias = sc.nextInt();
    
    int idadeEmDias = (anos * 365) + (meses * 30) + dias;
    
    System.out.println("A idade em dias é: " + idadeEmDias);
    
    sc.close();
  }
}
