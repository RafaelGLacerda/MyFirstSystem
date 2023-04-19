import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vooo {
public static void main(String[] args){

List<String> voo = new ArrayList<>();

voo.add("Compahia - Gol");
voo.add("Origem - Brasil, Salvador");
voo.add("Destino - França, Paris");
voo.add("Data do voo: 25/05/2023 ");
voo.add("Hora do voo: 14:30");
voo.add("Numero do Voo: 831289371-33");
voo.add("Total de Assentos: 100 (Poucos disponiveis)");
voo.add("Status do voo: Confirmado");

for(String elementos : voo){
System.out.println(elementos);
}
System.out.println();
Scanner sc = new Scanner(System.in);

List<Integer> assentos = new ArrayList<>();

assentos.add(5);
assentos.add(12);
assentos.add(21);
assentos.add(22);
assentos.add(24);
assentos.add(27);
assentos.add(29);
assentos.add(30);
assentos.add(32);
assentos.add(33);
assentos.add(34);
assentos.add(41);
assentos.add(43);
assentos.add(47);
assentos.add(55);
assentos.add(56);
assentos.add(57);
assentos.add(60);
assentos.add(62);
assentos.add(76);
assentos.add(78);
assentos.add(79);
assentos.add(85);
assentos.add(88);
assentos.add(96);
assentos.add(99);

for(int cadeiras : assentos){
System.out.println("Assento disponivel: " + cadeiras);
}
System.out.println();
System.out.print("Escolha entre um dos assentos disponiveis acima: ");
int escolha = sc.nextInt();

if (assentos.contains(escolha)) {
    System.out.println("Assento escolhido com sucesso!, " + escolha);
} else {
    System.out.println("Assento ocupado ou inexistente.");
}

}
}
