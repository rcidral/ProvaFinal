package generic;

public abstract class Aeronaves {
    
    private int id;
    private String marca;
    private String modelo;

    public Aeronaves() {

    }

    public Aeronaves(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca; 
        this.modelo = modelo;
    }

    public Aeronaves(String marca, String modelo) {
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

    public String getModleo() {
        return modelo;
    }
}
