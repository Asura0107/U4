package it.epicode.be.SIM;

public class Chiamata {
    private int durata;
    private String numerochiamato;

    public Chiamata(String numerochiamato, int durata){
        this.numerochiamato=numerochiamato;
        this.durata=durata;
    }

    public String getNumeroChiamato() {
       return numerochiamato;
    }

    public int getDurata() {
        return durata;
    }
}
