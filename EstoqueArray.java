public class estoque{
    public static void main(String[] args){
    


  String[] Produtos = {"camisa", "short", "calça", "sapato", "bolsa", "oculos", "relogio"};
  int[] quantidade = {10, 5, 12, 4, 8, 0, 0};
  double[] preço = {39.99 , 49.99 , 99.00 , 199.99, 399.00 , 59.99 , 269.99};

  for(int i = 0; i < Produtos.length; i++){ // aqui vão aparecer todos os produtos em ordem dos arrays, Ex: (camisa, 10, 39.99)
    if(quantidade[i] > 1){ // com esse metodo só vai mostrar os produtos que tiverem com a quantidade maior que 1, como relogio e oculos tem 0, então não aparecem
    System.out.println(Produtos[i] + " - quantidade " + quantidade[i] + " R$ " + preço[i]);
    }
  }


    }
}
