package edu.Lucas;
public class Pessoa {
    //Atributos
    private String nome = "Lucas";
    private int idade = 20;
    private double altura = 1.80;

    //Métodos
    //<modificador-acesso> <tipo-retorno> nomeMetodo()
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}