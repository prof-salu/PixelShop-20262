package com.pixelshop;

import com.pixelshop.modelo.JogoDigital;
import com.pixelshop.modelo.JogoFisico;
import com.pixelshop.modelo.Produto;
import com.pixelshop.modelo.Promovivel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        Produto p1 = null;
        Produto p2 = new JogoDigital("sonic", 200,
                            80, 120);

        System.out.println("Bem-vindos a Pixel SHOP!!!!");
        do{
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("1- Cadastrar novo produto");
            System.out.println("2- Consultar dados");
            System.out.println("3- Adicionar produtos ao estoque");
            System.out.println("4- Remover produtos do estoque");
            System.out.println("5- Aplicar desconto");
            System.out.println("6- Total de produtos cadastrados");
            System.out.println("7- Sair");
            System.out.print("Opção desejada: ");
            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao){
                case 1 -> {
                    if(p1 != null){
                        System.out.println("A loja não comporta mais produtos.");
                        continue;
                    }

                    System.out.print("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    System.out.print("Informe o preço do produto: ");
                    double preco = Double.parseDouble(entrada.nextLine());

                    System.out.print("Informe a quantidade em estoque: ");
                    int estoque = Integer.parseInt(entrada.nextLine());

                    System.out.println("Informe o tipo de midia: ");
                    System.out.println("1- Mídia Fisico");
                    System.out.println("2- Mídia Digital");
                    System.out.print("Tipo de mídia: ");
                    int tipo = Integer.parseInt(entrada.nextLine());

                    if(tipo == 1){
                        System.out.print("Informe a plataforma: ");
                        String plataforma = entrada.nextLine();

                        System.out.print("Tem manual impresso? [S, N]: ");
                        String manual = entrada.nextLine();

                        p1 = new JogoFisico(nome, preco,
                                            estoque, plataforma,
                                            manual.equalsIgnoreCase("s"));

                        if(p1.equals(p2)){
                            System.out.println("Jogo já cadastrado");
                            p1 = null;

                        }else{
                            System.out.println("Jogo Físico criado com sucesso!");
                        }
                    }else if(tipo == 2){
                        System.out.print("Informe o tamanho em Gigabytes: ");
                        int tamanho = Integer.parseInt(entrada.nextLine());

                        p1 = new JogoDigital(nome, preco, estoque, tamanho);

                        if(p1.equals(p2)){
                            System.out.println("Jogo já cadastrado");
                            p1 = null;
                        }else{
                            System.out.println("Jogo Digital criado com sucesso!");
                        }
                    }else{
                        System.out.println("Tipo de mídia inválida");
                    }
                }
                case 2 -> {
                    //Consulta dos dados pelo nome
                    System.out.print("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    if(p1 != null && p1.getNome().equalsIgnoreCase(nome)){
                        System.out.println(p1);
                    }else if(p2.getNome().equalsIgnoreCase(nome)){
                        System.out.println(p2);
                    }else{
                        System.out.println("Produto não encontrado.");
                    }
                }

                case 3 -> {
                    //Adicionar produtos ao estoque pelo nome
                    System.out.print("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    if(p1 != null && p1.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe a quantidade para adicionar: ");
                        int quantidade = Integer.parseInt(entrada.nextLine());
                        p1.adicionarEstoque(quantidade);
                    }else if(p2.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe a quantidade para adicionar: ");
                        int quantidade = Integer.parseInt(entrada.nextLine());
                        p2.adicionarEstoque(quantidade);
                    }else{
                        System.out.println("Produto não encontrado.");
                    }
                }
                case 4 -> {
                    //Remover produtos do estoque pelo nome
                    System.out.print("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    if(p1 != null && p1.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe a quantidade para remover: ");
                        int quantidade = Integer.parseInt(entrada.nextLine());
                        p1.removerEstoque(quantidade);
                    }else if(p2.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe a quantidade para remover: ");
                        int quantidade = Integer.parseInt(entrada.nextLine());
                        p2.removerEstoque(quantidade);
                    }else{
                        System.out.println("Produto não encontrado.");
                    }
                }

                case 5 -> {
                    //Aplicar descontos
                    System.out.print("Informe o percentual de desconto: ");
                    double percentual = Double.parseDouble(entrada.nextLine());
                    if(p1 instanceof Promovivel){
                        double desconto = ((JogoFisico) p1).calcularDesconto(percentual);
                        p1.setPreco(p1.getPreco() - desconto);
                    }else{
                        System.out.println("Nenhum produto elegivel.");
                    }
                }

                case 6 -> //Exibir toal de produtos
                        System.out.println("Produtos cadastrados: " + Produto.getTotalProdutosCadastrados());
                case 7 -> System.out.println("Saindo ...");
                default -> System.out.println("Opção inválida. Tente novamente");
            }
        }while(opcao != 7);
        System.out.println("Fim do programa.");
        entrada.close();
    }
}
