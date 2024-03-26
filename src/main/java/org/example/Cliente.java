package org.example;

public class Cliente {
    private String cpf;
    private String nome;
    private int idade;
    private String endereco;
    private char genero;

    public Cliente(String cpf, String nome, int idade, String endereco, char genero) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.genero = genero;
    }

       public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "cpf=" + cpf +
                ", nome=" + nome +
                ", idade=" + idade +
                ", endereco=" + endereco +
                ", genero=" + genero +
                '}';
    }
}
