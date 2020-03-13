package br.edu.ifsp.arq.dmos5_2020s1.cadastraalunos.model;

public class Aluno {
    private int prontuario;
    private String nome;

    public Aluno(int prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
    }

    public int getProntuario() {
        return prontuario;
    }

    public void setProntuario(int prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
