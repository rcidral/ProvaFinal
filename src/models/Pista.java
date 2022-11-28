package models;

import generic.*;

public abstract class Pista implements Database{
    
    private int id;
    private String numero;

    public Pista() {

    }

    public Pista(int id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public Pista(String numero) {
        this.numero = numero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Pista [id=" + id + ", numero=" + numero + "]";
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
        Pista p = (Pista) obj;
        return p.getId() == this.getId();
    }
}
