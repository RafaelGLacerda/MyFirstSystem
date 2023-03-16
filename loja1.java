package faculdade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner (System.in);
		 
		 simples produto = new simples();
		 
		 
		 System.out.println("Nome do produto: ");
		 produto.produto = sc.next();
		 
		 
		 System.out.println("Quantidade do produto: ");
		 produto.quantidade = sc.nextInt();
		  
		 
		 System.out.println("Insira o preco do produto");
		 produto.preço = sc.nextDouble();
		 	 
		 
		 System.out.println("Confirmacao: " +produto.produto+",Estoque:" +produto.quantidade+ "Preco:" +produto.preço );
				 
		 
		 System.out.println("Deseja acrescentar mais unidades ao estoque? ");
		 int estoque = sc.nextInt();
		 produto.addprodutos (estoque);
		 System.out.println("Atualizacao: " +produto.produto+",Estoque atual:" +produto.quantidade+ "Preco:" +produto.preço);
		 
		 
		 System.out.println("Foi realizada alguma venda desse produto?");
		 estoque = sc.nextInt();
		 produto.subprodutos (estoque);
		 System.out.println("Atualizacao apos vendas: " +produto.produto+",Estoque atual:" +produto.quantidade+ "Preco:" +produto.preço+ " Valor atual do estoque desse produto: R$"+produto.quantidade*produto.preço);
		 
		 
		 sc.close();
		 

      
	}

}
