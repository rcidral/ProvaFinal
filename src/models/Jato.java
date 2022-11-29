package models;

import generic.Aeromodelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DAO.DAO;

public class Jato extends Aeromodelo{
    
    private String cor;
    private int velocidade;

    public Jato() {

    }

    public Jato(int id, String marca, String modelo, String cor, int velocidade) throws Exception {
        super(id, marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO jato (id, marca, modelo, cor, velocidade) VALUES (?, ?, ?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, marca);
        stmt.setString(3, modelo);
        stmt.setString(4, cor);
        stmt.setInt(5, velocidade);
        stmt.execute();
        stmt.close();
    }

    public Jato(String marca, String modelo, String cor, int velocidade) throws Exception {
        super(marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO jato (marca, modelo, cor, velocidade) VALUES (?, ?, ?, ?);"
        );
        stmt.setString(1, marca);
        stmt.setString(2, modelo);
        stmt.setString(3, cor);
        stmt.setInt(4, velocidade);
        stmt.execute();
        stmt.close();
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public String toString() {
        return "Jato [id=" + getId() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", cor=" + cor + ", velocidade=" + velocidade + "]";
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
        Jato jato = (Jato) obj;
        return jato.getId() == getId();
    }

    public static void select() throws Exception {
        Connection select = DAO.createConnection();
        ResultSet rs = select.createStatement().executeQuery(
            "SELECT * FROM jato;"
        );
        while (rs.next()) {
            System.out.println(
                "=======================================" + "\n" +
                "Id: " + 
                rs.getInt("id") + "\n" +
                "Marca: " +
                rs.getString("marca") + "\n" +
                "Modelo: " +
                rs.getString("modelo") + "\n" +
                "Cor: " +
                rs.getString("cor") + "\n" +
                "Velocidade: " +
                rs.getInt("velocidade") + "\n" +
                "======================================="
            );
        }
        select.close();
    }

    public void update() {

    }

    public void delete() {

    }

    public static Jato getById(int id) {
        return new Jato();
    }
}
