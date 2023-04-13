public class estoque{
    public static void main(String[] args){
    


  String[] Produtos = {"camisa", "short", "calça", "sapato", "bolsa", "oculos", "relogio"};
  int[] quantidade = {10, 5, 12, 4, 8, 0, 0};
  double[] preço = {39.99 , 49.99 , 99.00 , 199.99, 399.00 , 59.99 , 269.99};

  for(int i = 0; i < Produtos.length; i++){ // aqui vão aparecer todos os produtos em ordem dos arrays, Ex: (camisa, 10, 39.99)
    if(quantidade[i] > 1){ // com esse metodo só vai mostrar os produtos que tiverem mais de 1, como relogio e oculos tem 0, então não aparecem
    System.out.println(Produtos[i] + " - quantidade " + quantidade[i] + " R$ " + preço[i]);
    }
    
  }
  
double maxPreco = -1; // inicializa o valor máximo como o menor possível
int indexMaxPreco = -1; // inicializa o índice do valor máximo como inválido

for (int i = 0; i < preço.length; i++) {
    if (preço[i] > maxPreco) {
        maxPreco = preço[i];
        indexMaxPreco = i;
    }
}
System.out.println();
// exibe o nome do produto e o preço correspondente
System.out.println("Produto mais caro: " + Produtos[indexMaxPreco] + " - Preço: R$ " + maxPreco);

    }
}
