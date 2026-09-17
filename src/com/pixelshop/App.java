package com.pixelshop;

import com.pixelshop.modelo.Produto;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        Produto p1 = null;
        Produto p2 = new Produto("Mouse RGB", 200, 80);

        System.out.println("Bem-vindos a Pixel SHOP!!!!");
        do{
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("1- Cadastrar novo produto");
            System.out.println("2- Consultar dados");
            System.out.println("3- Adicionar produtos ao estoque");
            System.out.println("4- Remover produtos do estoque");
            System.out.println("5- Alterar preço de produto");
            System.out.println("6- Sair");
            System.out.print("Opção desejada: ");
            opcao = Integer.parseInt(entrada.nextLine());

            switch (opcao){
                case 1 -> {
                    if(p1 != null && p2 != null){
                        System.out.println("A loja não comporta mais produtos.");
                        continue;
                    }

                    if(p1 == null){
                        System.out.print("Informe o nome do produto: ");
                        String nome = entrada.nextLine();

                        System.out.print("Informe o preço do produto: ");
                        double preco = Double.parseDouble(entrada.nextLine());

                        System.out.print("Informe a quantidade em estoque: ");
                        int estoque = Integer.parseInt(entrada.nextLine());

                        p1 = new Produto(nome, preco, estoque);
                        System.out.println("Produto criado com sucesso!");
                        continue;
                    }
                    if(p2 == null){
                        System.out.print("Informe o nome do produto: ");
                        String nome = entrada.nextLine();

                        System.out.print("Informe o preço do produto: ");
                        double preco = Double.parseDouble(entrada.nextLine());

                        System.out.print("Informe a quantidade em estoque: ");
                        int estoque = Integer.parseInt(entrada.nextLine());

                        p2 = new Produto(nome, preco, estoque);
                        System.out.println("Produto criado com sucesso!");
                        continue;
                    }

                }
                case 2 -> {
                    //Consulta dos dados pelo nome
                    if(p1 == null && p2 == null){
                        System.out.println("Sem produto cadastrado.");
                        continue;
                    }
                    System.out.print("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    if(p1 != null && p1.getNome().equalsIgnoreCase(nome)){
                        System.out.printf("%s: R$%.2f\n",
                                            p1.getNome(),
                                            (p1.getQuantidadeEstoque() * p1.getPreco()));
                    }else if(p2 != null && p2.getNome().equalsIgnoreCase(nome)){
                        System.out.printf("%s: R$%.2f\n",
                                p2.getNome(),
                                (p2.getQuantidadeEstoque() * p2.getPreco()));
                    }else{
                        System.out.println("Produto não encontrado.");
                    }
                }

                case 3 -> {
                    //Adicionar produtos ao estoque pelo nome
                    if(p1 == null && p2 == null){
                        System.out.println("Sem produto cadastrado.");
                        continue;
                    }
                    System.out.print("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    if(p1 != null && p1.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe a quantidade para adicionar: ");
                        int quantidade = Integer.parseInt(entrada.nextLine());
                        p1.adicionarEstoque(quantidade);
                    }else if(p2 != null && p2.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe a quantidade para adicionar: ");
                        int quantidade = Integer.parseInt(entrada.nextLine());
                        p2.adicionarEstoque(quantidade);
                    }else{
                        System.out.println("Produto não encontrado.");
                    }
                }
                case 4 -> {
                    //Remover produtos do estoque pelo nome
                    if(p1 == null && p2 == null){
                        System.out.println("Sem produto cadastrado.");
                        continue;
                    }
                    System.out.print("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    if(p1 != null && p1.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe a quantidade para remover: ");
                        int quantidade = Integer.parseInt(entrada.nextLine());
                        p1.removerEstoque(quantidade);
                    }else if(p2 != null && p2.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe a quantidade para remover: ");
                        int quantidade = Integer.parseInt(entrada.nextLine());
                        p2.removerEstoque(quantidade);
                    }else{
                        System.out.println("Produto não encontrado.");
                    }
                }

                case 5 -> {
                    //Alterar preço pelo nome
                    if(p1 == null && p2 == null){
                        System.out.println("Sem produto cadastrado.");
                        continue;
                    }
                    System.out.print("Informe o nome do produto: ");
                    String nome = entrada.nextLine();

                    if(p1 != null && p1.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe o novo preço: ");
                        double preco = Double.parseDouble(entrada.nextLine());
                        p1.setPreco(preco);
                    }else if(p2 != null && p2.getNome().equalsIgnoreCase(nome)){
                        System.out.print("Informe o novo preço: ");
                        double preco = Double.parseDouble(entrada.nextLine());
                        p2.setPreco(preco);
                    }else{
                        System.out.println("Produto não encontrado.");
                    }
                }
                case 6 -> {
                    System.out.println("Saindo ...");
                }
                default -> {
                    System.out.println("Opção inválida. Tente novamente");
                }
            }
        }while(opcao != 6);
        System.out.println("Fim do programa.");
        entrada.close();
    }
}
