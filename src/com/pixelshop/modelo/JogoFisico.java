package com.pixelshop.modelo;

public class JogoFisico extends Produto implements Promovivel{
    private String plataforma;
    private boolean manualImpresso;

    public JogoFisico(String nome, double preco,
                      int quantidadeEstoque, String plataforma, boolean manualImpresso) {
        super(nome, preco, quantidadeEstoque);
        this.plataforma = plataforma;
        this.manualImpresso = manualImpresso;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public boolean isManualImpresso() {
        return manualImpresso;
    }

    public void setManualImpresso(boolean manualImpresso) {
        this.manualImpresso = manualImpresso;
    }

    @Override
    public String toString() {
        return "Jogo Físico" + super.toString() +
                ", plataforma='" + plataforma + '\'' +
                ", manualImpresso=" + manualImpresso +
                '}';
    }

    @Override
    public double calcularDesconto(double desconto) {
        return (getPreco() * desconto) / 100;
    }
}
