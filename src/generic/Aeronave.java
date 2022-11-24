package generic;

public abstract class Aeronave {
    
    private int id;
    private String marca;
    private String modelo;

    public Aeronave() {

    }

    public Aeronave(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca; 
        this.modelo = modelo;
    }

    public Aeronave(String marca, String modelo) {
        this.marca = marca; 
        this.modelo = modelo;
    } 

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return this.toString();
    }

    public boolean equals(Object obj) {
        return true;
    }
}
