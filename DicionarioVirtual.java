import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayMapson {
    public static void main(String[] args){

Scanner sc = new Scanner(System.in);

Map<Integer, String> wiki = new HashMap<>();

wiki.put(1, "jurídico - em conformidade com os princípios do direito; que se faz por via da justiça; lícito, legal.");
wiki.put(2, "resiliência - termo fisico: Capacidade de transformar estresse em trabalho.");
wiki.put(3, "dissensão - falta de concordância a respeito de (algo); divergência, discrepância.");
wiki.put(4, "consonância - concordância, acordo, conformidade.");
wiki.put(5, "negligenciar - tratar(-se) com negligência; descuidar(-se), desleixar(-se).");

System.out.println("-----> Dicionario Virtual: <-----");
System.out.println();
System.out.print("Digite um numero de 1 a 5 para uma palavra e significado: ");
int numero = sc.nextInt();
System.out.println();

if(wiki.containsKey(numero)){
    System.out.println("Palavra: " + wiki.get(numero));
} else{
    System.out.println("Palavra não encontrada.");
}


    }
}
