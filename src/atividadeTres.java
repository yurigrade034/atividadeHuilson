import java.util.Scanner;

public class atividadeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double financeiro = 100.0;
        String produtoEstoque = "Nenhum";
        int qtdEstoque = 0;
        double precoCusto = 0;
        boolean continuar = true;

        System.out.println("---> Sistema de Gerenciamento <---");
        System.out.println("Atualmente você começa com RS100 de caixa");

        while (continuar) {
            System.out.println("\nO que voce deseja fazer? \n1-Compra \n2-Venda \n3-Estoque \n4-Financeiro \n0-Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Nome do produto: ");
                produtoEstoque = sc.nextLine();
                System.out.println("Preço de custo: ");
                precoCusto = sc.nextDouble();
                System.out.println("Quantidade: ");
                int qtdCompra = sc.nextInt();

                double totalCompra = precoCusto * qtdCompra;

                if (totalCompra <= financeiro) {
                    financeiro -= totalCompra;
                    qtdEstoque += qtdCompra;
                    System.out.println("Compra realizada com sucesso");
                } else {
                    System.out.println("Saldo insuficiente, você tem apenas R$" + financeiro);
                }

            } else if (opcao == 2) {
                System.out.println("Quantas unidades de " + produtoEstoque + " deseja vender?");
                int qtdVenda = sc.nextInt();

                if (qtdVenda <= qtdEstoque) {
                    double valorVenda = (precoCusto * 1.05) * qtdVenda;
                    financeiro += valorVenda;
                    qtdEstoque -= qtdVenda;
                    System.out.println("Venda realizada, valor recebido: R$" + valorVenda);
                } else {
                    System.out.println("Estoque insuficiente, temos apenas " + qtdEstoque);
                }

            } else if (opcao == 3) {
                System.out.println("---> ESTOQUE <---");
                System.out.println("Produto: " + produtoEstoque);
                System.out.println("Quantidade: " + qtdEstoque);

            } else if (opcao == 4) {
                System.out.println("---> FINANCEIRO <---");
                System.out.println("Saldo em caixa: R$" + financeiro);

            } else if (opcao == 0) {
                continuar = false;
                System.out.println("Desligando o sistema");
            } else {
                System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}


//como nao foi pedido para criar uma lista de armazenamento se voce comprar um produto e
//depois outro ele só vai salvar o mais recente, e sinceramente apanhei pra montar isso aqui