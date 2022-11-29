package models;

import java.sql.PreparedStatement;
import DAO.DAO;

public class Voo {
    
    private int id;
    private String numero;
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

    public Voo() {

    }

    public Voo(int id, String numero, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int idHelicoptero, Helicoptero helicoptero, int idJato, Jato jato, int idAviao, Aviao aviao) throws Exception {
        this.id = id;
        this.numero = numero;
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
        stmt.setString(2, numero);
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

    public Voo(String numero, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, char tipo, Pista pista, int idHelicoptero, Helicoptero helicoptero, int idJato, Jato jato, int idAviao, Aviao aviao) throws Exception {
        this.numero = numero;
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
            "INSERT INTO voo (numero, data, hora, origem, destino, piloto, copiloto, observacao, pista_id, helicoptero_id, jato_id, aviao_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);"
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
        stmt.setInt(13, idAviao);
        stmt.execute();
        stmt.close();
    }

    // ResultSet voo
    
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

    @Override
    public String toString() {
        return "Voo{" + "id=" + id + ", numero=" + numero + ", data=" + data + ", hora=" + hora + ", origem=" + origem + ", destino=" + destino + ", piloto=" + piloto + ", copiloto=" + copiloto + ", observacao=" + observacao + ", idPista=" + idPista + ", pista=" + pista + ", idHelicoptero=" + idHelicoptero + ", helicoptero=" + helicoptero + ", idJato=" + idJato + ", jato=" + jato + '}';
    }

    public void update() {

    }

    public void delete() {

    }
}