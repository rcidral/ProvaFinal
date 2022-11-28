package models;

import generic.Aeromodelo;

public class Jato extends Aeromodelo{
    
    private String cor;
    private int velocidade;

    public Jato() {

    }

    public Jato(int id, String marca, String modelo, String cor, int velocidade) {
        super(id, marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public Jato(String marca, String modelo, String cor, int velocidade) {
        super(marca, modelo);
        this.cor = cor;
        this.velocidade = velocidade;
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

    public void update() {

    }

    public void delete() {

    }
}
