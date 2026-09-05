package br.edu.faex.academico.model;

public class Professor {
    private Long id;
    private String nome;
    private String email;

    // Construtor vazio
    public Professor() {
    }

    // Construtor sem ID
    public Professor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Construtor com ID (O que corrige a linha vermelha no Main)
    public Professor(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}