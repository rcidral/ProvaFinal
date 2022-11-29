package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DAO.DAO;
import generic.*;

public class Companhia implements Database{
    
    private int id;
    private String nome;
    private String cnpj;

    public Companhia() {

    }

    public Companhia(int id, String nome, String cnpj) throws Exception {
        this.id = id;
        this.nome = nome; 
        this.cnpj = cnpj;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO companhia (id, nome, cnpj) VALUES (?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, nome);
        stmt.setString(3, cnpj);
        stmt.execute();
        stmt.close();
    }

    public Companhia(String nome, String cnpj) throws Exception {
        this.nome = nome; 
        this.cnpj = cnpj;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO companhia (nome, cnpj) VALUES (?, ?);"
        );
        stmt.setString(1, nome);
        stmt.setString(2, cnpj);
        stmt.execute();
        stmt.close();
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

    public static void select() throws Exception {
        Connection select = DAO.createConnection();
        ResultSet rs = select.createStatement().executeQuery(
            "SELECT * FROM companhia;"
        );
        while (rs.next()) {
            System.out.println(
                "=======================================" + "\n" +
                "Id: " + 
                rs.getInt("id") + "\n" +
                "Nome: " +
                rs.getString("nome") + "\n" +
                "CNPJ: " +
                rs.getString("cnpj") + "\n" +
                "======================================="
            );
        }
        select.close();
    }

    public void update(int id) {

    }

    public void delete(int id) {

    }
}
