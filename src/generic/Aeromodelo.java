package generic;

public abstract class Aeromodelo {
    
    private int id;
    protected String marca;
    private String modelo;

    public Aeromodelo() {

    }

    public Aeromodelo(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca; 
        this.modelo = modelo;
    }

    public Aeromodelo(String marca, String modelo) {
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
        return "Aeronave [id=" + id + ", marca=" + marca + ", modelo=" + modelo + "]";
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
        Aeromodelo aeronave = (Aeromodelo) obj;
        return aeronave.getId() == getId();
    }
}
