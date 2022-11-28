package models;

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

    public Voo() {

    }

    public Voo(int id, String numero, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int idHelicoptero, Helicoptero helicoptero, int idJato, Jato jato) {
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
    }

    public Voo(String numero, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, Pista pista, int idHelicoptero, Helicoptero helicoptero, int idJato, Jato jato) {
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

    @Override
    public String toString() {
        return "Voo{" + "id=" + id + ", numero=" + numero + ", data=" + data + ", hora=" + hora + ", origem=" + origem + ", destino=" + destino + ", piloto=" + piloto + ", copiloto=" + copiloto + ", observacao=" + observacao + ", idPista=" + idPista + ", pista=" + pista + ", idHelicoptero=" + idHelicoptero + ", helicoptero=" + helicoptero + ", idJato=" + idJato + ", jato=" + jato + '}';
    }

    public void update() {

    }

    public void delete() {

    }
}
