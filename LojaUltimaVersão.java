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

public class Programa {
    private List<Produto> produtos = new ArrayList<>();

      // Método para adicionar um produto ao catálogo
    public void adicionarProduto() {
        Scanner lei = new Scanner(System.in);

        
        System.out.println("Digite o código do produto:");
        int codigoProduto = lei.nextInt();
        lei.nextLine();
        System.out.println("Digite o tipo de produto (Cima/Baixo):");
        String tipoProduto = lei.nextLine();

        System.out.println("Digite o nome do produto:");
        String nomeProduto = lei.nextLine();

        System.out.println("Digite a cor do produto:");
        String cor = lei.nextLine();
        System.out.println("Digite o preço do produto:");
        String preco = lei.nextLine();
        System.out.println("Digite o tamanho do produto:");
        String tamanho = lei.nextLine();
        System.out.println("Digite o material do produto:");
        String material = lei.nextLine();

        String tipoZiper = "";
        String tipoCintura = "";
        String tipoGola = "";
        String tipoManga = "";

        if (tipoProduto.equalsIgnoreCase("Cima")) {
            System.out.println("Digite o tipo de gola do produto:");
            tipoGola = lei.nextLine();
            System.out.println("Digite o tipo de manga do produto:");
            tipoManga = lei.nextLine();
        } else if (tipoProduto.equalsIgnoreCase("Baixo")) {
            System.out.println("Digite o tipo de zíper do produto:");
            tipoZiper = lei.nextLine();
            System.out.println("Digite o tipo de cintura do produto:");
            tipoCintura = lei.nextLine();
        }

        // Cria um novo objeto Produto com os dados informados
         Produto produto = new Produto(codigoProduto, nomeProduto, cor, preco, tamanho, material, tipoProduto, tipoZiper, tipoCintura, tipoGola, tipoManga);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
}

    // Método para listar todos os produtos do catálogo
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        // Ordena a lista de produtos em ordem alfabética pelo nome
        Collections.sort(produtos);

        System.out.println("----- Produtos -----");
        for (Produto produto : produtos) {
            System.out.println(produto.mostra());
        }
    }

    // Método para remover um produto do catálogo

public void removerProduto() {
    Scanner lei = new Scanner(System.in);
    System.out.println("Digite o código do produto que deseja remover:");
    int codigoProduto = lei.nextInt();
    lei.nextLine();

    // Verifica se existe um produto com o código informado e o remove
    boolean removido = false;
    for (Produto produto : produtos) {
        if (produto.getCodigoProduto() == codigoProduto) {
            produtos.remove(produto);
            removido = true;
            break;
        }
    }

    if (removido) {
        System.out.println("Produto removido com sucesso!");
    } else {
        System.out.println("Produto não encontrado.");
    }
}


    // Método para alterar os dados de um produto existente no catálogo
    public void alterarProduto() {
        Scanner lei = new Scanner(System.in);
        System.out.println("Digite o código do produto que deseja alterar:");
        int codigoProduto = lei.nextInt();
        lei.nextLine();
    
        boolean encontrado = false;
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getCodigoProduto() == codigoProduto) {
                encontrado = true;
                System.out.println("Produto encontrado. Insira os novos dados:");
    
    
                System.out.println("Digite o tipo de produto (Cima/Baixo):");
                String tipoProduto = lei.nextLine();
    
                System.out.println("Digite o nome do produto:");
                String novoNomeProduto = lei.nextLine();
    
                System.out.println("Digite a cor do produto:");
                String cor = lei.nextLine();
                System.out.println("Digite o preço do produto:");
                String preco = lei.nextLine();
                System.out.println("Digite o tamanho do produto:");
                String tamanho = lei.nextLine();
                System.out.println("Digite o material do produto:");
                String material = lei.nextLine();
    
                String tipoZiper = "";
                String tipoCintura = "";
                String tipoGola = "";
                String tipoManga = "";
    
                if (tipoProduto.equalsIgnoreCase("Cima")) {
                    System.out.println("Digite o tipo de gola do produto:");
                    tipoGola = lei.nextLine();
                    System.out.println("Digite o tipo de manga do produto:");
                    tipoManga = lei.nextLine();
                } else if (tipoProduto.equalsIgnoreCase("Baixo")) {
                    System.out.println("Digite o tipo de zíper do produto:");
                    tipoZiper = lei.nextLine();
                    System.out.println("Digite o tipo de cintura do produto:");
                    tipoCintura = lei.nextLine();
                }
    
                // Cria um novo objeto Produto com os dados informados
                Produto novoProduto = new Produto(codigoProduto, novoNomeProduto, cor, preco, tamanho, material, tipoProduto, tipoZiper, tipoCintura, tipoGola, tipoManga);
                produtos.set(i, novoProduto);
    
                System.out.println("Produto alterado com sucesso!");
                break;
            }
        }
    
        if (!encontrado) {
            System.out.println("Produto não encontrado.");
        }
    }
    
    // Método para pesquisar um produto pelo nome
    public void pesquisarProduto() {
        Scanner lei = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja pesquisar:");
        String nomeProduto = lei.nextLine();
    
        List<Produto> resultados = new ArrayList<>();
    
        for (Produto produto : produtos) {
            if (produto.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                resultados.add(produto);
            }
        }
    
        if (resultados.isEmpty()) {
            System.out.println("Produto não encontrado.");
        } else {
            System.out.println("----- Resultados da Pesquisa -----");
            for (Produto produto : resultados) {
                System.out.println(produto.mostra());
            }
        }
    }
    
    public static void main(String[] args) {
        Programa catalogo = new Programa();
        Scanner lei = new Scanner(System.in);
    
        int opcao = 0;
        // Lista de opções
        do {
            System.out.println("===== Catálogo de Roupas =====");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Alterar Produto");
            System.out.println("5 - Pesquisar Produto");
            System.out.println("6 - Sair");
            System.out.println("Digite a opção desejada:");
    
            opcao = lei.nextInt();
            lei.nextLine();
            
            // declaração de cada opção com um único número diferente
            switch (opcao) {
                case 1:
                    catalogo.adicionarProduto();
                    break;
                case 2:
                    catalogo.listarProdutos();
                    break;
                case 3:
                    catalogo.removerProduto();
                    break;
                case 4:
                    catalogo.alterarProduto();
                    break;
                case 5:
                    catalogo.pesquisarProduto();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
    
            System.out.println();
        } while (opcao != 6); // encerramento
    }
}
