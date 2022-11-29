package models;

import java.sql.PreparedStatement;

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
        return super.toString() + this.prefixo + this.capacidade + this.idCompanhia + this.companhia;
    }

    public void update() {

    }

    public void delete() {

    }

    public static Aviao getById(int id) {
        return new Aviao();
    }
    
}