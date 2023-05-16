import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ParteCima {
    private String codigo;
    private String cor;
    private String preco;
    private String tamanho;
    private String material;
    private String gola;
    private String manga;

    public ParteCima(String codigo, String cor, String preco, String tamanho, String material, String gola, String manga) {
        this.codigo = codigo;
        this.cor = cor;
        this.preco = preco;
        this.tamanho = tamanho;
        this.material = material;
        this.gola = gola;
        this.manga = manga;
    }

    public String mostra() {
        return "Código: " + codigo +
                ", Cor: " + cor +
                ", Preço: " + preco +
                ", Tamanho: " + tamanho +
                ", Material: " + material +
                ", Gola: " + gola +
                ", Manga: " + manga;
    }
}

class ParteBaixo {
    private String codigo;
    private String cor;
    private String preco;
    private String tamanho;
    private String material;
    private String cintura;
    private String ziper;

    public ParteBaixo(String codigo, String cor, String preco, String tamanho, String material, String cintura, String ziper) {
        this.codigo = codigo;
        this.cor = cor;
        this.preco = preco;
        this.tamanho = tamanho;
        this.material = material;
        this.cintura = cintura;
        this.ziper = ziper;
    }

    public String mostra() {
        return "Código: " + codigo +
                ", Cor: " + cor +
                ", Preço: " + preco +
                ", Tamanho: " + tamanho +
                ", Material: " + material +
                ", Cintura: " + cintura +
                ", Zíper: " + ziper;
    }
}

public class Main {
    public void adicionarProduto() {
        Scanner lei = new Scanner(System.in);
        System.out.println("Digite o código:");
        String codigo = lei.next();
        System.out.println("Digite a cor:");
        String cor = lei.next();
        System.out.println("Digite o preço:");
        String preco = lei.next();
        System.out.println("Digite o tamanho:");
        String tamanho = lei.next();
        System.out.println("Digite o material:");
        String material = lei.next();
        System.out.println("Digite o tipo de gola:");
        String gola = lei.next();
        System.out.println("Digite o tipo de manga:");
        String manga = lei.next();

        ParteCima parteCima = new ParteCima(codigo, cor, preco, tamanho, material, gola, manga);
        Catalogo.partesCimas.add(parteCima);

        System.out.println("Parte de cima cadastrada com sucesso!");
    }

    public void mostrarCatalogo() {
        System.out.println("Catálogo de Roupas:");
        System.out.println("Partes de cima:");

        for (ParteCima parteCima : Catalogo.partesCimas) {
            System.out.println(parteCima.mostra());
        }

        System.out.println("Partes de baixo:");

        for (ParteBaixo parteBaixo : Catalogo.partesBaixas) {
            System.out.println(parteBaixo.mostra());
        }
    }
}

class Catalogo {
    static List<ParteCima> partesCimas = new ArrayList<>();
    static List<ParteBaixo> partesBaixas = new ArrayList<>();

    public static void main(String[] args) {
        Main processos = new Main();
        Scanner lei = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("===== Catálogo de Roupas =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Mostrar catálogo");
            System.out.println("3 - Sair");
            System.out.println("Digite uma opção:");

            opcao = lei.nextInt();

            switch (opcao) {
                case 1:
                    processos.adicionarProduto();
                    break;
                case 2:
                    processos.mostrarCatalogo();
                    break;
                case 3:
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
