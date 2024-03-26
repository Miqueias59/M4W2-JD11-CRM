package org.example;

public class Cliente {
    private String cpf;
    private String nome;
    private String idade;
    private String endereco;

    public Cliente(.String cpf, String nome, String idade, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public java.lang.String getCpf() {
        return cpf;
    }

    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getIdade() {
        return idade;
    }

    public void setIdade(java.lang.String idade) {
        this.idade = idade;
    }

    public java.lang.String getEndereco() {
        return endereco;
    }

    public void setEndereco(java.lang.String endereco) {
        this.endereco = endereco;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente{" +
                "cpf=" + cpf +
                ", nome=" + nome +
                ", idade=" + idade +
                ", endereco=" + endereco +
                '}';
    }
}
