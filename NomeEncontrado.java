import java.util.Scanner;

public class NomeEncontrado {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

    String[] nomes = {"Joao", "Lucas", "Pedro", "Maria", "Jhonsons", "Oliver", "Jayce", "Morgana","Bruno", "Annie"};

    System.out.print("Digite um nome: ");
    String nome = sc.nextLine();
    System.out.println();

int indice = -1;
for(int i = 0; i < nomes.length; i++){
    if(nomes[i].equalsIgnoreCase(nome)) {
    indice = i;
    break;
    }
}
if(indice == -1){
System.out.println("Nome não encontrado.");
} else{
    System.out.println("Nome encontrado: " + nomes[indice]);
}


    
    }
}
