package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DAO.*;
import generic.*;


public class Aviao extends Aeromodelo{

    private String prefixo;
    private int capacidade;
    private Companhia companhia;
    private int idCompanhia;

    public Aviao() {

    }

    public Aviao(int id, String marca, String modelo, String prefixo, int capacidade, Companhia companhia, int idCompanhia) throws Exception {
        super(id, marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.companhia = Companhia.getById(idCompanhia);
        this.idCompanhia = idCompanhia;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO aviao (id, marca, modelo, prefixo, capacidade, companhia_id) VALUES (?, ?, ?, ?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, marca);
        stmt.setString(3, modelo);
        stmt.setString(4, prefixo);
        stmt.setInt(5, capacidade);
        stmt.setInt(6, idCompanhia);
        stmt.execute();
        stmt.close();
    }

    public Aviao(String marca, String modelo, String prefixo, int capacidade, Companhia companhia, int idCompanhia) throws Exception {
        super(marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.companhia = companhia;
        this.idCompanhia = idCompanhia;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO aviao (marca, modelo, prefixo, capacidade, companhia_id) VALUES (?, ?, ?, ?, ?);"
        );
        stmt.setString(1, marca);
        stmt.setString(2, modelo);
        stmt.setString(3, prefixo);
        stmt.setInt(4, capacidade);
        stmt.setInt(5, idCompanhia);
        stmt.execute();
        stmt.close();
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setIdCompanhia(int idCompanhia) {
        this.idCompanhia = idCompanhia;
    }

    public int getIdCompanhia() {
        return idCompanhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    @Override
    public String toString() {
        return "Aviao [capacidade=" + capacidade + ", companhia=" + companhia + ", idCompanhia=" + idCompanhia
                + ", prefixo=" + prefixo + "]";
    }

    public static void select() throws Exception {
        Connection select = DAO.createConnection();
        ResultSet rs = select.createStatement().executeQuery(
            "SELECT * FROM aviao;"
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
                "Prefixo: " +
                rs.getString("prefixo") + "\n" +
                "Capacidade: " +
                rs.getInt("capacidade") + "\n" +
                "Id da companhia: " +
                rs.getInt("companhia_id") + "\n" +
                "======================================="
            );
        }
        select.close();
    }

    public void update() {

    }

    public void delete() {

    }

    public static Aviao getById(int id) {
        return new Aviao();
    }
    
}
