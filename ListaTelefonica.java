import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ListaTelefonica {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
Map<String, String> telefones = new TreeMap<>();
telefones.put("Maria", "(34) 0932-4213");
telefones.put("Pedro", "(70) 6323-3123");
telefones.put("Roberto", "(87) 3421-4213");
telefones.put("Bruno", "(21) 3214-5436");
telefones.put("Rafael", "(63) 1256-6454");

System.out.println("-----> Lista Telefonica: <-----");
System.out.println("Nomes abaixo:");
System.out.println();
for(String chave : telefones.keySet()){
    System.out.println(chave);
}
System.out.println();
System.out.print("Digite o nome da pessoa que deseja acessar o numero: ");
String nome = sc.next();

if(telefones.containsKey(nome)){
    System.out.println("Nome: " + nome + ", Numero: " + telefones.get(nome));
} else{
    System.out.println("Numero não encontrado.");
}

    }
}
