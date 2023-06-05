import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Produto implements Comparable<Produto> {
    // Atributos do produto
    private int codigoProduto;
    private String nomeProduto;
    private String cor;
    private String preco;
    private String tamanho;
    private String material;
    private String tipoProduto;
    private String tipoZiper;
    private String tipoCintura;
    private String tipoGola;
    private String tipoManga;

     // Construtor da classe Produto
public Produto(int codigoProduto, String nomeProduto, String cor, String preco, String tamanho, String material, String tipoProduto, String tipoZiper, String tipoCintura, String tipoGola, String tipoManga) {
    this.codigoProduto = codigoProduto;
    this.nomeProduto = nomeProduto;
    this.cor = cor;
    this.preco = preco;
    this.tamanho = tamanho;
    this.material = material;
    this.tipoProduto = tipoProduto;
    this.tipoZiper = tipoZiper;
    this.tipoCintura = tipoCintura;
    this.tipoGola = tipoGola;
    this.tipoManga = tipoManga;
}



    // Métodos getters e setters para acessar e modificar os atributos do produto
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getTipoZiper() {
        return tipoZiper;
    }

    public void setTipoZiper(String tipoZiper) {
        this.tipoZiper = tipoZiper;
    }

    public String getTipoCintura() {
        return tipoCintura;
    }

    public void setTipoCintura(String tipoCintura) {
        this.tipoCintura = tipoCintura;
    }

    public String getTipoGola() {
        return tipoGola;
    }

    public void setTipoGola(String tipoGola) {
        this.tipoGola = tipoGola;
    }

    public String getTipoManga() {
        return tipoManga;
    }

    public void setTipoManga(String tipoManga) {
        this.tipoManga = tipoManga;
    }
    
    public int getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    // Método mostra() para exibir as informações do produto

public String mostra() {
    StringBuilder sb = new StringBuilder();
    sb.append("Codigo: ").append(codigoProduto)
            .append(", Nome do Produto: ").append(nomeProduto)
            .append(", Cor: ").append(cor)
            .append(", Preço: ").append(preco)
            .append(", Tamanho: ").append(tamanho)
            .append(", Material: ").append(material)
            .append(", Tipo de Produto: ").append(tipoProduto);

    // Verifica o tipo de produto e adiciona as características específicas correspondentes
    if (tipoProduto.equalsIgnoreCase("Cima")) {
        sb.append(", Tipo de Gola: ").append(tipoGola)
                .append(", Tipo de Manga: ").append(tipoManga);
    } else if (tipoProduto.equalsIgnoreCase("Baixo")) {
        sb.append(", Tipo de Zíper: ").append(tipoZiper)
                .append(", Tipo de Cintura: ").append(tipoCintura);
    }

    return sb.toString();
}


    // Implementação do método compareTo() da interface Comparable para permitir a comparação entre produtos
    public int compareTo(Produto outroProduto) {
        return nomeProduto.compareTo(outroProduto.getNomeProduto());
    }
}

