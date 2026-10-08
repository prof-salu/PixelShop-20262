package com.pixelshop.testes;

import com.pixelshop.modelo.JogoDigital;
import com.pixelshop.modelo.JogoFisico;
import com.pixelshop.modelo.Produto;

public class TesteCriacaoProduto {
    public static void main(String[] args) {
        //Produto p1 = new Produto("Mouse Gamer", 200, 50);
        //Produto p2 = new Produto("Notebook", 4500, 70);
        //Produto p3 = new Produto("Iphone 18 Ultra", -15000, -10);

        Produto p1 = new JogoFisico("GTA VI", 100, 200, "PS5", true);
        Produto p2 = new JogoDigital("Tekken 8", 150, 200, 120);
        Produto p3 = new JogoDigital("Quake ", 50, 300, 20);

        p2.setPreco(3900);
        p1.adicionarEstoque(100);

        System.out.println("Produtos cadastrados: ");
        /*System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: R$" + p1.getPreco());
        System.out.println("Quantidade em estoque: " + p1.getQuantidadeEstoque());*/
        System.out.println(p1);
        System.out.println();
        /*System.out.println("Nome: " + p2.getNome());
        System.out.println("Preço: R$" + p2.getPreco());
        System.out.println("Quantidade em estoque: " + p2.getQuantidadeEstoque());*/
        System.out.println(p2);
        System.out.println();
        /*System.out.println("Nome: " + p3.getNome());
        System.out.println("Preço: R$" + p3.getPreco());
        System.out.println("Quantidade em estoque: " + p3.getQuantidadeEstoque());*/
        System.out.println(p3);


        p3.adicionarEstoque(30);
        p3.removerEstoque(10);
        System.out.println("Quantidade em estoque: " + p3.getQuantidadeEstoque());

    }
}
