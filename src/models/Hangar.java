package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DAO.DAO;

public class Hangar {
    
    private int id;
    private String local;
    private int idAviao;
    private Aviao aviao;

    public Hangar() {

    }

    public Hangar(int id, String local, int idAviao, Aviao aviao) throws Exception {
        this.id = id;
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = Aviao.getById(idAviao);

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO hangar (id, local, aviao_id) VALUES (?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, local);
        stmt.setInt(3, idAviao);
        stmt.execute();
        stmt.close();
    }

    public Hangar(String local, int idAviao, Aviao aviao) throws Exception {
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = aviao;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO hangar (local, aviao_id) VALUES (?, ?);"
        );
        stmt.setString(1, local);
        stmt.setInt(2, idAviao);
        stmt.execute();
        stmt.close();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setIdAviao(int idAviao) {
        this.idAviao = idAviao;
    }

    public int getIdAviao() {
        return idAviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Aviao getAviao() {
        return aviao;
    }

    @Override
    public String toString() {
        return "Hangar [id=" + id + ", local=" + local + ", idAviao=" + idAviao + ", aviao=" + aviao + "]";
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
        Hangar h = (Hangar) obj;
        return h.getId() == this.getId();
    }

    public static void select() throws Exception {
        Connection select = DAO.createConnection();
        ResultSet rs = select.createStatement().executeQuery(
            "SELECT * FROM hangar;"
        );
        while (rs.next()) {
            System.out.println(
                "=======================================" + "\n" +
                "Id: " + 
                rs.getInt("id") + "\n" +
                "Local: " +
                rs.getString("local") + "\n" +
                "Aviao: " +
                rs.getInt("aviao_id") + "\n" +
                "======================================="
            );
        }
        select.close();
    }

    public static Hangar getById(int id) {
        return new Hangar();
    }

    public void update() {

    }

    public static void delete(int id) throws Exception {
        Connection delete = DAO.createConnection();
        PreparedStatement stmt = delete.prepareStatement(
            "DELETE FROM hangar WHERE id = ?;"
        );
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        delete.close();
    }
}
