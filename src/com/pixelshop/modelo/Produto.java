package com.pixelshop.modelo;

import java.util.Objects;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    private static int totalProdutosCadastrados;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
        totalProdutosCadastrados++;
    }

    //gets
    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public static int getTotalProdutosCadastrados(){return Produto.totalProdutosCadastrados;}

    public boolean setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
            return true;
        }else{
            this.preco = 0;
            return false;
        }
    }

    private boolean setQuantidadeEstoque(int quantidade){
        if(quantidade >= 0){
            this.quantidadeEstoque = quantidade;
            return true;
        }else{
            this.quantidadeEstoque = 0;
            return false;
        }
    }

    public boolean adicionarEstoque(int quantidade){
        if(quantidade > 0){
            this.quantidadeEstoque += quantidade;
            return true;
        }
        return false;
    }

    public boolean removerEstoque(int quantidade){
        if(quantidade > 0 && quantidadeEstoque - quantidade >= 0){
            this.quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(nome, produto.nome);
    }
}
