import javax.swing.JOptionPane;

public class CarrinhoDeComprasApp {
    public static void main(String[] args) {

        int opcao;
        double soma = 0;

        String[] produtos = {"0 - Camisa", "1 - Short", "2 - Calça", "3 - Sapato", "4 - Mochila", "5 - Relógio",
                "6 - Bone"};
        double[] preco = {39.99, 79.99, 149.50, 265.70, 349.99, 169.99, 29.99};

        do {
            String escolha = JOptionPane.showInputDialog(null, "Escolha o produto pelo número indicado:\n"
                    + "0 - Camisa R$ 39.99\n"
                    + "1 - Short R$ 79.99\n"
                    + "2 - Calça R$ 149.50\n"
                    + "3 - Sapato R$ 265.70\n"
                    + "4 - Mochila R$ 349.99\n"
                    + "5 - Relógio R$ 169.99\n"
                    + "6 - Bone R$ 29.99\n");

            int opcaoEscolhida = Integer.parseInt(escolha);
            soma += preco[opcaoEscolhida];

            JOptionPane.showMessageDialog(null, "Produto adicionado:\n" + produtos[opcaoEscolhida] + "\nPreço: R$ "
                    + preco[opcaoEscolhida] + "\nValor atual do carrinho de compras: R$ " + soma);

            opcao = JOptionPane.showOptionDialog(null, "Deseja adicionar mais produtos?", "Carrinho de Compras",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        } while (opcao == JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Valor total da compra: R$ " + soma);
    }
}
