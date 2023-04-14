import java.util.Scanner;

public class CarrinhoDeCompras {
 public static void main(String[] args){

    int opção;
    Scanner sc = new Scanner(System.in);
    double soma = 0;

String[] produtos = {"0 - Camisa", "1 - Short", "2 - Calça", "3 - Sapato", "4 - Mochila", "5 - Relogio", "6 - Bone"};
double[] preço = {39.99 , 79.99 , 149.50 , 265.70 , 349.99 , 169.99 , 29.99};

do{
for(int i = 0; i < produtos.length; i++){
    System.out.println("Produto: " + produtos[i] + " " + "Preço: R$ " + preço[i]);
}
System.out.println();
System.out.print("Escolha o produto pelo numero indicado: ");
int escolha = sc.nextInt();
System.out.println();


if(escolha == 0){
    System.out.println(produtos[0] + " " + "R$ "+ preço[0]);
}else
if(escolha == 1){
    System.out.println(produtos[1] + " "+ "R$ "+ preço[1]);
}else
if(escolha == 2){
    System.out.println(produtos[2] + " "+ "R$ "+ preço[2]);
}
if(escolha == 3){
    System.out.println(produtos[3] + " "+ "R$ "+ preço[3]);
}else
if(escolha == 4){
    System.out.println(produtos[4] + " "+ "R$ "+ preço[4]);
}else
if(escolha == 5){
    System.out.println(produtos[5] + " "+ "R$ "+ preço[5]);
} else
if(escolha == 6){
    System.out.println(produtos[6] + " "+ "R$ "+ preço[6]);
}
soma += preço[escolha];

 
  System.out.println("Valor atual do carrinho de compras: R$ "  + soma);
  System.out.println();
  System.out.print("Adicionar mais produtos? (1)Sim 2(Nao): ");
  opção = sc.nextInt();
  System.out.println();
} while (opção == 1);

System.out.println("Valor total da compra: R$ " + soma);
}
}
