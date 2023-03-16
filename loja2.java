package faculdade;

public class simples {
	
public String produto;
public int quantidade;
public double preço;

public void addprodutos(int estoque) {
	this.quantidade += estoque;
}
public void subprodutos(int estoque) {
	this.quantidade -= estoque;
}


}
