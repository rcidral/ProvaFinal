package generic;

public class Companhia {
    
    private int id;
    private String nome;
    private String cnpj;

    public Companhia() {

    }

    public Companhia(int id, String nome, String cnpj) {
        this.id = id;
        this.nome = nome; 
        this.cnpj = cnpj;
    }

    public Companhia(String nome, String cnpj) {
        this.nome = nome; 
        this.cnpj = cnpj;
    } 

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return this.toString();
    }

    public boolean equals(Object obj) {
        return true;
    }

    public void update() {

    }

    public void delete() {

    }

    public static Companhia getById(int id) {
        return new Companhia();
    }
}
