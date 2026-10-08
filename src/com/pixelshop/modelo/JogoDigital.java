package com.pixelshop.modelo;

public class JogoDigital extends Produto{
    private int tamanhoJogo;

    public JogoDigital(String nome, double preco,
                       int quantidadeEstoque, int tamanhoJogo) {
        super(nome, preco, quantidadeEstoque);
        this.tamanhoJogo = tamanhoJogo;
    }

    public int getTamanhoJogo() {
        return tamanhoJogo;
    }

    public void setTamanhoJogo(int tamanhoJogo) {
        this.tamanhoJogo = tamanhoJogo;
    }

    @Override
    public String toString() {
        return "Jogo Digital" + super.toString() +
                ", tamanhoJogo=" + tamanhoJogo +
                '}';
    }
}
