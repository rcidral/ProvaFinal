package models;

import generic.Aeromodelo;

public class Helicoptero extends Aeromodelo{
    
    private String cor;
    private int capacidade;

    public Helicoptero() {

    }

    public Helicoptero(int id, String marca, String modelo, String cor, int capacidade) {
        super(id, marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public Helicoptero(String marca, String modelo, String cor, int capacidade) {
        super(marca, modelo);
        this.cor = cor;
        this.capacidade = capacidade;
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

}
