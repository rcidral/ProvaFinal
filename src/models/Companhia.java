package models;

import generic.*;

public abstract class Companhia implements Database{
    
    private int id;
    private String nome;
    private String cnpj;

    public Companhia() {

    }

    public Companhia(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome; 
        this.cnpj = cnpj;
    }

    public Companhia(String nome, String cnpj) {
        this.nome = nome; 
        this.cnpj = cnpj;
    } 

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "Companhia [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + "]";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Companhia c = (Companhia) obj;
        return c.getId() == this.getId();
    }

    public static Companhia getById(int id) {
        return new Companhia();
    }

    public void update() {

    }

    public void delete() {

    }
}
