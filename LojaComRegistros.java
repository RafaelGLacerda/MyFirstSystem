import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ParteCima {
    private String nomeProduto;
    private String cor;
    private String preco;
    private String tamanho;
    private String material;
    private String gola;
    private String manga;
    private String tipoProduto;

    public ParteCima(String nomeProduto, String cor, String preco, String tamanho, String material, String gola, String manga, String tipoProduto) {
        this.nomeProduto = nomeProduto;
        this.cor = cor;
        this.preco = preco;
        this.tamanho = tamanho;
        this.material = material;
        this.gola = gola;
        this.manga = manga;
        this.tipoProduto = tipoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String mostra() {
        return "Nome do Produto: " + nomeProduto +
                ", Cor: " + cor +
                ", Preço: " + preco +
                ", Tamanho: " + tamanho +
                ", Material: " + material +
                ", Gola: " + gola +
                ", Manga: " + manga +
                ", Tipo de Produto: " + tipoProduto;
    }
}

class ParteBaixo {
    private String nomeProduto;
    private String cor;
    private String preco;
    private String tamanho;
    private String material;
    private String cintura;
    private String ziper;
    private String tipoProduto;

    public ParteBaixo(String nomeProduto, String cor, String preco, String tamanho, String material, String cintura, String ziper, String tipoProduto) {
        this.nomeProduto = nomeProduto;
        this.cor = cor;
        this.preco = preco;
        this.tamanho = tamanho;
        this.material = material;
        this.cintura = cintura;
        this.ziper = ziper;
        this.tipoProduto = tipoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String mostra() {
        return "Nome do Produto: " + nomeProduto +
                ", Cor: " + cor +
                ", Preço: " + preco +
                ", Tamanho: " + tamanho +
                ", Material: " + material +
                ", Cintura: " + cintura +
                ", Zíper: " + ziper +
                ", Tipo de Produto: " + tipoProduto;
    }
}

public class Main {
    private List<ParteCima> partesCimas = new ArrayList<>();
    private List<ParteBaixo> partesBaixas = new ArrayList<>();

    public void adicionarProduto() {
        Scanner lei = new Scanner(System.in);
        System.out.println("Digite o tipo de produto (Cima/Baixo):");
        String tipoProduto = lei.nextLine();
        System.out.println("Digite o nome do produto:");
        String nomeProduto = lei.nextLine();
        System.out.println("Digite a cor:");
        String cor = lei.nextLine();
        System.out.println("Digite o preço:");
        String preco = lei.nextLine();
        System.out.println("Digite o tamanho:");
        String tamanho = lei.nextLine();
        System.out.println("Digite o material:");
        String material = lei.nextLine();

        if (tipoProduto.equalsIgnoreCase("Cima")) {
            System.out.println("Digite o tipo de gola:");
            String gola = lei.nextLine();
            System.out.println("Digite o tipo de manga:");
            String manga = lei.nextLine();
            ParteCima parteCima = new ParteCima(nomeProduto, cor, preco, tamanho, material, gola, manga, tipoProduto);
            partesCimas.add(parteCima);
            System.out.println("Parte de cima cadastrada com sucesso!");
        } else if (tipoProduto.equalsIgnoreCase("Baixo")) {
            System.out.println("Digite o tipo de cintura:");
            String cintura = lei.nextLine();
            System.out.println("Digite o tipo de zíper:");
            String ziper = lei.nextLine();
            ParteBaixo parteBaixo = new ParteBaixo(nomeProduto, cor, preco, tamanho, material, cintura, ziper, tipoProduto);
            partesBaixas.add(parteBaixo);
            System.out.println("Parte de baixo cadastrada com sucesso!");
        } else {
            System.out.println("Tipo de produto inválido!");
        }
    }

    public void buscarProdutoPorNome() {
        Scanner lei = new Scanner(System.in);
        System.out.println("Digite o nome do produto que deseja buscar:");
        String nomeProduto = lei.nextLine();
        boolean produtoEncontrado = false;

        for (ParteCima parteCima : partesCimas) {
            if (parteCima.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                System.out.println("Produto encontrado na parte de cima do catálogo:");
                System.out.println(parteCima.mostra());
                produtoEncontrado = true;
            }
        }

        for (ParteBaixo parteBaixo : partesBaixas) {
            if (parteBaixo.getNomeProduto().equalsIgnoreCase(nomeProduto)) {
                System.out.println("Produto encontrado na parte de baixo do catálogo:");
                System.out.println(parteBaixo.mostra());
                produtoEncontrado = true;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado no catálogo.");
        }
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de Roupas:");
        System.out.println("Partes de cima:");

        for (ParteCima parteCima : partesCimas) {
            System.out.println(parteCima.mostra());
        }

        System.out.println("Partes de baixo:");

        for (ParteBaixo parteBaixo : partesBaixas) {
            System.out.println(parteBaixo.mostra());
        }
    }

    public static void main(String[] args) {
        Main catalogo = new Main();
        Scanner lei = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("===== Catálogo de Roupas =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Buscar produto pelo nome");
            System.out.println("3 - Mostrar catálogo");
            System.out.println("4 - Sair");
            System.out.println("Digite uma opção:");

            opcao = lei.nextInt();
            lei.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    catalogo.adicionarProduto();
                    break;
                case 2:
                    catalogo.buscarProdutoPorNome();
                    break;
                case 3:
                    catalogo.mostrarCatalogo();
                    break;
                case 4:
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
// pedir pro chat gpt: mudar classe de Main para Programa, comentar o que cada coisa faz;
// criar uma nova funcao de listar os produtos de forma ordenada;
// creiar uma nova funcao para remover ou alterar produtos.
