package models;

import generic.*;


public class Aviao extends Aeromodelo{

    private String prefixo;
    private int capacidade;
    private Companhia companhia;
    private int idCompanhia;

    public Aviao() {

    }

    public Aviao(int id, String marca, String modelo, String prefixo, int capacidade, Companhia companhia, int idCompanhia) {
        super(id, marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.companhia = Companhia.getById(idCompanhia);
        this.idCompanhia = idCompanhia;
    }

    public Aviao(String marca, String modelo, String prefixo, int capacidade, Companhia companhia, int idCompanhia) {
        super(marca, modelo);
        this.prefixo = prefixo;
        this.capacidade = capacidade;
        this.companhia = companhia;
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
