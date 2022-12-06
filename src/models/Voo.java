package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

import DAO.DAO;
import generic.Aeromodelo;
import generic.Chave;

public class Voo {
    
    private int id;
    private Chave<String, Integer> numero;
    private String data;
    private String hora;
    private String origem;
    private String destino;
    private String piloto;
    private String copiloto;
    private String observacao;
    private int idPista;
    private Pista pista;
    private int idHelicoptero;
    private Helicoptero helicoptero;
    private int idJato;
    private Jato jato; 
    private int idAviao;
    private Aviao aviao;
    private int idAeromodelo;
    private Aeromodelo aeromodelo;

    public Voo() {

    }

    public Voo(int id, String numeroL, int numeroN, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int idHelicoptero, Helicoptero helicoptero, int idJato, Jato jato, int idAviao, Aviao aviao) throws Exception {
        this.id = id;
        this.numero = new Chave<String,Integer>(numeroL, numeroN);
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idPista = idPista;
        this.pista = pista;
        this.idHelicoptero = idHelicoptero;
        this.helicoptero = helicoptero;
        this.idJato = idJato;
        this.jato = jato;
        this.idAviao = idAviao;
        this.aviao = aviao;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO voo (id, numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
        );
        stmt.setInt(1, id);
        stmt.setString(2, numero.toString());
        stmt.setString(3, data);
        stmt.setString(4, hora);
        stmt.setString(5, origem);
        stmt.setString(6, destino);
        stmt.setString(7, piloto);
        stmt.setString(8, copiloto);
        stmt.setString(9, observacao);
        stmt.setInt(10, idPista);
        stmt.setInt(11, idHelicoptero);
        stmt.setInt(12, idJato);
        stmt.setInt(13, idAviao);
        stmt.execute();
        stmt.close();

    }

    public Voo(String numeroL, int numeroN, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int tipo, Aeromodelo aeromodelo, int idAeromodelo) throws Exception {
        this.numero = new Chave<String,Integer>(numeroL, numeroN);
        this.data = data;
        this.hora = hora;
        this.origem = origem;
        this.destino = destino;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.observacao = observacao;
        this.idPista = idPista;
        this.pista = pista;
        this.idAeromodelo = idAeromodelo;
        this.aeromodelo = Aeromodelo.getById(idAeromodelo);
        
        if (tipo == 1) {
            System.out.println(idAeromodelo);
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numero.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setInt(10, idAeromodelo);
            stmt.setNull(11, Types.NULL);
            stmt.setNull(12, Types.NULL);
            stmt.execute();
            stmt.close();
        } else if (tipo == 2) {
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numero.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setNull(10, Types.NULL);
            stmt.setInt(11, idAeromodelo);
            stmt.setNull(12, Types.NULL);
            stmt.execute();
            stmt.close();
        } else if (tipo == 3) {
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
            );
            stmt.setString(1, numero.toString());
            stmt.setString(2, data);
            stmt.setString(3, hora);
            stmt.setString(4, origem);
            stmt.setString(5, destino);
            stmt.setString(6, piloto);
            stmt.setString(7, copiloto);
            stmt.setString(8, observacao);
            stmt.setInt(9, idPista);
            stmt.setNull(10, Types.NULL);
            stmt.setNull(11, Types.NULL);
            stmt.setInt(12, idAeromodelo);
            stmt.execute();
            stmt.close();
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNumero(String numeroL, int numeroN) {
        this.numero = new Chave<String,Integer>(numeroL, numeroN);
    }

    public Chave<String, Integer> getNumero() {
        return numero;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setIdPista(int idPista) {
        this.idPista = idPista;
    }

    public int getIdPista() {
        return idPista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public Pista getPista() {
        return pista;
    }

    public void setIdHelicoptero(int idHelicoptero) {
        this.idHelicoptero = idHelicoptero;
    }

    public int getIdHelicoptero() {
        return idHelicoptero;
    }

    public void setHelicoptero(Helicoptero helicoptero) {
        this.helicoptero = helicoptero;
    }

    public Helicoptero getHelicoptero() {
        return helicoptero;
    }

    public void setIdJato(int idJato) {
        this.idJato = idJato;
    }

    public int getIdJato() {
        return idJato;
    }

    public void setJato(Jato jato) {
        this.jato = jato;
    }

    public Jato getJato() {
        return jato;
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

    public void setAeromodelo(Aeromodelo aeromodelo) {
        this.aeromodelo = aeromodelo;
    }

    public Aeromodelo getAeromodelo() {
        return aeromodelo;
    }

    public void setIdAeromodelo(int id) {
        this.idAeromodelo = id;
    }

    public int getIdAeromodelo() {
        return idAeromodelo;
    }

    @Override
    public String toString() {
        return "Voo{" + "id=" + id + ", numero=" + numero + ", data=" + data + ", hora=" + hora + ", origem=" + origem + ", destino=" + destino + ", piloto=" + piloto + ", copiloto=" + copiloto + ", observacao=" + observacao + ", idPista=" + idPista + ", pista=" + pista + ", idHelicoptero=" + idHelicoptero + ", helicoptero=" + helicoptero + ", idJato=" + idJato + ", jato=" + jato + ", idAviao=" + idAviao + ", aviao=" + aviao + '}';
    }

    public static void select() throws Exception {
        Connection select = DAO.createConnection();
        ResultSet rs = select.createStatement().executeQuery(
            "SELECT * FROM voo;"
        );
        while (rs.next()) { 
            System.out.println(
                "=======================================" + "\n" +
                "Id: " + 
                rs.getInt("id") + "\n" +
                "Numero: " +
                rs.getString("numero") + "\n" +
                "Data: " +
                rs.getString("data") + "\n" +
                "Hora: " +
                rs.getString("hora") + "\n" +
                "Origem: " +
                rs.getString("origem") + "\n" +
                "Destino: " +
                rs.getString("destino") + "\n" +
                "Piloto: " +
                rs.getString("piloto") + "\n" +
                "Copiloto: " +
                rs.getString("copiloto") + "\n" +
                "Observacao: " +
                rs.getString("observacao") + "\n" +
                "Id da pista: " +
                rs.getInt("pista_id") + "\n" +
                "Id do helicoptero: " + 
                (rs.getInt("helicoptero_id") > 0 ? Integer.toString(rs.getInt("helicoptero_id")) : "") + "\n" +
                "Id do jato: " +
                (rs.getInt("jato_id") > 0 ? Integer.toString(rs.getInt("jato_id")) : "") + "\n" +
                "Id do aviao: " +
                (rs.getInt("aviao_id") > 0 ? Integer.toString(rs.getInt("aviao_id")) : "") + "\n" +
                "======================================="
            );
        }
        select.close();
    }

    public static void update(int id, String numero, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int idHelicoptero, Helicoptero helicoptero, int idJato, Jato jato, int idAviao, Aviao aviao) throws Exception {
        Connection update = DAO.createConnection();
        PreparedStatement stmt = update.prepareStatement(
            "UPDATE voo SET numero = ?, data = ?, hora = ?, origem = ?, destino = ?, piloto = ?, copiloto = ?, observacao = ?, pista_id = ?, helicoptero_id = ?, jato_id = ?, aviao_id = ? WHERE id = ?;"
        );
        stmt.setString(1, numero);
        stmt.setString(2, data);
        stmt.setString(3, hora);
        stmt.setString(4, origem);
        stmt.setString(5, destino);
        stmt.setString(6, piloto);
        stmt.setString(7, copiloto);
        stmt.setString(8, observacao);
        stmt.setInt(9, idPista);
        stmt.setInt(10, idHelicoptero);
        stmt.setInt(11, idJato);
        stmt.setInt(12, idAviao);
        stmt.setInt(13, id);
        stmt.execute();
        stmt.close();
        update.close();
    }

    public static void delete(int id) throws Exception {
        Connection delete = DAO.createConnection();
        PreparedStatement stmt = delete.prepareStatement(
            "DELETE FROM voo WHERE id = ?;"
        );
        stmt.setInt(1, id);
        stmt.execute();
        stmt.close();
        delete.close();
    }
}
