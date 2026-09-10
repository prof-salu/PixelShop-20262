package com.pixelshop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
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
                case 1 -> {}
                case 2 -> {}
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
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
