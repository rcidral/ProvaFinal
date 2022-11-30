package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DAO.DAO;
import generic.Chave;

public class Pista {
    
    private int id;
    private Chave<Character, Integer> numero;

    public Pista() {

    }

    public Pista(int id, Character numeroL, int numeroN) throws Exception {
        this.id = id;
        this.numero = new Chave<Character,Integer>(numeroL, numeroN);

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (id, numero) VALUES (?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, numero.toString());
        stmt.execute();
        stmt.close();
    }

    public Pista(Character numeroL, int numeroN) throws Exception {
        this.numero = new Chave<Character,Integer>(numeroL, numeroN);

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO pista (numero) VALUES (?);"
        );
        stmt.setString(1, numero.toString());
        stmt.execute();
        stmt.close();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumero(Character numeroL, int numeroN) {
        this.numero = new Chave<Character,Integer>(numeroL, numeroN);
    }

    public Chave<Character,Integer> getNumero() {
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

    public static void select() throws Exception {
        Connection select = DAO.createConnection();
        ResultSet rs = select.createStatement().executeQuery(
            "SELECT * FROM pista;"
        );    
        while (rs.next()) {
            System.out.println(
                "=======================================" + "\n" +
                "Id: " + 
                rs.getInt("id") + "\n" +
                "Numero: " +  
                rs.getString("numero") + "\n" + 
                "=======================================");
        }
    }

    public static void update(int id, String numero) throws Exception {
        Connection update = DAO.createConnection();
        PreparedStatement stmt = update.prepareStatement(
            "UPDATE pista SET numero = ? WHERE id = ?;"
        );
        stmt.setString(1, numero);
        stmt.setInt(2, id);
        stmt.execute();
        stmt.close();
        update.close();
    }
    
    public static void delete(int id) throws Exception {
        Connection delete = DAO.createConnection();
        PreparedStatement stmt = delete.prepareStatement(
            "DELETE FROM pista WHERE id = ?;"
        );
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        delete.close();
    }

    public static Pista getById(int id) {
        return new Pista();
    }
}
