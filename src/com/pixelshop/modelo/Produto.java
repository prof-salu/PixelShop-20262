package com.pixelshop.modelo;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
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
}
