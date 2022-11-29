package models;

import generic.Aeromodelo;
import java.sql.PreparedStatement;
import DAO.DAO;

public class Helicoptero extends Aeromodelo{
    
    private String cor;
    private int capacidade;

    public Helicoptero() {

    }

    public Helicoptero(int id, String marca, String modelo, String cor, int capacidade) throws Exception {
        super(id, marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO helicoptero (id, marca, modelo, cor, capacidade) VALUES (?, ?, ?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, marca);
        stmt.setString(3, modelo);
        stmt.setString(4, cor);
        stmt.setInt(5, capacidade);
        stmt.execute();
        stmt.close();
    }

    public Helicoptero(String marca, String modelo, String cor, int capacidade) throws Exception {
        super(marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO helicoptero (marca, modelo, cor, capacidade) VALUES (?, ?, ?, ?);"
        );
        stmt.setString(1, marca);
        stmt.setString(2, modelo);
        stmt.setString(3, cor);
        stmt.setInt(4, capacidade);
        stmt.execute();
        stmt.close();
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "Helicoptero [id=" + getId() + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", cor=" + cor + ", capacidade=" + capacidade + "]";
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
        Helicoptero heli = (Helicoptero) obj;
        return heli.getId() == getId();
    }

    public void update() {

    }

    public void delete() {

    }

    public static Helicoptero getById(int id) {
        return new Helicoptero();
    }

}
