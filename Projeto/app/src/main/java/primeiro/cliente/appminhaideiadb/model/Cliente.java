package primeiro.cliente.appminhaideiadb.model;

import primeiro.cliente.appminhaideiadb.controller.iCrud;

public class Cliente {

    private int id; // Representa a chave primaria(PK)
    private String nome;
    private String email;

    public Cliente() {
    }

    public Cliente(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
