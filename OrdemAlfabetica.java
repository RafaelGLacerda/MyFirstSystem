import java.util.Arrays;
import java.util.Scanner;

public class OrdemAlfabetica{
    public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.print("Digite a quantidade de nomes: ");
int quantidade = sc.nextInt();

String[] nomes = new String[quantidade];

for(int i = 0; i < nomes.length; i++){
System.out.print("Digite o nome " + (i + 1) + ": ");
nomes[i] = sc.next();
}

Arrays.sort(nomes); // isso que deixa em ordem alfabetica :)

System.out.println();
System.out.println("Nomes na ordem alfabetica");
for(String nome : nomes){
System.out.println(nome);
}


    }
}
