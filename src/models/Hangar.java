package models;

public class Hangar {
    
    private int id;
    private String local;
    private int idAviao;
    private Aviao aviao;

    public Hangar() {

    }

    public Hangar(int id, String local, int idAviao, Aviao aviao) {
        this.id = id;
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = Aviao.getById(idAviao);
    }

    public Hangar(String local, int idAviao, Aviao aviao) {
        this.local = local;
        this.idAviao = idAviao;
        this.aviao = aviao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
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
        return "Hangar [id=" + id + ", local=" + local + ", idAviao=" + idAviao + ", aviao=" + aviao + "]";
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
        Hangar h = (Hangar) obj;
        return h.getId() == this.getId();
    }

    public void update() {

    }

    public void delete() {

    }
}
