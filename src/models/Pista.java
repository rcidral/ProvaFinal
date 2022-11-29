package models;

import generic.*;
import java.sql.PreparedStatement;
import DAO.DAO;

public class Pista implements Database{
    
    private int id;
    private String numero;

    public Pista() {

    }

    public Pista(int id, String numero) throws Exception {
        this.id = id;
        this.numero = numero;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (id, numero) VALUES (?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, numero);
        stmt.execute();
        stmt.close();
    }

    public Pista(String numero) throws Exception {
        this.numero = numero;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (numero) VALUES (?);"
        );
        stmt.setString(1, numero);
        stmt.execute();
        stmt.close();
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

    public void update() {

    }
    public void delete() {

    }

    public static Pista getById(int id) {
        return new Pista();
    }
}
